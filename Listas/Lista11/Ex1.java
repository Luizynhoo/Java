public class Aluno {
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;
    private double peso1, peso2, peso3;

    // Construtor padrão
    public Aluno() {
    }

    // Construtor com argumentos
    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3,
                 double peso1, double peso2, double peso3) {
        setNome(nome);
        setMatricula(matricula);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.peso3 = peso3;
    }

    // Getters e Setters com validações
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 2 && nome.matches("[a-zA-Z\\s]+")) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null && matricula.matches("\\d{9}")) {
            this.matricula = matricula;
        } else {
            System.out.println("Matrícula inválida.");
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPeso1() {
        return peso1;
    }

    public void setPeso1(double peso1) {
        this.peso1 = peso1;
    }

    public double getPeso2() {
        return peso2;
    }

    public void setPeso2(double peso2) {
        this.peso2 = peso2;
    }

    public double getPeso3() {
        return peso3;
    }

    public void setPeso3(double peso3) {
        this.peso3 = peso3;
    }

    // Método para calcular média ponderada
    public double calcularMediaPonderada() {
        double somaPesos = peso1 + peso2 + peso3;
        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;
    }
}
