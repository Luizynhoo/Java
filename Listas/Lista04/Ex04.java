// Faça um aplicativo que verifique se uma palavra é um palíndromo

package Listas;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Remover espaços e converter para minúsculas
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        // Verificar se a palavra é um palíndromo
        boolean ehPalindromo = true;
        int tamanho = palavra.length();

        // Verificar se os caracteres da palavra são iguais de trás para frente
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        // Exibir o resultado
        if (ehPalindromo) {
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        } else {
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }

        // Fechar o scanner
        scanner.close();
    }

}
