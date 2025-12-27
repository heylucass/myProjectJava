package main;

import java.util.Scanner;

public class start {
	
	public static void main(String[] args) {
		// Tipos Primitivos de Inteiros
		byte bytes = 0110; // 8 bits
		short curto = 01500; // 16 bits
		int inteiro = 12502330; // 32 bits
		long longo = 824212003; // 64 bits
		
		// Representar numeros de bases diferentes
		int decimal = 81923; // Inicia com 1 a 9(Base 10)
		int octal = 034200; // Inicia com 0 e os numeros seguintes devem ser entre 0 e 7(Base 8)
		int hexadecimal = 0xFF; // Inicia com 0x e os os digitos a seguir são de 0 a 9 e de A a F;(Base 16)
		int binario = 0b100; // Inicia com 0b e os numero a seguir são 0 e 1(Base 2)
		
		// Tipos Primitivos de ponto flutuante
		float flutuante = 2.42F; // 32 bits
		double dobro = 57.123; // 64 bits
		
		// Outros tipos primitivos
		boolean booleano = true; // True ou False
		char caractere = 's';
		
		// Tipos não-primitivos
		String palavra = "Palavra";
		int[] numeros = {5, 6, 7, 1, 0}; // Array de inteiros
		String[] str = {"P","e","R","as"}; // Array de Strings
		
		// Classes Wrappers
		Boolean bool = false;
		Integer novoInteiro = 245012;
		Short novoCurto = 12500;
		Byte novoByte = 123;
		
		
		System.out.println("Hello World!");
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int number = scn.nextInt();
		System.out.println("O numero digitado foi:" + number);
		scn.close();
	}
}
