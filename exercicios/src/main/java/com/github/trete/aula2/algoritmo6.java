package aula2;

import java.util.Scanner;

/**
 * Programa que verifica se um número é primo
 */
public class algoritmo6 {

    public static void main(String[] args) {
        System.out.println("insira um número");
        
        Scanner leitor = new Scanner(System.in);
        
        int n = Integer.parseInt(leitor.nextLine());
        
        if(verificaPrimo(n)){
            System.out.println("o número é primo");
        }
        else{
            System.out.println("o número não é primo");
        }
    }

    /**
     *
     * @param n Numero inserido pelo usuário que será verificado se é um primo
     * @return O valor lógico da afirmação de que o parâmetro n é primo
     */
    public static boolean verificaPrimo(int n) {
        int i = 2;

        while (i <= (n - 1)) {
            if (n % i == 0) {
                return false;
            }            
        }
        return true;
    }
    
//    public static void crivoErastotenes(int[] a,int n){
//        int i = 2;
//        
//        while(i <= n / 2){
//            if(a[i] == 0){
//                
//                int c = i + i;
//                
//                while(c <= n){
//                    a[c] = 1;
//                    c = c + i;
//                }
//            }
//            i++;
//        }
//    }
    
}
