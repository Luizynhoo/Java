// Faça um programa que apresente o total da soma dos cem primeiros
// números inteiros (1+2+3+.....+99+100).

package Lista;


import java.util.Scanner;

public class Lista02 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for (int i = 0; i <= 100; i++) {
			soma += i;
		}
		
		System.out.println("A soma dos 100 primeiros números é: " + soma);
}
}
