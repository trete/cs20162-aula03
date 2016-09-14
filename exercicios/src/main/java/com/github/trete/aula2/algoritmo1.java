package com.github.trete.aula2;

import java.util.Scanner;

/**
 * Programa que calcula a soma dos primeiros n números naturais
 */
public class Aula2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de naturais" +
                 "a serem somados desde o primeiro");
        
        int n = Integer.parseInt(leitor.nextLine());
        
        System.out.println("a soma vale " + somaNaturais(n));
        
        
    }

    public static int somaNaturais(int n){
        int soma;
        
        soma = n * (n + 1) / 2;
        
        return soma;
    }
}
