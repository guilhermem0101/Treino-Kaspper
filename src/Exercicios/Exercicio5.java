package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		String codigo1, codigo2;
		int numeroPecas1,numeroPecas2;
		double valorPeca1, valorPeca2;
		double valorTotal;
		
		Scanner leia =new Scanner(System.in);
		
		System.out.println("entre com o código da peça 1");
		codigo1= leia.nextLine();
		System.out.println("entre com o numero de peças 1");
		numeroPecas1 = leia.nextInt();
		System.out.println("entre com o valor da peças 1");
		valorPeca1 = leia.nextDouble();
		
		System.out.println("entre com o código da peça 2");
		codigo2= leia.nextLine();
		System.out.println("entre com o numero de peças 2");
		numeroPecas2 = leia.nextInt();
		System.out.println("entre com o valor da peças 2");
		valorPeca2 = leia.nextDouble();
		
		valorTotal = numeroPecas1*valorPeca1 + numeroPecas2*valorPeca2;
		
		System.out.printf("o valor total apagar é R$ %.2f", valorTotal);
		
		

	}

}
