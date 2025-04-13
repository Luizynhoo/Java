// Crie uma classe que gere um numero aleatório entre os valores máximo e
// mínimo recebidos do usuário na linha de comando.

package Lista;

import java.util.Scanner;
import java.util.Random;

public class Lista04 {

    public static void main(String[] args) {
        Scanner js = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o valor mínimo: ");
        int min = js.nextInt();

        System.out.print("Digite o valor máximo: ");
        int max = js.nextInt();

        // Garantindo que min seja menor que max
        if (min > max) {
            System.out.println("O valor mínimo não pode ser maior que o valor máximo.");
        } else {
            // Gera número aleatório entre min e max (inclusive)
            int numeroAleatorio = random.nextInt(max - min + 1) + min;
            System.out.println("Número aleatório gerado entre " + min + " e " + max + ": " + numeroAleatorio);
        }

        js.close();
    }
}
