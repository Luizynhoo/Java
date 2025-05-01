// Criar um programa que leia um vetor de inteiros de 10 posições e efetue a soma
// somente dos elementos ímpares.


package Listas;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int somaImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 != 0) {
                somaImpares += vetor[i];
            }
        }

        System.out.println("Soma dos números ímpares: " + somaImpares);
        sc.close();

	}

}
