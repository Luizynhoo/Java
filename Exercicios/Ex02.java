package Exercicio2;

import java.util.Scanner;

public class DadosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Digite sua cidade: ");
        String cidade = sc.nextLine();

        System.out.printf("Nome: %s, Idade: %d anos, Cidade: %s%n", nome, idade, cidade);

        sc.close();
    }
}
