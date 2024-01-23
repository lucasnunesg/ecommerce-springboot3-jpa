package com.lucasnunes.webservices.repositories;

import com.lucasnunes.webservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
