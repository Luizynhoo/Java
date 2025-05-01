package Listas;

import javax.swing.JOptionPane;

class Populacao {
    private int[][] pop;
    private int estados, municipios;

    // Construtor
    public Populacao(int estados, int municipios) {
        this.estados = estados;
        this.municipios = municipios;
        pop = new int[estados][municipios];
    }

    // Atualiza a população de um município
    public void atualizarPopulacao(int e, int m, int populacao) {
        if (e >= 0 && e < estados && m >= 0 && m < municipios && populacao > 0) {
            pop[e][m] = populacao;
        }
    }

    // Retorna a média da população de um estado
    public double mediaEstado(int estado) {
        int soma = 0;
        for (int i = 0; i < municipios; i++) {
            soma += pop[estado][i];
        }
        return (double) soma / municipios;
    }
}

public class Administracao {
    public static void main(String[] args) {
        // Declarar variáveis
        int e = 4; // número de estados
        int m = 5; // número de municípios por estado
        int n;
        Populacao pop = new Populacao(e, m);

        // Preencher dados de população
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < m; j++) {
                n = Integer.parseInt(JOptionPane.showInputDialog(
                        "Informe a população da cidade " + (j + 1) + " do estado " + (i + 1) + ":"
                ));
                pop.atualizarPopulacao(i, j, n);
            }
        }

        // Mostrar média populacional por estado
        for (int i = 0; i < e; i++) {
            JOptionPane.showMessageDialog(null,
                    "Média de população do Estado " + (i + 1) + ": " + pop.mediaEstado(i));
        }
    }
}

