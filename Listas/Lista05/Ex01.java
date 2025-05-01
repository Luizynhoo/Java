// Uma escola precisa de um programa que controle a média das notas dos
// alunos de cada classe e a média das notas de todos os alunos da escola.
// Sabendo que essa escola possui 3 classes com 5 alunos em cada classe, gerando
// um total de 15 notas, crie um programa que receba as notas de cada aluno de
// cada classe e no final apresente a média de cada classe e a média da escola em
// geral.

package Listas;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double[][] notas = new double[3][5];
        double somaEscola = 0;

        for (int i = 0; i < 3; i++) {
            double somaClasse = 0;
            System.out.println("Classe " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Nota do aluno " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
                somaClasse += notas[i][j];
            }
            double mediaClasse = somaClasse / 5;
            somaEscola += somaClasse;
            System.out.println("Média da Classe " + (i + 1) + ": " + mediaClasse);
        }

        double mediaEscola = somaEscola / 15;
        System.out.println("Média geral da escola: " + mediaEscola);
        sc.close();

	}

}
