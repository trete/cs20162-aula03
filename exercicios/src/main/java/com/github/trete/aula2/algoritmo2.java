
package aula2;

import java.util.Scanner;

/**
 * Programa que calcula o produto de inteiros positivos usando somas
 */
public class algoritmo2 {
    
    public static void main(String[] args) {
        System.out.println("Insira os dois números a serem multiplicados");
        
        Scanner leitor = new Scanner(System.in);
        
        int a = Integer.parseInt(leitor.nextLine());
        int b = Integer.parseInt(leitor.nextLine());
        
        System.out.println("o produto vale " + produto(a,b));
    }
    
    public static int produto(int a, int b){
        int produto = 0, índice;
        
        for(índice = 0; índice < b; índice++){
            produto = produto + a;
        }
        return produto;
    }
}
