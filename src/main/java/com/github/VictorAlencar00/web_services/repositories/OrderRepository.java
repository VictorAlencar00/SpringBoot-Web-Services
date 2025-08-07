package com.github.VictorAlencar00.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.VictorAlencar00.web_services.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
