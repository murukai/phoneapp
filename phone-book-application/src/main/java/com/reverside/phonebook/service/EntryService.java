package com.reverside.phonebook.service;

import com.reverside.phonebook.repository.EntryRepository;

public class EntryService {
	
	private EntryRepository entryRepository;
	
	public EntryService(EntryRepository entryRepository) {
		this.entryRepository = entryRepository;
	}
	
	
}
