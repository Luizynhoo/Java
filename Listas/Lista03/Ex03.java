// Uma empresa quer transmitir dados por telefone, mas está preocupada com a
// possibilidade de seus telefones estarem grampeados. Todos seus dados são
// transmitidos como inteiros de quatro dígitos. Eles pedem para você escrever um
// programa que criptografará seus dados de modo que estes possam ser
// transmitidos mais seguramente. Seu aplicativo deve ler um inteiro de quatro
// dígitos inserido pelo usuário na linha de comando e criptografá-lo como segue:
// substitua cada digito por (a soma deste dígito mais 1). Então troque o primeiro
// digito pelo terceiro e troque o segundo pelo quarto. A seguir imprima o inteiro
// criptografado. Escreva um aplicativo separado que recebe como entrada um
// inteiro de quatro dígitos criptografado e o descriptografa para formar o número
// original.

package Lista;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            criptografar(scanner);
        } else if (opcao == 2) {
            descriptografar(scanner);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public static void criptografar(Scanner scanner) {
        System.out.print("Digite um número de 4 dígitos: ");
        int numero = scanner.nextInt();

        int[] digitos = new int[4];
        for (int i = 3; i >= 0; i--) {
            digitos[i] = (numero % 10 + 1) % 10;
            numero /= 10;
        }

        // Trocar 1º com 3º, e 2º com 4º
        int temp = digitos[0];
        digitos[0] = digitos[2];
        digitos[2] = temp;

        temp = digitos[1];
        digitos[1] = digitos[3];
        digitos[3] = temp;

        System.out.print("Número criptografado: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(digitos[i]);
        }
        System.out.println();
    }

    public static void descriptografar(Scanner scanner) {
        System.out.print("Digite o número criptografado (4 dígitos): ");
        int numero = scanner.nextInt();

        int[] digitos = new int[4];
        for (int i = 3; i >= 0; i--) {
            digitos[i] = numero % 10;
            numero /= 10;
        }

        // Inverter troca: 1º com 3º, 2º com 4º
        int temp = digitos[0];
        digitos[0] = digitos[2];
        digitos[2] = temp;

        temp = digitos[1];
        digitos[1] = digitos[3];
        digitos[3] = temp;

        // Subtrair 1 (com ajuste se o valor for 0)
        for (int i = 0; i < 4; i++) {
            digitos[i] = (digitos[i] + 9) % 10;
        }

        System.out.print("Número original: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(digitos[i]);
        }
        System.out.println();
    }
}
