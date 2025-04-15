package Listas;
import java.util.Scanner;
public class Lista02 {
	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Digite uma palavra: ");
		 String palavra = sc.nextLine();

	        // Constrói a palavra
	        for (int i = 1; i <= palavra.length(); i++) {
	            System.out.println(palavra.substring(0, i));
	        }

	        // Desconstrói a palavra
	        for (int i = palavra.length() - 1; i >= 1; i--) {
	            System.out.println(palavra.substring(0, i));
	        }
	}

}
