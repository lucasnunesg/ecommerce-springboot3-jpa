package com.lucasnunes.webservices.repositories;

import com.lucasnunes.webservices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
