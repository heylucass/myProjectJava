package main;

import java.util.Scanner;

public class start {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int number = scn.nextInt();
		System.out.println("O numero digitado foi:" + number);
	}
}
