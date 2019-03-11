package com.reverside.phonebook.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails extends User implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	

	public CustomUserDetails() {
		super();
	}

	public CustomUserDetails(User user) {
		super(user);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		String[] roles = getRoles()
				.stream()
				.map(role -> role.getRole())
				.toArray(String[] :: new);
		Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(roles);
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return isActive();
	}

	@Override
	public boolean isAccountNonLocked() {
		return isActive();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return isActive();
	}

	@Override
	public boolean isEnabled() {
		return isActive();
	}

}
