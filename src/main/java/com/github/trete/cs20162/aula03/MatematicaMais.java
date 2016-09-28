
package com.github.trete.cs20162.aula03;

import static com.github.trete.cs20162.aula03.Matematica.potencia;

public class MatematicaMais {
 /**
  *Obtem o valor da soma elementar do numero especificado 
  * 
 * @param numero O índice do elemento até qual serão somados os elementares
 * 
 * @throws IllegalArgumentException 
 *      para valores de parâmetro menores ou iguais a 1
 * 
 * @return O valor numérico da soma elementar até o numero
 * 
 */
    public double somaElementar(int numero)throws IllegalArgumentException{
        if(numero <= 1){
            throw new IllegalArgumentException("valor invalido para calculo");
        }
        
        int indice = 1;
        
        double soma = 0, divisor;
        
        while(indice <= numero){
            divisor = 1 + (indice * indice);
            
            soma += 1 / divisor;
            
            indice++;
        }
        
        return soma;
    }
   
 /**
  *Obtem o valor aproximado de pi com qntCasas casas decimais 
  * 
 * @param qntCasas A quantidade de casas decimais que quer se obter
 * do valor de pi
 *
 * @return O valor de pi com a quantidade de casas decimais igual a qntCasas
 * 
 * @throws IllegalArgumentException se qntCasas for menor ou igual a 1
 */    
    public double valorPi(int qntCasas)throws IllegalArgumentException{
        if(qntCasas <= 1){
            throw new IllegalArgumentException("valor invalido para calculo");
        }
        
        int indice = 1, denominador = -1;
        
        double pi = 0, soma = -1;
        
        while(indice <= qntCasas){
            denominador += 2;
            
            soma *= -1;
            
            pi += 4 * soma / denominador;
            
            indice++;
        }
        
        return pi;
    }
    
 /**
  * Obtem o valor de um numero fatorial
  * 
 * @param numero O valor do inteiro que será fatorado
 * 
 * @return O valor do numero usado como parâmetro fatorado
 * 
 * @throws IllegalArgumentException se o número a ser fatorado for
 * menor ou igual a 1
 */
    public int fatorial(int numero)throws IllegalArgumentException{
        if(numero <= 1){
            throw new IllegalArgumentException("valor invalido para calculo");
        }
        
        int indice = 2, fatorial = 1;
        
        while(indice <=numero){
            fatorial *= indice;
            
            indice++;
        }
        
        return fatorial;
    }
    
 /**
  * Obtem o valor aproximado do logaritmo de um natural
  * 
 * @param numero Numero sobre o qual será calculado o logaritmo
 * 
 * @param base Base sobre a qual será calculada o loagaritmo
 * 
 * @return O valor aproximado ao qual o parametro base deve ser exponenciada
 * para obter-se o parametro numero
 * 
 * @throws IllegalArgumentException se a base for menor que 2 ou se
 * o numero for menor que 1
 */
    public double logaritmo(int numero,int base)throws IllegalArgumentException{
        if(base < 2 || numero < 1){
            throw new IllegalArgumentException("valor invalido para calculo");
        }
        
        int indice = 2, potencia, fatorial;
        
        double logaritmo = numero + 1;
        
        while(indice <= base){
            potencia = potencia(numero, indice);
            
            fatorial = fatorial(indice);
            
            logaritmo += potencia / fatorial;
            
            indice++;
        }
        
        return logaritmo;
    }
    
    
}
