package com.lucasnunes.webservices.repositories;

import com.lucasnunes.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
