// Criar um programa que leia dois vetores de inteiros de 10 posições, efetue a soma
// dos valores dos elementos de mesmo índice dos dois vetores colocando o resultado
// em um terceiro vetor. Exiba na tela o vetor resultante.


package Listas;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[10];

        System.out.println("Digite os valores do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("v1[" + i + "]: ");
            v1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("v2[" + i + "]: ");
            v2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            v3[i] = v1[i] + v2[i];
        }

        System.out.println("Vetor resultante (soma):");
        for (int i = 0; i < 10; i++) {
            System.out.println("v3[" + i + "] = " + v3[i]);
        }

        sc.close();

	}

}
