package com.reverside.phonebook.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.reverside.phonebook.model.Entry;


public interface EntryRepository extends JpaRepository<Entry, Long> {
	List<Entry> findByPhoneNumber(String phoneNumber);
	List<Entry> findByName(String name);
	List<Entry> findByCreated(Date created);
	Optional<List<Entry>> findByPhoneBookId(Long phoneBookId);
	Page<Entry> findByPhoneBookId(Long id, Pageable page);
	void deleteByPhoneBookId(Long phoneBookId);
	Optional<List<Entry>> findByNameLike(String name);
	Optional<List<Entry>> findByPhoneNumberLike(String phoneNumber);
}
