package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		
		int numeroFuncionarios;
		int horasTrabalhadas;
		double valorHora;
		double salario;
		System.out.println("Quantos funcionarios existem? ");
		numeroFuncionarios = leia.nextInt();
		System.out.println("Quantas horas s�o trabalhadas? ");
		horasTrabalhadas = leia.nextInt();
		System.out.println("Quanto os funcionarios recebem por hora? ");
		valorHora = leia.nextDouble();
		
		salario = valorHora*horasTrabalhadas;
		
	
		
		System.out.printf("O numero de fuuncionarios � %d e os salarios s�o de %.2f", numeroFuncionarios, salario);

	}

}
