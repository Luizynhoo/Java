package Exercicio3;

import java.util.Scanner;

public class NumerosFormatados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número decimal: ");
        double numeroDecimal = sc.nextDouble();

        System.out.printf("Número formatado com duas casas decimais: %.2f%n", numeroDecimal);

        sc.close();
    }
}
