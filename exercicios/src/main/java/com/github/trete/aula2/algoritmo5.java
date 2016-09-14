package aula2;

import java.util.Scanner;

/**
 * Programa que verifica se a soma dos cubos dos dígitos de um número resulta
 * no número inicial
 */
public class algoritmo5 {
    public static void main(String[] args) {
        System.out.println("insira um número");
        
        Scanner leitor = new Scanner(System.in);
         int n = Integer.parseInt(leitor.nextLine());
         
         if(verificaPropriedade153(n)){
             System.out.println("o número apresenta a propriedade 153");
         }
         else{
             System.out.println("o número não apresenta a propriedade 153");
         }
    }
    
    /**
     *
     * @param n número inserido pelo usuário, que terá a propriedade 153
     * testada nesse método
     * 
     * @return O valor lógico da presença da propriedade 153
     * 
     * @throws IllegalArgumentException se n for menor que 0 ou maior que 9999
     */
    public static boolean verificaPropriedade153(int n){
        if(n < 0 || n>9999){
            throw new IllegalArgumentException("número tem que ser maior que 0"
                    + " e menor que 10000");
        }
        
        boolean propriedade;
        
        int i = n / 100 ;
        int j = (n - 100 * i) / 10;
        int k = n % 10;
        
        return propriedade = (i * i * i + j * j * j + k * k * k) == n;
    }
    
}
