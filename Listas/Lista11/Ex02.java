import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaAtual = 0, somaReajustada = 0;

        System.out.print("Quantos funcionários deseja processar? ");
        int N = sc.nextInt();
        sc.nextLine(); // Consumir quebra de linha

        for (int i = 1; i <= N; i++) {
            System.out.println("\nFuncionário " + i);
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário atual: R$ ");
            double salario = sc.nextDouble();
            sc.nextLine(); // Consumir quebra de linha

            double reajuste = 0;
            if (salario <= 150) {
                reajuste = 0.25;
            } else if (salario <= 300) {
                reajuste = 0.20;
            } else if (salario <= 600) {
                reajuste = 0.15;
            } else {
                reajuste = 0.10;
            }

            double novoSalario = salario + (salario * reajuste);
            somaAtual += salario;
            somaReajustada += novoSalario;

            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Salário atual: R$ %.2f\n", salario);
            System.out.printf("Salário reajustado: R$ %.2f\n", novoSalario);
        }

        System.out.println("\nResumo Final:");
        System.out.printf("Soma dos salários atuais: R$ %.2f\n", somaAtual);
        System.out.printf("Soma dos salários reajustados: R$ %.2f\n", somaReajustada);
        System.out.printf("Diferença total: R$ %.2f\n", somaReajustada - somaAtual);

        sc.close();
    }
}
