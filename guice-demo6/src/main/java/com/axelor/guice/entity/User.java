package com.axelor.guice.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
@Table
public class User {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public User() {
		super();
	}

	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "user_name")
	private String username;
	@Column(name = "password")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public User(String firstName, String lastName, String username, String password) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
}
