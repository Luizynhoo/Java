// Faça um programa que receba a quantidade e o valor de três produtos, no
// seguinte formato: quantidade1 valor1 quantidade2 valor2 quantidade3 valor3. O
// programa deve calcular esses valores seguindo a fórmula total = quantidade1 x
// valor1 + quantidade2 x valor2 + quantidade3 x valor3. O valor total deve ser
// apresentado no final da execução.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[3]; // Array para armazenar os nomes dos produtos
        int[] quantidades = new int[3]; // Array para armazenar as quantidades
        double[] valores = new double[3]; // Array para armazenar os valores dos produtos
        double total = 0; // Variável para armazenar o total

        // Loop para ter os dados dos três produtos
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º produto: ");
            produtos[i] = sc.nextLine();

            System.out.print("Digite a quantidade de " + produtos[i] + ": ");
            quantidades[i] = sc.nextInt();

            System.out.print("Digite o valor unitário de " + produtos[i] + ": ");
            valores[i] = sc.nextDouble();
            
            sc.nextLine(); 
        }

        // Calculando o valor total
        for (int i = 0; i < 3; i++) {
            total += quantidades[i] * valores[i];
        }

        // Exibindo o valor total
        System.out.println("\nO valor total da compra é: R$ " + String.format("%.2f", total));

        sc.close();
    }
}
