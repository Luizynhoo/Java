// Escreva um aplicativo que lê um inteiro não negativo via linha de comando, computa e imprima seu fatorial.

package Listas;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        int fatorial = 1;
        
        if(n < 0 ) {
        	System.out.println("Digite somente números inteiros positivos");
        	scanner.close(); 
            return; 
        }
        else if (n == 0) {
            // Se o número for 0 = 1 
            fatorial = 1;
        } else {
            // Se for diferente de 0 faz o calculo 
            for (int i = n; i >= 1; i--) {
                fatorial = fatorial * i;
            }
        }

        System.out.println(n + "! = " + fatorial);

        scanner.close();
    }
}




