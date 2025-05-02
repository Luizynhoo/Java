public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaIMC() {
        return peso / (altura * altura);
    }

    public String classificacaoIMC() {
        double imc = calculaIMC();
        if (imc < 17) {
            return "Muito abaixo do peso";
        } else if (imc >= 17 && imc <= 18.49) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.99) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.99) {
            return "Acima do peso";
        } else if (imc >= 30 && imc <= 34.99) {
            return "Obesidade I";
        } else if (imc >= 35 && imc <= 39.99) {
            return "Obesidade II (severa)";
        } else {
            return "Obesidade III (mórbida)";
        }
    }
}
