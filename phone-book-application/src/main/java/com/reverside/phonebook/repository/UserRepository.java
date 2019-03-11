package com.reverside.phonebook.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reverside.phonebook.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
}
