package main.models;

public abstract class Person {
	private String name;
	private Integer age;
	private String address;
	private String email;
	private Boolean isOnline; 
	
	// Metodo Construtor
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	// Metodos Getters e Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
}
