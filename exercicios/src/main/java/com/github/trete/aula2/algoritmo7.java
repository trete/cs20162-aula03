
package aula2;

import java.util.Scanner;

/**
 * Programa que calcula o maior divisor comum entre dois inteiros
 */
public class algoritmo7 {
    public static void main(String[] args) {
        System.out.println("insira o maior número para o cálculo do maior "
                + "divisor comum");
        
        Scanner leitor = new Scanner(System.in);
        
        int a = Integer.parseInt(leitor.nextLine());
        
        System.out.println("insira o outro");
        
        int b = Integer.parseInt(leitor.nextLine());
        
        System.out.println("o maior divisor comum é "
                + maiorDivisorComum(a,b));
    }
    
    /**
     *
     * @param a Número com maior valor modular para o cálculo do maior divisor 
     * comum
     * 
     * @param b Número com menor valor modular para o cálculo do maior divisor
     * comum
     * 
     * @return O maior divisor comum entre os inteiros a e b
     * 
     */
    public static int maiorDivisorComum(int a,int b){
        int m;
        
        while(b != 0){
            m = a % b;
           
            a = b;
            
            b = m;
        }
        
        return a;
    }
}