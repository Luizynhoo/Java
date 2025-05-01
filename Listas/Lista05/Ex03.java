// Dado um vetor v = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9}, criar um
// programa que leia um número e informe na tela quantas vezes este número foi
// encontrado no vetor

package Listas;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		 int[] v = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número para contar: ");
	        int num = sc.nextInt();
	        int contador = 0;

	        for (int i : v) {
	            if (i == num) {
	                contador++;
	            }
	        }

	        System.out.println("O número " + num + " foi encontrado " + contador + " vezes.");
	        sc.close();

	}

}
