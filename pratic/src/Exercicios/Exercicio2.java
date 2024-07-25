package Exercicios;
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.

//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double π, R, A;
		
		R = sc.nextDouble();
		π = 3.14159;
		A = π * R * R;
		
		System.out.printf("A área do circulo é: %.4f%n", A);
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}
}
		
		

		
		
	
		
		
		
	
		


