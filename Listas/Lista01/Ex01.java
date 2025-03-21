// Crie um programa que recebe três nomes quaisquer por meio da linha de
// execução do programa, e os imprima na tela da seguinte maneira: o primeiro e o
// último nome serão impressos na primeira linha um após o outro, o outro nome
// (segundo) será impresso na segunda linha


import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarando um array (vetor) de Strings com capacidade para armazenar três nomes
        String[] nomes = new String[3];

        // Usando um loop para capturar os nomes
        for (int i = 0; i < 3; i++) {
            // Sempre que fazer o loop vai aumentar a sequencia 1º, 2º e 3º
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            // Armazenando os nomes
            nomes[i] = sc.nextLine();
        }

        //Fechando o objeto "sc"
        sc.close();

        // Exibindo a saída no formato desejado
        System.out.println(nomes[0] + " " + nomes[2]);
        System.out.println(nomes[1]);
    }
}
