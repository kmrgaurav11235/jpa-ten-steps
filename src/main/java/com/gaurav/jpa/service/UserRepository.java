package com.gaurav.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.jpa.entity.User;

/*
 *  Instead of creating a bunch of Service classes like UserService for each Entity,
 *  we can just create interfaces extending JpaRepository. The implementation will
 *  be provided automatically. <T, R> -> <Class, Its Primary Key type>
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
