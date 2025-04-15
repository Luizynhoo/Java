//Crie um aplicativo que receba uma frase e mostre-a de forma invertida.

package Listas;
import java.util.Scanner;
public class Lista01 {

	public static void main(String[] args) {
			Scanner st = new Scanner(System.in);
		

	        // Entrada do usuário
	        System.out.print("Digite uma frase: ");
	        String frase = st.nextLine();

	        // Inverte a frase usando StringBuilder
	        // StringBuilder cria um objeto que permite manipular a string original (como inverter, adicionar, remover)
	        // reverse() é um método do StringBuilder que inverte a ordem dos caracteres
	        // toString() converte o objeto StringBuilder de volta para uma String normal
	        String fraseInvertida = new StringBuilder(frase).reverse().toString();

	        // Exibe a frase invertida
	        System.out.println("Frase invertida: " + fraseInvertida);

	        st.close();

	}

}
