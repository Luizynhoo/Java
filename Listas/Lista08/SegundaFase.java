package Listas;

class Conta {
    private double saldo;
    private String nrAgencia;
    private String titular;
    private String nrConta;
    private int codBanco;

    // Construtor
    public Conta(double saldo, String nrAgencia, String titular, String nrConta, int codBanco) {
        this.saldo = saldo;
        this.nrAgencia = nrAgencia;
        this.titular = titular;
        this.nrConta = nrConta;
        this.codBanco = codBanco;
    }

    /**
     * @param valor: valor a ser sacado da conta
     * 1. Verificar se o valor do saque é positivo.
     * 2. Verificar se há saldo suficiente para efetuar o saque
     */
    public void saque(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    /**
     * @param valor Valor a ser depositado na conta
     * Verificar se o valor do depósito é positivo.
     */
    void deposito(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        }
    }

    /**
     * Método para impressão de todos os dados da classe
     */
    public void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println("AGENCIA:\t" + nrAgencia + "\t BANCO:\t" + codBanco);
        System.out.println("Conta:\t" + nrConta);
        System.out.println("TITULAR:\t" + titular);
        System.out.println("SALDO:\tR$" + saldo);
        System.out.println("----------------------------\n");
    }

    /**
     * @return saldo da conta
     */
    double getSaldo() {
        return saldo;
    }
}



public class SegundaFase {

	public static void main(String[] args) {
		// Criação da conta
        Conta conta = new Conta(1000.0, "001", "Fulano da Silva", "12345-6", 234);

        // Impressão dos dados da conta
        conta.imprimeDados();

        // Saque da conta
        conta.saque(200.0);

        // Impressão dos dados da conta
        conta.imprimeDados();

        // Depósito em conta
        conta.deposito(500.0);

        // Impressão dos dados da conta
        conta.imprimeDados();

        // Impressão do saldo utilizando o método getSaldo()
        System.out.println("Saldo atual (via getSaldo): R$" + conta.getSaldo());

	}

}
