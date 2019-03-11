package com.reverside.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reverside.phonebook.model.Link;

public interface LinkRepository extends JpaRepository<Link, Long>{
}
