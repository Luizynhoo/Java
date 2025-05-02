public class TestaPessoa {
    public static void main(String[] args) {
        // Criando objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("Carlos Silva", 35, 85.0, 1.75);

        // Exibindo os dados
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
        System.out.println("Altura: " + pessoa.getAltura() + " m");

        // Cálculo do IMC
        double imc = pessoa.calculaIMC();
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + pessoa.classificacaoIMC());
    }
}
