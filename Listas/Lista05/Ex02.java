//  Dado um vetor v = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, criar um
// programa a que leia um número e verifique e imprima na tela se este número existe
// no vetor

package Listas;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		  int[] v = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número para procurar: ");
	        int num = sc.nextInt();
	        boolean encontrado = false;

	        for (int i : v) {
	            if (i == num) {
	                encontrado = true;
	                break;
	            }
	        }

	        if (encontrado) {
	            System.out.println("Número encontrado no vetor.");
	        } else {
	            System.out.println("Número NÃO encontrado.");
	        }

	        sc.close();

	}

}
