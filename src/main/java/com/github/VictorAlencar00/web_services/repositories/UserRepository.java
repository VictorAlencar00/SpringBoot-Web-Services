package com.github.VictorAlencar00.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.VictorAlencar00.web_services.entities.User;

public interface  UserRepository extends JpaRepository<User, Long> {

}
