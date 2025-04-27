// Crie uma classe que leia um parâmetro passado na linha de comando no
// seguinte formato: dd/mm/aaaa. Desta maneira, a classe devera ser executada
// como java Exe04 11/09/2001. A saída gerada por essa execução deve ser a
// impressão separada do dia, do mês e do ano - utilizando apenas os métodos da
// classe String.

package Listas;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a data no formato dd/mm/aaaa:");
        String data = scanner.nextLine();
        
        // usando métodos da classe String para separar dia, mês e ano
        String dia = data.substring(0, 2);//Dois primeiros caracteres 
        String mes = data.substring(3, 5);//Do terceiro ao quinto 
        String ano = data.substring(6, 10);//Do sexto ao decimo 

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);

        scanner.close();
    }
}
