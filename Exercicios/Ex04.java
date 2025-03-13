package Exercicio4;

import java.util.Scanner;

public class ValorMonetario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor monetário: ");
        double valorMonetario = sc.nextDouble();

        System.out.printf("Valor formatado em reais: R$ %.2f%n", valorMonetario);

        sc.close();
    }
}
