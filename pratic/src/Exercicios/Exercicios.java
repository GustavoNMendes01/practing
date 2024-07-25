package Exercicios;
//Exercicio1

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

//Entrada: 5 e 6.
//Saída : Soma = 11.

import java.util.Scanner;

public class Exercicios{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		
		System.out.println("A Soma dos dois números é:" + soma);
		
		sc.close();
		
		
	}
}
		
		

		
		
	
		
		
		
	
		


