public class TestarAnimais {
 // Classe base Animal
 static class Animal {
 private String nome;
 private float comprimento;
 private int patas;
 private String cor;
 private String ambiente;
 private float velocidade;
 public Animal(String nome, float comprimento, int patas, String cor, String ambiente, float velocidade) {
 this.nome = nome;
 this.comprimento = comprimento;
 this.patas = patas;
 this.cor = cor;
 this.ambiente = ambiente;
 this.velocidade = velocidade;
 }
 public String getNome() { return nome; }
 public void setNome(String nome) { this.nome = nome; }
 public float getComprimento() { return comprimento; }
 public void setComprimento(float comprimento) { this.comprimento = comprimento; }
 public int getPatas() { return patas; }
 public void setPatas(int patas) { this.patas = patas; }
 public String getCor() { return cor; }
 public void setCor(String cor) { this.cor = cor; }
 public String getAmbiente() { return ambiente; }
 public void setAmbiente(String ambiente) { this.ambiente = ambiente; }
 public float getVelocidade() { return velocidade; }
 public void setVelocidade(float velocidade) { this.velocidade = velocidade; }
 public void dados() {
 System.out.println("Nome: " + nome);
 System.out.println("Comprimento: " + comprimento + " cm");
 System.out.println("Número de patas: " + patas);
 System.out.println("Cor: " + cor);
 System.out.println("Ambiente: " + ambiente);
 System.out.println("Velocidade média: " + velocidade + " m/s");
 }
 }
 // Classe derivada Peixe
 static class Peixe extends Animal {
 private String caracteristica;
 public Peixe(String nome, float comprimento, int patas, String cor, String ambiente, float velocidade, String caracteristica) {
 super(nome, comprimento, patas, cor, ambiente, velocidade);
 this.caracteristica = caracteristica;
 }
 public String getCaracteristica() { return caracteristica; }
 public void setCaracteristica(String caracteristica) { this.caracteristica = caracteristica; }
 public void dadosPeixe() {
 super.dados();
 System.out.println("Característica: " + caracteristica);
 }
 }
 // Classe derivada Mamifero
 static class Mamifero extends Animal {
 private String alimento;
 public Mamifero(String nome, float comprimento, int patas, String cor, String ambiente, float velocidade, String alimento) {
 super(nome, comprimento, patas, cor, ambiente, velocidade);
 this.alimento = alimento;
 }
 public String getAlimento() { return alimento; }
 public void setAlimento(String alimento) { this.alimento = alimento; }
 public void dadosMamifero() {
 super.dados();
 System.out.println("Alimento: " + alimento);
 }
 }
 // Método principal para testar as classes
 public static void main(String[] args) {
 Mamifero camelo = new Mamifero("Camelo", 150f, 4, "Amarelo", "Terra", 2.0f, null);
 Peixe tubarao = new Peixe("Tubarão", 300f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
 Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180f, 4, "Vermelho", "Terra", 0.5f, "Mel");
 System.out.println("=== Dados do Camelo ===");
 camelo.dadosMamifero();
 System.out.println();
 System.out.println("=== Dados do Tubarão ===");
 tubarao.dadosPeixe();
 System.out.println();
 System.out.println("=== Dados do Urso-do-canada ===");
 ursocanada.dadosMamifero();
 }
}
