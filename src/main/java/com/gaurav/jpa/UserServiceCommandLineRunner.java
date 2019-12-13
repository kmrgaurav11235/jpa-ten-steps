package com.gaurav.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gaurav.jpa.entity.User;
import com.gaurav.jpa.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserServiceCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	@Override
	public void run(String... args) throws Exception {
		User fingolfin = new User("Fingolfin", "High King of Noldor");
		
		log.info("Trying to insert User: {}", fingolfin);
		long insertedId = userService.insert(fingolfin);
		log.info("User inserted with Id: {}", insertedId);
		
	}

}
