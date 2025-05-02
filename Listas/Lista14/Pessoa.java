import java.util.Scanner;
class Pessoa {
 private String nome;
 private int idade;
 public Pessoa(String nome, int idade) {
 this.nome = nome;
 this.idade = idade;
 }
 public Pessoa() {
 this.nome = "indefinido";
 this.idade = 0;
 }
 public String getNome() { return nome; }
 public void setNome(String nome) { this.nome = nome; }
 public int getIdade() { return idade; }
 public void setIdade(int idade) { this.idade = idade; }
}
class Amigo extends Pessoa {
 private String aniversario;
 public Amigo() {
 super();
 this.aniversario = "indefinido";
 }
 public String getAniversario() { return aniversario; }
 public void setAniversario(String aniversario) { this.aniversario = aniversario; }
}
class Conhecido extends Pessoa {
 private String email;
 public Conhecido() {
 super();
 this.email = "indefinido";
 }
 public String getEmail() { return email; }
 public void setEmail(String email) { this.email = email; }
}
class Agenda {
 private Pessoa[] pessoas;
 private int qtdAmigos = 0;
 private int qtdConhecidos = 0;
 public Agenda(int quantidade) {
 pessoas = new Pessoa[quantidade];
 for (int i = 0; i < quantidade; i++) {
 int tipo = 1 + (int) (Math.random() * 2);
 if (tipo == 1) {
 pessoas[i] = new Amigo();
 qtdAmigos++;
 } else {
 pessoas[i] = new Conhecido();
 qtdConhecidos++;
 }
 }
 }
 public Pessoa[] getPessoas() { return pessoas; }
 public int getQtdAmigos() { return qtdAmigos; }
 public int getQtdConhecidos() { return qtdConhecidos; }
 public void addInformacoes() {
 Scanner scanner = new Scanner(System.in);
 for (Pessoa p : pessoas) {
 System.out.println("\nDigite o nome:");
 p.setNome(scanner.nextLine());
 System.out.println("Digite a idade:");
 p.setIdade(Integer.parseInt(scanner.nextLine()));
 if (p instanceof Amigo) {
 System.out.println("Digite a data de aniversário:");
 ((Amigo) p).setAniversario(scanner.nextLine());
 } else if (p instanceof Conhecido) {
 System.out.println("Digite o email:");
 ((Conhecido) p).setEmail(scanner.nextLine());
 }
 }
 }
 public void imprimeAniversarios() {
 System.out.println("\n--- Aniversários dos amigos ---");
 for (Pessoa p : pessoas) {
 if (p instanceof Amigo) {
 System.out.println(p.getNome() + ": " + ((Amigo) p).getAniversario());
 }
 }
 }
 public void imprimeEmails() {
 System.out.println("\n--- E-mails dos conhecidos ---");
 for (Pessoa p : pessoas) {
 if (p instanceof Conhecido) {
 System.out.println(p.getNome() + ": " + ((Conhecido) p).getEmail());
 }
 }
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Quantas pessoas deseja adicionar na agenda? ");
 int qtd = Integer.parseInt(scanner.nextLine());
 Agenda agenda = new Agenda(qtd);
 System.out.println("\nAgenda criada com " + agenda.getQtdAmigos() + " amigos e " + agenda.getQtdConhecidos() + " conhecidos.");
 agenda.addInformacoes();
 agenda.imprimeAniversarios();
 agenda.imprimeEmails();
 }
}
