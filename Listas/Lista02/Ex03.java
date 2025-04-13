//Faça um aplicativo que calcule o produto dos inteiros ímpares de 1 a 15 e
// exiba o resultado na tela

package Lista;


import java.util.Scanner;

public class Lista03 {

	public static void main(String[] args) {
		
		int produto  = 1;
		
		for (int i = 0; i <= 15; i++) {
			if(i%2 != 0){
				produto  *= i;
			}
			
		}
		
		System.out.println("O produto dos números ímpares de 1 a 15 é: " + produto );
}
}
