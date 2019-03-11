package com.reverside.phonebook.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.reverside.phonebook.model.PhoneBook;
import com.reverside.phonebook.repository.PhoneBookRepository;

@Service
public class PhoneBookService {
	private PhoneBookRepository phoneBookRepository;
	
	@Autowired
	public PhoneBookService(PhoneBookRepository phoneBookRepository) {
		this.phoneBookRepository = phoneBookRepository;
	}
	
	public Page<PhoneBook> findAll(Pageable page){
		return phoneBookRepository.findAll(page);
	}

	public void save(PhoneBook phoneBook) {
		phoneBookRepository.save(phoneBook);
	}

	public Optional<PhoneBook> findById(Long id) {
		return phoneBookRepository.findById(id);
	}

	public PhoneBook getOne(Long phoneBookId) {		
		return phoneBookRepository.getOne(phoneBookId);
	}

	public void delete(PhoneBook phoneBook) {
		phoneBookRepository.delete(phoneBook);
	}
	
}
