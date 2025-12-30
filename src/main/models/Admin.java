package main.models;

public class Admin extends Person {
	
	public Admin(String name, String email) {
		super(name, email);
		// TODO Auto-generated constructor stub
	}

	private String tier;

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

}
