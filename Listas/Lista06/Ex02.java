// Dado um vetor v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, criar um programa que imprima este
// conjunto acompanhado do seu elemento simétrico em relação a sua posição no
// conjunto, ou seja, a impressão será: 1 - 10, 2 - 9, 3 - 8, 4 - 7, 5 - 6, 6 - 5, 7 - 4, 8 - 3, 9
// - 2, 10 - 1.

package Listas;

public class Ex02 {

	public static void main(String[] args) {
        int[] v = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " - " + v[v.length - 1 - i]);
        }

	}

}
