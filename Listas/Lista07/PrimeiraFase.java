package Listas;

public class Lista07 {
	 // TestaAgencia.java
    static class Agencia {
        String nrAgencia;
        int codBanco;
    }

    // TestaCliente.java
    static class Cliente {
        String nomeCliente;
        String cpfCliente;
    }

    // TestaConta.java
    static class Conta {
        double saldo;
        String nrAgencia;
        String titular;
        String nrConta;
        int codBanco;
    }

    public static void main(String[] args) {

        // TestaAgencia.java
        Agencia ag = new Agencia();
        ag.nrAgencia = "1";
        ag.codBanco = 234;

        System.out.println("* -----------------------------");
        System.out.println("* AGENCIA : " + ag.nrAgencia);
        System.out.println("* BANCO   : " + ag.codBanco);
        System.out.println("* -----------------------------");

        // TestaCliente.java
        Cliente c = new Cliente();
        c.nomeCliente = "FULANO";
        c.cpfCliente = "234232323";

        System.out.println("* -----------------------------");
        System.out.println("* NOME : " + c.nomeCliente);
        System.out.println("* CPF  : " + c.cpfCliente);
        System.out.println("* -----------------------------");

        // TestaConta.java
        Conta conta = new Conta();
        conta.saldo = 10000.0;
        conta.nrAgencia = "1";
        conta.titular = "FULANO";
        conta.nrConta = "01945";
        conta.codBanco = 234;

        System.out.println("* ------------------------------------");
        System.out.println("* AGENCIA: " + conta.nrAgencia + " BANCO : " + conta.codBanco);
        System.out.println("* CONTA CORRENTE : " + conta.nrConta);
        System.out.println("* TITULAR: " + conta.titular);
        System.out.println("* SALDO : R$" + conta.saldo);
        System.out.println("* ------------------------------------");
    }
}
