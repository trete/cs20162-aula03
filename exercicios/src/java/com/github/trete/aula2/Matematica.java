package com.github.trete.aula2;

public class Matematica {
    
 /** 
  * Obtem o valor da soma dos primeors n naturais.
  * 
 * @param n A quantidade de números naturais a serem somados em ordem
 * 
 * @throws IllegalArugumentException Se o número for menor ou igual a 0
 * 
 * @return O valor numérico da soma dos primeiros n naturais
 */
    public static int somaNaturais(int n){
        if(n <= 0){
            throw new IllegalArgumentException("valor inválido");
        }
        int soma;
        
        soma = n * (n + 1) / 2;
        
        return soma;
    }
    
 /**
 * Obtém o produto entre dois naturais.
 * 
* @param a Número a ser somado a si mesmo b vezes
* 
* @param b Número de vezes que a será somado a si mesmo
* 
* @throws IllegalArgumentExcepion se um dos parâmetros for negativo
* 
* @return O valor numérico do produto entre a e b
*/
    public static int produto(int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("valor inválido");
        }
        
        int produto = 0, índice;
        
        for(índice = 0; índice < b; índice++){
            produto = produto + a;
        }
        return produto;
    }
    
 /**
  * Obtém o resultado da potência enre uma base e um expoente.
  * 
 * @param base O número a ser elevado ao expoente
 * 
 * @param expoente O número ao qual a base será elevada
 * 
 * @throws IllegalArgumentException Se a base ou o expoente forem menores
 * ou igais a 0
 * 
 * @return O valor numéirco da potência na qual
 * base é a base e expoente é o expoente
 */
    public static int potencia(int base, int expoente){
        if(base <= 0 || expoente <=0){
            throw new IllegalArgumentException("valor inválido");
        }
        
        int potencia = 1, índice = 1;
        
        while(expoente >= índice){
            potencia = produto(potencia,base);
            índice++;
        }
        return potencia;
    }
    
  /**
   * Verifica a propriedade 3025 em um número inteiro entre 0 e 9999.
   * 
 * 
 * @param número O número no qual será verificada a propriedade 3025
 * 
 * @throws IllegalArgumentException se o número for menor ou igual a 0 ou 
 * maior ou igual a 9999
 * 
 * @return O valor lógico da existencia da propriedade 3025 em número
 */
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
    
 /**
  * Verifica a propriedade 153 em um inteiro entre 0 e 9999.
  * 
* 
* @param n O número no qual será verificada a propriedade 153
* 
* @throws IllegalArgumentException se o número for menor ou igual a 0 ou 
* maior ou igual a 9999
* 
* @return O valor lógico da existencia da propriedade 153 em número
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
    
 /**
  * Verifica se um natural é primo.
  * 
* @param n O número que será verificado se é primo
* 
* @throws IlegalArgumentException se o número for menor ou igual a 1
* 
* @return O valor lógico da propriedade de ser primo em n
*/
    public static boolean verificaPrimo(int n) {
        if(n <= 1){
            throw new IllegalArgumentException("o número deve ser maior que 1");
        }
        
        int i = 2;

        while (i <= (n - 1)) {
            if (n % i == 0) {
                return false;
            }            
        }
        return true;
    }
    
 /**
  * Obtém o maior divisor comum entre dois naturais.
  * 
* @param a Maior número no cálculo de maior divisor comum
* 
* @param b Menor número no cálculo de maior divisor comum
* 
* @throws IllegalArgumentException se a for maior que b
* 
* @throws IllegalArgumentException se b for negativo
* 
* @return O valor numérico do maior divisor comum enre a e b
*/
    public static int maiorDivisorComum(int a,int b){
        if(b < a){
            throw new IllegalArgumentException("o primeiro parâmetro deve ser"
                    + "maior ou igual ao segundo");
        }
        if(b<0){
            throw new IllegalArgumentException("os parâmetros "
                    + "devem ser positivos");
        }
        
        int m;
        
        while(b != 0){
            m = a % b;
           
            a = b;
            
            b = m;
        }
        
        return a;
    }
    
 /**
  * Obtém o enésimo número harmônico da sequência.
  * 
* @param n Tamanho da sequencia de números harmônicos somados
* 
* @throws IllegalArgumentException se n for menor que 1
* 
* @return O valor numérico do enésimo número harmônico
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
