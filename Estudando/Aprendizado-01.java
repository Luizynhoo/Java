package Area;  // Declaração do pacote, que organiza as classes no seu projeto

public class Universidade {  // Definição da classe Universidade. Esta classe representa uma universidade.

    // Declaração dos atributos privados da classe Universidade
    private String nome;  // Atributo para armazenar o nome da universidade
    private String localizacao;  // Atributo para armazenar a localização da universidade
    private int Qtd;  // Atributo para armazenar a quantidade de alunos na universidade

    // Construtor da classe Universidade. Ele é usado para inicializar os atributos da classe com valores fornecidos
    public Universidade(String nome, String localizacao, int Qtd) {
        this.nome = nome;  // Inicializa o atributo 'nome' com o valor fornecido
        this.localizacao = localizacao;  // Inicializa o atributo 'localizacao' com o valor fornecido
        this.Qtd = Qtd;  // Inicializa o atributo 'Qtd' com o valor fornecido
    }

    // Método getter para acessar o valor do atributo 'nome'
    public String getNome() {
        return nome;  // Retorna o valor do atributo 'nome'
    }

    // Método setter para modificar o valor do atributo 'nome'
    public void setNome(String nome) {
        this.nome = nome;  // Atribui o valor fornecido ao atributo 'nome'
    }

    // Método getter para acessar o valor do atributo 'localizacao'
    public String getLocalizacao() {
        return localizacao;  // Retorna o valor do atributo 'localizacao'
    }

    // Método setter para modificar o valor do atributo 'localizacao'
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;  // Atribui o valor fornecido ao atributo 'localizacao'
    }

    // Método getter para acessar o valor do atributo 'Qtd'
    public int getQtd() {
        return Qtd;  // Retorna o valor do atributo 'Qtd'
    }

    // Método setter para modificar o valor do atributo 'Qtd'
    public void setQtd(int Qtd) {
        this.Qtd = Qtd;  // Atribui o valor fornecido ao atributo 'Qtd'
    }

    // Método toString() que retorna uma representação em String do objeto Universidade
    @Override  // Anotação para sobrescrever o método toString da classe Object
    public String toString() {
        // Retorna uma String formatada com as informações da universidade
        return "Universidade: " + nome + "\nLocalização: " + localizacao + "\nQuantidade de alunos: " + Qtd;
    }

    // Método principal (main) para testar a classe
    public static void main(String[] args) {
        // Criando um objeto da classe Universidade, com dados da UNICID Carrao
        Universidade uniCarrao = new Universidade("UNICID Carrao", "São Paulo - Bairro do Carrão", 22000);

        // Exibindo as informações da universidade utilizando o método toString()
        System.out.println(uniCarrao.toString());  // Chama o método toString da classe Universidade, imprimindo as informações
    }
}
