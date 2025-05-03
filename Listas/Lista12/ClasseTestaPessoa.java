package Listas;

public class TestaPessoa {
    public static void main(String[] args) {
        // Criando e inicializando o objeto
        Pessoa pessoa = new Pessoa("Ana Souza", 28, 68.0, 1.65);

        // Exibindo os dados
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
        System.out.println("Altura: " + pessoa.getAltura() + " m");

        // Cálculo do IMC e classificação
        double imc = pessoa.calculaIMC();
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + pessoa.classificacaoIMC());
    }
}
