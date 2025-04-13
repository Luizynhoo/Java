//Faça um aplicativo que receba três valores inteiros na linha de comando e
//mostre o maior dentre eles.

package Lista;


import java.util.Scanner;

public class Lista01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[3];
		
		for(int i = 0; i<3; i++) {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			numeros[i] = sc.nextInt();
			
		}
		
		sc.close();
		
		int maior = numeros[0];
		
		for(int i = 1; i < 3; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
	}

		System.out.println("O maior número é: " + maior);
}
}
