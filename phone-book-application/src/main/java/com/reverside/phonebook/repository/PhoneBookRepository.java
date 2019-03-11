package com.reverside.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reverside.phonebook.model.PhoneBook;

public interface PhoneBookRepository extends JpaRepository<PhoneBook, Long> {
}
