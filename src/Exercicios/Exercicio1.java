package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner leia =new Scanner(System.in);
	int a,b,c;
	System.out.println("Entre com dois numeros inteiros para realizarmos a operação binária de soma: ");
	a= leia.nextInt();
	b= leia.nextInt();
	c = a + b; 
	System.out.println("o resultado da operação é " + c);
	}

}
