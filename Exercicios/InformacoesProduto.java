// Exercicio5

import java.util.Scanner;

public class InformacoesProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String produto = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = sc.nextInt();

        System.out.printf("Produto: %s | Preço: R$ %.2f | Quantidade: %d unidades%n", produto, preco, quantidade);

        sc.close();
    }
}
