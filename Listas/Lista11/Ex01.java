public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private int peso1;
    private int peso2;
    private int peso3;

    public Aluno() {
        this.nome = "Indefinido";
        this.matricula = "000000000";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
        this.peso1 = 1;
        this.peso2 = 1;
        this.peso3 = 1;
    }

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3, int peso1, int peso2, int peso3) {
        setNome(nome);
        setMatricula(matricula);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setPeso1(peso1);
        setPeso2(peso2);
        setPeso3(peso3);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 2 && !nome.matches(".*\\d.*")) {
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

    public int getPeso1() {
        return peso1;
    }

    public void setPeso1(int peso1) {
        this.peso1 = peso1;
    }

    public int getPeso2() {
        return peso2;
    }

    public void setPeso2(int peso2) {
        this.peso2 = peso2;
    }

    public int getPeso3() {
        return peso3;
    }

    public void setPeso3(int peso3) {
        this.peso3 = peso3;
    }

 
    public double calcularMediaPonderada() {
        double somaPesos = peso1 + peso2 + peso3;
        if (somaPesos == 0) {
            return 0; 
        }
        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ferreirinha", "512484724", 9, 8, 9, 4, 3, 5);
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Felipe Silva");
        aluno2.setMatricula("41875839");
        aluno2.setNota1(8.0);
        aluno2.setNota2(5.0);
        aluno2.setNota3(2.0);
        aluno2.setPeso1(1);
        aluno2.setPeso2(2);
        aluno2.setPeso3(3);

        System.out.println("Média de " + aluno1.getNome() + ": " + aluno1.calcularMediaPonderada());
        System.out.println("Média de " + aluno2.getNome() + ": " + aluno2.calcularMediaPonderada());
    }
}
