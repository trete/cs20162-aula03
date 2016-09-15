package com.github.trete.aula2;

import java.util.Scanner;

/**
 * Programa que calcula a soma dos primeiros n números naturais
 */
public class Matematica {
    public static int somaNaturais(int n){
        int soma;
        
        soma = n * (n + 1) / 2;
        
        return soma;
    }
    
    public static int produto(int a, int b){
        int produto = 0, índice;
        
        for(índice = 0; índice < b; índice++){
            produto = produto + a;
        }
        return produto;
    }
    
    public static int potencia(int base, int expoente){
        int potencia = 1, índice = 1;
        
        while(expoente >= índice){
            potencia = produto(potencia,base);
            índice++;
        }
        return potencia;
    }
    
    public static boolean verificaPropriedade3025(int número){
        if(número >= 0 && número<=9999){
            boolean propriedade;
            
            int verificador = número / 100 + número%100;
            
            verificador = verificador * verificador;
            
            propriedade = verificador == número;
            
            return propriedade;
        }
        else{
            throw new IllegalArgumentException("valor inválido para teste");
        }
    }
    
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
    
    public static boolean verificaPrimo(int n) {
        int i = 2;

        while (i <= (n - 1)) {
            if (n % i == 0) {
                return false;
            }            
        }
        return true;
    }
    
    public static int maiorDivisorComum(int a,int b){
        int m;
        
        while(b != 0){
            m = a % b;
           
            a = b;
            
            b = m;
        }
        
        return a;
    }
    
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
    
//    public static int[] crivoErastotenes(int[] a,int n){
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
//        return a;
//    }
}
