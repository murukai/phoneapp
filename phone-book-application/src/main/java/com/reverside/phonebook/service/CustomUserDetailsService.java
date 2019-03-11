package com.reverside.phonebook.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.reverside.phonebook.model.CustomUserDetails;
import com.reverside.phonebook.model.User;
import com.reverside.phonebook.repository.UserRepository;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService{

	private UserRepository userRepository; 
	
	@Autowired
	public CustomUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionalUser = userRepository.findByUsername(username);
		optionalUser
			.orElseThrow(() -> new UsernameNotFoundException("Username not found"));
		return optionalUser
				.map(CustomUserDetails :: new).get();
		
	}

}
