// 1) Implemente uma classe chamada Carro com as seguintes propriedades:
// a. Um veículo tem um certo consumo de combustível (medidos em km/litro) e uma
// certa quantidade de combustível no tanque.
// b. O consumo é especificado no construtor e o nível de combustível inicial é 0.
// c. Forneça um método andar( ) que simule o ato de dirigir o veículo por uma certa
// distância, reduzindo o nível de combustível no tanque de gasolina.
// d. Forneça um método getCombustivel( ), que retorna o nível atual de
// combustível.
// e. Forneça um método setCombustivel( ), para abastecer o tanque.
// f. Escreva um pequeno programa que teste sua classe. Exemplo de uso:
// Carro uno(16); // 16 quilômetros por litro de combustível.
// uno.setCombustivel(20); // abastece com 20 litros de combustível.
// uno.andar(150); // anda 150 quilômetros.
// uno.getCombustivel() // Exibe o combustível que resta no tanque.


package Listas;

public class Carro {
    private double consumo;       // km por litro
    private double combustivel;   // litros no tanque

    // Construtor: recebe o consumo do carro
    public Carro(double consumo) {
        this.consumo = consumo;
        this.combustivel = 0.0; // nível inicial de combustível
    }

    // Método para simular o carro andando certa distância
    public void andar(double distancia) {
        double combustivelNecessario = distancia / consumo;
        if (combustivelNecessario <= combustivel) {
            combustivel -= combustivelNecessario;
        } else {
            System.out.println("Combustível insuficiente para percorrer essa distância.");
        }
    }

    // Retorna o nível atual de combustível
    public double getCombustivel() {
        return combustivel;
    }

    // Abastece o carro com uma quantidade de combustível
    public void setCombustivel(double litros) {
        if (litros > 0) {
            combustivel += litros;
        } else {
            System.out.println("Quantidade inválida para abastecimento.");
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Carro uno = new Carro(16);      // 16 km/litro
        uno.setCombustivel(20);         // abastece com 20 litros
        uno.andar(150);                 // percorre 150 km
        System.out.printf("Combustível restante: %.2f litros\n", uno.getCombustivel());
    }
}

