package com.reverside.phonebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.reverside.phonebook.model.PhoneBook;
import com.reverside.phonebook.repository.EntryRepository;
import com.reverside.phonebook.repository.PhoneBookRepository;

@Service
public class PhoneBookService {
	private PhoneBookRepository phoneBookRepository;
	private EntryRepository entryRepository;
	
	@Autowired
	public PhoneBookService(PhoneBookRepository phoneBookRepository, EntryRepository entryRepository) {
		super();
		this.phoneBookRepository = phoneBookRepository;
		this.entryRepository = entryRepository;
	}
	
	public Page<PhoneBook> findAll(Pageable page){
		return phoneBookRepository.findAll(page);
	}
	
	
	
}
