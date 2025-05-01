// Criar um programa que leia um vetor de inteiros de 20 posições e mostre a
// quantidade de números que são múltiplos de 2

package Listas;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int[] vetor = new int[20];
	        int multiplosDe2 = 0;

	        for (int i = 0; i < 20; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            vetor[i] = sc.nextInt();
	            if (vetor[i] % 2 == 0) {
	                multiplosDe2++;
	            }
	        }

	        System.out.println("Quantidade de múltiplos de 2: " + multiplosDe2);
	        sc.close();

	}

}
