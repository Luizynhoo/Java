// Dado um vetor v = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0}, criar
// um programa que efetua a média dos valores e imprima o resultado

package Listas;

public class Ex05 {

	public static void main(String[] args) {
		double[] v = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0};
        double soma = 0;

        for (double num : v) {
            soma += num;
        }

        double media = soma / v.length;
        System.out.println("Média dos valores: " + media);

	}

}
