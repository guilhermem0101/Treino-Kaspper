package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		String codigo1, codigo2;
		int numeroPecas1,numeroPecas2;
		double valorPeca1, valorPeca2;
		double valorTotal;
		
		Scanner leia =new Scanner(System.in);
		
		System.out.println("entre com o c�digo da pe�a 1");
		codigo1= leia.nextLine();
		System.out.println("entre com o numero de pe�as 1");
		numeroPecas1 = leia.nextInt();
		System.out.println("entre com o valor da pe�as 1");
		valorPeca1 = leia.nextDouble();
		
		System.out.println("entre com o c�digo da pe�a 2");
		codigo2= leia.nextLine();
		System.out.println("entre com o numero de pe�as 2");
		numeroPecas2 = leia.nextInt();
		System.out.println("entre com o valor da pe�as 2");
		valorPeca2 = leia.nextDouble();
		
		valorTotal = numeroPecas1*valorPeca1 + numeroPecas2*valorPeca2;
		
		System.out.printf("o valor total apagar � %.2f", valorTotal);
		
		

	}

}
