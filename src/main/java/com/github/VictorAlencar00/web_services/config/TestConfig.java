package com.github.VictorAlencar00.web_services.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.VictorAlencar00.web_services.entities.User;
import com.github.VictorAlencar00.web_services.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Victor Alencar", "victordesousaa@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Jeferson Silva", "jeferson@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
