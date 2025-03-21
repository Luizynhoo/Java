// Crie um programa que receba a largura e o comprimento de um lote de terra e
// mostre a área total existente

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.println("Digite a largura do seu terreno:  ");
        double largura = sc.nextDouble();

        System.out.println("Digite o comprimento do seu terreno:  ");
        double comprimento = sc.nextDouble();


        total = largura * comprimento;

        System.out.printf("A área total do seu terreno é: %.2f m²", total);

        sc.close();
    }

}
