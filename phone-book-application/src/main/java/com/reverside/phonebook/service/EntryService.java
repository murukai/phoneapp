package com.reverside.phonebook.service;

import java.util.List;
import java.util.Optional;

import com.reverside.phonebook.model.Entry;
import com.reverside.phonebook.repository.EntryRepository;

public class EntryService {
	
	private EntryRepository entryRepository;
	
	public EntryService(EntryRepository entryRepository) {
		this.entryRepository = entryRepository;
	}

	public Optional<List<Entry>> findByPhoneBookId(Long phoneBookId) {
		return entryRepository.findByPhoneBookId(phoneBookId);
	}

	public Optional<Entry> findById(Long id) {
		return entryRepository.findById(id);
	}

	public void save(Entry entry) {
		entryRepository.save(entry);
	}

	public void delete(Entry entry) {
		entryRepository.delete(entry);
	}

	public Optional<List<Entry>> findByNameLike(String name) {
		return entryRepository.findByNameLike(name);
	}

	public Optional<List<Entry>> findByPhoneNumberLike(String phoneNumber) {
		return entryRepository.findByPhoneNumberLike(phoneNumber);
	}
	
	
}
