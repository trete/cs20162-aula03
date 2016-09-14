
package aula2;

import static aula2.algoritmo2.produto;
import java.util.Scanner;

/**
 * Programa que calcula potências usando somas
 */
public class algoritmo3 {
    public static void main(String[] args) {
        System.out.println("insira um número");
        
        Scanner leitor = new Scanner(System.in);
        
        int base = Integer.parseInt(leitor.nextLine());
        
        System.out.println("insira o expoente ao qual o número será elevado");
        
        int expoente = Integer.parseInt(leitor.nextLine());
        
        System.out.println("A potênciação resulta em " 
                + potencia(base,expoente));
    }
    
    public static int potencia(int base, int expoente){
        int potencia = 1, índice = 1;
        
        while(expoente >= índice){
            potencia = produto(potencia,base);
            índice++;
        }
        return potencia;
    }
}
