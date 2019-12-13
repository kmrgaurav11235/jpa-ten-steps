package com.gaurav.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
// Entity needs a no-arg constructor
@Getter
@Setter
@ToString
@Entity
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;

	public  User(String name, String role) {
		// Since id is auto-generated, we don't need that in this Constructor
		this.name = name;
		this.role = role;		
	}
}
