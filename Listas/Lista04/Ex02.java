// Escreva um aplicativo 
// que recebe entradas de texto e envia o texto para 
// saída com letras em maiúsculas e em minúsculas.   

package Listas;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Forneça uma frase");
        String frase = sc.nextLine();
        
        String textoM = frase.toUpperCase();
        String textom = frase.toLowerCase();
        
        System.out.println("Frase Maiúscula: " + textoM);
        System.out.println("Frase Minúscula: " + textom);
	}

}
