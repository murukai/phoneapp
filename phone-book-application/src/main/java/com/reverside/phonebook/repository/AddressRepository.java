package com.reverside.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reverside.phonebook.model.Address;

public interface AddressRepository extends JpaRepository<Address ,Long>{
}
