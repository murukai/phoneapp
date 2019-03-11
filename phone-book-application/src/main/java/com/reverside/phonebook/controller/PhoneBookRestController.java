package com.reverside.phonebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reverside.phonebook.model.Entry;
import com.reverside.phonebook.model.PhoneBook;
import com.reverside.phonebook.service.PhoneBookRestService;

/**
 * Created by mumu on 17/2/2019.
 */
@CrossOrigin(origins= "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PhoneBookRestController {
   
    @Autowired
    private PhoneBookRestService service;

    @GetMapping("/phone-books")
    @ResponseBody
    public List<PhoneBook> listPhoneBooks(){
        return service.listPhoneBooks();
    }

    @PostMapping("/phone-books")
    @ResponseBody
    public PhoneBook addPhoneBook(@RequestBody PhoneBook phoneBook){
        return service.addPhoneBook(phoneBook);
    }

    @PutMapping("/phone-books")
    @ResponseBody
    public PhoneBook updatePhoneBook(@RequestBody PhoneBook phoneBook){
        return service.updatePhoneBook(phoneBook);
    }

    @DeleteMapping("/phone-books/{bookId}")
    public void deletePhoneBook(@PathVariable Long bookId){
        service.deletePhoneBook(bookId);
    }

    @GetMapping("/phone-books/{bookId}/entries")
    @ResponseBody
    public List<Entry> getEntries(@PathVariable Long bookId){
        return service.getEntries(bookId);
    }

    @PostMapping("/phone-books/entries")
    @ResponseBody
    public Entry addPhoneBookEntry(@RequestBody Entry entry){
        return service.addPhoneBookEntry(entry);
    }

    @PutMapping("/phone-books/entries")
    @ResponseBody
    public Entry updateBookEntry(@RequestBody Entry entry){

        return service.updateBookEntry(entry);
    }

    @DeleteMapping("/phone-books/entries/{entryId}")
    public void deletePhoneBookEntry(@PathVariable Long bookId, @PathVariable Long entryId){
        service.deletePhoneBookEntry(bookId, entryId);
    }
    
    @GetMapping("/phone-books/search/{name}/byname")
    public List<Entry> findByName(String name){
    	return service.findByName(name);
    }
    
    @GetMapping("/phone-books/search/{name}/byPhoneNumber")
    public List<Entry> findByPhoneNumber(String phoneNumber){
    	return service.findByPhoneNumber(phoneNumber);
    }
}
