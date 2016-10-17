
package com.trete.cs20162.aula02;

public class Matematica {
    
 /** 
  * Obtem o valor da soma dos primeors n naturais.
  * 
 * @param numero A quantidade de números naturais a serem somados em ordem
 * 
 * @return O valor numérico da soma dos primeiros "numero" naturais
 */
    public static int somaNaturais(int numero){
        if(numero <= 0){
            throw new IllegalArgumentException("valor menor ou igual a 0");
        }
        int soma;
        
        soma = numero * (numero + 1) / 2;
        
        return soma;
    }
    
 /**
 * Obtém o produto entre dois naturais.
 * 
* @param primeiroFator Número a ser somado a si mesmo segundoFator vezes
* 
* @param segundoFator Número de vezes que primeiroFator será somado a si mesmo
* 
* @return O valor numérico do produto entre o primeiro fator e o segundo fator
*/
    public static int produto(int primeiroFator, int segundoFator){
        if(primeiroFator < 0 || segundoFator < 0){
            throw new IllegalArgumentException("um ou mais valores negativos");
        }
        
        int produto = 0, índice;
        
        for(índice = 0; índice < segundoFator; índice++){
            produto = produto + primeiroFator;
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
            throw new IllegalArgumentException
                ("um ou mais valores negativos ou expoente igual a 0");
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
 * @param numero O número no qual será verificada a propriedade 3025
 * 
 * @throws IllegalArgumentException se o número for menor ou igual a 0 ou 
 * maior ou igual a 9999
 * 
 * @return O valor lógico da existencia da propriedade 3025 em número
 */
    public static boolean verificaPropriedade3025(int numero){
        if(numero >= 0 && numero<=9999){
            boolean propriedade;
            
            int verificador = numero / 100 + numero%100;
            
            verificador = verificador * verificador;
            
            propriedade = verificador == numero;
            
            return propriedade;
        }
        else{
            throw new IllegalArgumentException("valor menor que 0"
                    + " ou maior que 9999");
        }
    }
    
 /**
  * Verifica a propriedade 153 em um inteiro entre 0 e 9999.
  * 
* 
* @param numero O número no qual será verificada a propriedade 153
* 
* @throws IllegalArgumentException se o número for menor ou igual a 0 ou 
* maior ou igual a 9999
* 
* @return O valor lógico da existencia da propriedade 153 em número
*/
    public static boolean verificaPropriedade153(int numero){
        if(numero < 0 || numero > 9999){
            throw new IllegalArgumentException("número tem que ser maior que 0"
                    + " e menor que 10000");
        }
        
        boolean propriedade;
        
        int i = numero / 100 ;
        int j = (numero - 100 * i) / 10;
        int k = numero % 10;
        
        return propriedade = (i * i * i + j * j * j + k * k * k) == numero;
    }
    
 /**
  * Verifica se um natural é primo.
  * 
* @param numero O número que será verificado se é primo
* 
* @return O valor lógico da propriedade de ser primo em numero
*/
    public static boolean verificaPrimo(int numero) {
        if(numero <= 1){
            throw new IllegalArgumentException("o número deve ser maior que 1");
        }
        
        int i = 2;

        while (i <= (numero - 1)) {
            if (numero % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
    
 /**
  * Obtém o maior divisor comum entre dois naturais.
  * 
* @param primeiroNumero Maior número no cálculo de maior divisor comum
* 
* @param segundoNumero Menor número no cálculo de maior divisor comum
* 
* @throws IllegalArgumentException se primeiroNumero for maior que segundoNumero
* 
* @throws IllegalArgumentException se segundoNumero for negativo
* 
* @return O valor numérico do maior divisor comum enre
* primeiroNumero e segundoNumero
*/
    public static int maiorDivisorComum(int primeiroNumero,int segundoNumero){
        if(segundoNumero < primeiroNumero){
            throw new IllegalArgumentException("o primeiro parâmetro deve ser"
                    + "maior ou igual ao segundo");
        }
        if(segundoNumero<0){
            throw new IllegalArgumentException("os parâmetros "
                    + "devem ser positivos");
        }
        
        int m;
        
        while(segundoNumero != 0){
            m = primeiroNumero % segundoNumero;
           
            primeiroNumero = segundoNumero;
            
            segundoNumero = m;
        }
        
        return primeiroNumero;
    }
    
 /**
  * Obtém o enésimo número harmônico da sequência.
  * 
* @param numero Tamanho da sequencia de números harmônicos somados
* 
* @throws IllegalArgumentException se numero for menor que 1
* 
* @return O valor numérico do enésimo número harmônico
*/
    public static double numeroHarmonico(int numero){
        if(numero < 1){
            throw new IllegalArgumentException("o número deve ser maior "
                    + "ou igual a 1");
        }
        double i = 2, s = 1;
        
        while(i <= numero){
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
