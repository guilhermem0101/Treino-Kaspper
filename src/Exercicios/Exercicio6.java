package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		double a,b,c;
		System.out.println("Entre com valores A, B, C para calcular as operaçõres matematicas");
		a = leia.nextDouble();
		b = leia.nextDouble();
		c = leia.nextDouble();
		final double pi = 3.14159;
		
		System.out.printf("A area do triangulo que tem base A e altura C é %.3f", a*c/2);
		System.out.println();
		System.out.printf("A area do circulo que raio C é %.3f", pi * Math.pow(c, 2));
		System.out.println();
		System.out.printf("A area do area do trapezio que tem A e B por base e c açtura é %.3f", ((a+b)*c)/2);
		System.out.println();
		System.out.printf("A area do quadrado que tem lado B é %.3f", Math.pow(b, 2));
		System.out.println();
		System.out.printf("A area do retangulo que lado A e B  C é %.3f", a*b);
		
	}

}
