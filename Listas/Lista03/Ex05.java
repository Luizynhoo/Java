// O fatorial de um número inteiro não negativo n é escrito como n!(pronuncia-se
// fatorial de n) e é definido como segue:
// n! = n.(n-1) . (n-2). ....1 (para valores de n maiores que ou iguais a 1)
// e
// n! =1(para n=0)
// Por exemplo: 5! = 5.4.3.2.1, o que dá 120


package Listas;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int n = scanner.nextInt();

        int fatorial = 1;

        if (n == 0) {
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




