package Atributos;

import java.util.Scanner;

public class Atributos {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		double valor;
		//Atributo lógico true or false
		boolean boo1;
		
		// Criando o objeto Scanner para ler a entrada
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite seu nome:  ");
		// Lendo a linha digitada pelo usuário e armazenando na variável 'nome'
		nome = sc.nextLine(); 
		
		System.out.println("Digite a sua idade:  ");
		// Lendo a linha digitada pelo usuário e armazenando na variável 'idade'
		idade = sc.nextInt(); 
		
		System.out.println("Digite o seu salário:  ");
		// Lendo a linha digitada pelo usuário e armazenando na variável 'salario'
		valor = sc.nextDouble(); 
	}

}
