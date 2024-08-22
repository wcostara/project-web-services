package com.costara.project_dikaion.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.costara.project_dikaion.entities.User;
import com.costara.project_dikaion.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Bethy White", "bethy@gmail.com", "8888-8888", "54321");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "7777-7777", "98745");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
