package com.reverside.phonebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reverside.phonebook.exception.ResourceNotFoundException;
import com.reverside.phonebook.model.Entry;
import com.reverside.phonebook.model.PhoneBook;
import com.reverside.phonebook.repository.EntryRepository;
import com.reverside.phonebook.repository.PhoneBookRepository;

@Service
public class PhoneBookRestService {
	@Autowired
    private PhoneBookRepository phoneBookRepository;

    @Autowired
    private EntryRepository entryRepository;

    
    public List<PhoneBook> listPhoneBooks(){
        return phoneBookRepository.findAll();
    }

    
    public PhoneBook addPhoneBook(PhoneBook phoneBook){
        return phoneBookRepository.save(phoneBook);
    }

    
    public PhoneBook updatePhoneBook(PhoneBook phoneBook){
        return phoneBookRepository.save(phoneBook);
    }

    
    public void deletePhoneBook(Long bookId){
        entryRepository.deleteByPhoneBookId(bookId);
        phoneBookRepository.deleteById(bookId);
    }

    
    public List<Entry> getEntries(Long bookId){
        return entryRepository.findByPhoneBookId(bookId)
                .orElseThrow(() -> new ResourceNotFoundException("Entries", "id", bookId));
    }

    
    public Entry addPhoneBookEntry(Entry entry){
        return entryRepository
                .save(entry);
    }

    
    public Entry updateBookEntry(Entry entry){

        return entryRepository.save(entry);
    }

    
    public void deletePhoneBookEntry(Long bookId,Long entryId){
        entryRepository
                .findById(entryId)
                .orElseThrow(() -> new ResourceNotFoundException("Entry", "id", entryId));
        entryRepository.deleteById(entryId);
    }
    
    
    public List<Entry> findByName(String name){
    	return entryRepository.findByNameLike(name)
    			.orElseThrow(()-> new ResourceNotFoundException("List of Entries", "name", name));
    }
  
    public List<Entry> findByPhoneNumber(String phoneNumber){
    	return entryRepository.findByPhoneNumberLike(phoneNumber)
    			.orElseThrow(()-> new ResourceNotFoundException("List of Entries", "name", phoneNumber));
    }
}
