package aula2;

import java.util.Scanner;

/**
 * Programa que verifica se o quadrado da soma do quociente e do resto da
 * divisão de um número por 100 resulta no número inicial
 */
public class algoritmo4 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número");
        
        int número = Integer.parseInt(leitor.nextLine());
        
        if(verificaPropriedade3025(número)){
            System.out.println("o número " + número + "apresenta a"
                    + " propriedade 3025");
        } else {
            System.out.println("o número" + número + "não apresenta a"
                    + " propriedade 3025");
        }
        
    }
    
    /**
     *
     * @param número O número inserido pelo usuário, no qual será testada a
     * propriedade 3025. Valor entre 0 e 9999
     * 
     * @throws IllegalArugumentException Se o número for maior  ue 9999 ou menor
     * que 0
     * 
     * @return O valor lógico do teste da propriedade 3025
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
    
}
