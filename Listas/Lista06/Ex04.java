// Dado um vetor v = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10} criar um programa que efetua
// a soma dos valores e imprima o resultado

package Listas;

public class Ex04 {

	public static void main(String[] args) {
		int[] v = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10};
        int soma = 0;

        for (int num : v) {
            soma += num;
        }

        System.out.println("Soma dos valores: " + soma);

	}

}
