package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Entre com quatro valores inteiros para a conta (A*B - C*D)");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		d = leia.nextInt();
		
		System.out.println("O resultado da conta é " + (a*b - c*d));
	
	
	}

}
