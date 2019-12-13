package com.gaurav.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gaurav.jpa.entity.User;
import com.gaurav.jpa.service.UserRepository;
import com.gaurav.jpa.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User fingon = new User("Fingon", "High King of Noldor");
		
		log.info("Trying to insert User: {}", fingon);
		User savedUserFingon = userRepository.save(fingon);
		log.info("User inserted with Id: {}", savedUserFingon.getId());
		
	}

}
