package Exercicios;


import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner leia =new Scanner(System.in);
		final double pi = 3.14159;
		double raio;
		double area;
		System.out.println("para caulcular a area do circulo, entre com o valor do raio ");
		raio =  leia.nextDouble();
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("o valor da area é %.4f", area);
	}
}
