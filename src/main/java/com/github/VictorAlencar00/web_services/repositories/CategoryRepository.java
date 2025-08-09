package com.github.VictorAlencar00.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.VictorAlencar00.web_services.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
