package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class start {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual seu nome");
		System.out.println(nome);
		
		System.out.println("Hello World!");
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String name = scn.nextLine();
		System.out.println(name);
		
		System.out.println("Digite sua idade: ");
		Integer age = scn.nextInt();
		System.out.println(age);
		
		scn.nextLine();
		
		System.out.println("Digite seu endereço: ");
		String address = scn.nextLine();
		System.out.println(address);
			
		System.out.println("Digite seu email: ");
		String email = scn.nextLine();
		
		Person novaPessoa = new Person(name, age, address, email);
		
		System.out.println("Nova pessoa cadastrada: " + novaPessoa.getName());
		System.out.println("Idade: " + novaPessoa.getAge());
		System.out.println("Endereço: " + novaPessoa.getAddress());
		System.out.println("Email: " + novaPessoa.getEmail());
		scn.close();
	}
}
