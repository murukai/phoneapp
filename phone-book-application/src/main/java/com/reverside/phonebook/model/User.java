package com.reverside.phonebook.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by mumu on 14/2/2019.
 */
@Entity
@Table(name="users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String gender;
    @Column(name = "date_of_birth")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Email
    @Column(nullable=false, unique=true, length=100)
    private String username;
    @Column(nullable=false, unique=true, length=100)
    private String password;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="user_role",
            joinColumns = {@JoinColumn(name = "USER_ID",
            referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "ROLE_ID",
            referencedColumnName = "ID")})
    private List<Role> roles;
    
    private boolean active;

    public User(){

    }
    
    

	public User(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.surname = user.getUsername();
		this.gender = user.getGender();
		this.dateOfBirth = user.getDateOfBirth();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.roles = user.getRoles();
		this.active = user.isActive();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
