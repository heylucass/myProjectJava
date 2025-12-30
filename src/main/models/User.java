package main.models;

import java.util.List;

public class User extends Person {

	
	public User(String name, String email) {
		super(name, email);
		// TODO Auto-generated constructor stub
	}

	private List<String> preferences[];

	public List<String>[] getPreferences() {
		return preferences;
	}

	public void setPreferences(List<String> preferences[]) {
		this.preferences = preferences;
	}
	
}
