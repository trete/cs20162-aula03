package aula2;

import java.util.Scanner;

/**
 * Programa que calcula o n-ésimo número harmonico
 */
public class algoritmo8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("insira a posição n do número harmônico");
        
        int n = Integer.parseInt(leitor.nextLine());
        
        System.out.println("o número harmônico dessa posição é"
                + numeroHarmonico(n));
    }
    
    /**
     *
     * @param n Posição n do n-ésimo número harmônico
     * 
     * @return O número harmônico da n-ésima posição
     * 
     * @throws IllegalArgumentException se n for mernor que 1
     */
    public static double numeroHarmonico(int n){
        if(n < 1){
            throw new IllegalArgumentException("o número deve ser maior "
                    + "ou igual a 1");
        }
        double i = 2, s = 1;
        
        while(i <= n){
            s += 1 / i;
            i++;
        }
        return s;
    }
}
