// Crie um programa que receba quatro valores quaisquer e mostre a média,
// somatório entre eles e o resto da divisão do somatório por cada um dos valores.

import java.util.Scanner;

public class Ex04 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double resultado = 0; 

        // Loop para ter os dados dos três produtos
        for (int i = 0; i <= 3; i++) {
            System.out.print("Digite a sua " + (i + 1) + "º nota: ");
            notas[i] = sc.nextDouble();
            
            sc.nextLine(); 
        }

        // Calculando o valor total
        for (int i = 0; i <= 3; i++) {
            resultado += notas[i] / 4;
        }

        // Exibindo o valor total
        System.out.printf("\nA sua nota final é: R$ " + "%.2f", resultado);

        sc.close();
    }
}
