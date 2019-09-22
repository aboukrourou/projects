package com.boraji.tutorial.spring.config;

import java.util.List;

public class Contact {

	private List<User> names;
	private List<User> adresses;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public List<User> getNames() {
		return names;
	}

	public void setNames(List<User> names) {
		this.names = names;
	}

	public List<User> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<User> adresses) {
		this.adresses = adresses;
	}
	
}
