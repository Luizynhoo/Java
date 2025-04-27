// A série de Fibonacci 0,1,1,2,3,5,8,13,21..... 
// inicia com 0 e 1 e tem a propriedade de que cada número de Fibonacci subseqüente é a soma dos dois anteriores que o procedem. 
// Escreva um aplicativo que recebe a entrada do número de vezes que deve ocorrer a série.   

package Listas;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números da série Fibonacci você quer mostrar? ");
        int quantidade = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.print("Série de Fibonacci: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(primeiro + " ");

            segundo = primeiro + segundo; // segundo vira a soma dos dois
            primeiro = segundo - primeiro; // atualiza o primeiro
        }

		        scanner.close();
		    }

}
