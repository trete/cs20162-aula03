
package com.trete.cs20162.aula02;
/**
 * Métodos de operações matemáticas.
 */
public abstract class Matematica {
    /**
     * número usado para separar algarismos à esquerda e direita da casa das
     * centenas.
     */
    private static final int LIMIAR_CENTENA = 100;

    /**
     * número situado entre os positivos e negativos.
     */
    private static final int LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS = 0;

    /**
     * número usado para separar algarismos à esquerda e direita da casa das
     * dezenas.
     */
    private static final int LIMIAR_DEZENA = 10;

    /**
     * número pelo qual se divide um valor qualquer para obter-se sua metade.
     */
    private static final int EXTRAI_METADE = 2;

    /**
     * menor número inteiro que é maior que 1.
     */
    private static final int PRIMEIRO_INTEIRO_MAIOR_QUE_UM = 2;

    /**
     * maior número inteiro que é menor que 10000.
     */
    private static final int MAIOR_INTEIRO_MENOR_QUE_DEZ_MIL = 9999;

 /**
  * Obtem o valor da soma dos primeors n naturais.
  *
 * @param numero A quantidade de números naturais a serem somados em ordem.
 *
 * @return O valor numérico da soma dos primeiros "numero" naturais.
 */
    public static int somaNaturais(final int numero) {
        if (numero <= LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS) {
            throw new IllegalArgumentException("valor menor ou igual a 0");
        }
        int soma;

        soma = numero * (numero + 1) / EXTRAI_METADE;

        return soma;
    }

 /**
 * Obtém o produto entre dois naturais.
 *
* @param primeiroFator Número a ser somado a si mesmo segundoFator vezes.
*
* @param segundoFator Número de vezes que primeiroFator será somado a si mesmo.
*
* @return O valor numérico do produto entre o primeiro fator e o segundo fator.
*/
    public static int produto(final int primeiroFator, final int segundoFator) {
        if (primeiroFator < LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS
                || segundoFator < LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS) {
            throw new IllegalArgumentException("um ou mais valores negativos");
        }

        int produto = LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS, indice;

        for (indice = LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS; indice < segundoFator;
                indice++) {
            produto = produto + primeiroFator;
        }
        return produto;
    }

 /**
  * Obtém o resultado da potência enre uma base e um expoente.
  *
 * @param base O número a ser elevado ao expoente.
 *
 * @param expoente O número ao qual a base será elevada.
 *
 * @throws IllegalArgumentException Se a base ou o expoente forem menores
 * ou igais a 0.
 *
 * @return O valor numéirco da potência na qual
 * base é a base e expoente é o expoente.
 */
    public static int potencia(final int base, final int expoente) {
        if (base <= LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS
                || expoente <= LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS) {
            throw new IllegalArgumentException(
                "um ou mais valores negativos ou expoente igual a 0");
        }

        int potencia = 1, indice = 1;

        while (expoente >= indice) {
            potencia = produto(potencia, base);
            indice++;
        }
        return potencia;
    }

  /**
   * Verifica a propriedade 3025 em um número inteiro entre 0 e 9999.
   *
 *
 * @param numero O número no qual será verificada a propriedade 3025.
 *
 * @throws IllegalArgumentException se o número for menor ou igual a 0 ou
 * maior ou igual a 9999.
 *
 * @return O valor lógico da existencia da propriedade 3025 em número.
 */
    public static boolean verificaPropriedade3025(final int numero) {
        if (numero >= LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS
                && numero <= MAIOR_INTEIRO_MENOR_QUE_DEZ_MIL) {
            boolean propriedade;

            int verificador = numero / LIMIAR_CENTENA + numero % LIMIAR_CENTENA;

            verificador = verificador * verificador;

            propriedade = verificador == numero;

            return propriedade;
        } else {
            throw new IllegalArgumentException("valor menor que 0"
                    + " ou maior que 9999");
        }
    }

 /**
  * Verifica a propriedade 153 em um inteiro entre 0 e 9999.
  *
*
* @param numero O número no qual será verificada a propriedade 153.
*
* @throws IllegalArgumentException se o número for menor ou igual a 0 ou
* maior ou igual a 9999.
*
* @return O valor lógico da existencia da propriedade 153 em número.
*/
    public static boolean verificaPropriedade153(final int numero) {
        if (numero < LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS
                || numero > MAIOR_INTEIRO_MENOR_QUE_DEZ_MIL) {
            throw new IllegalArgumentException("número tem que ser maior que 0"
                    + " e menor que 10000");
        }

        int i = numero / LIMIAR_CENTENA;
        int j = (numero - LIMIAR_CENTENA * i) / LIMIAR_DEZENA;
        int k = numero % LIMIAR_DEZENA;

        return i * i * i + j * j * j + k * k * k == numero;
    }

 /**
  * Verifica se um natural é primo.
  *
* @param numero O número que será verificado se é primo.
*
* @return O valor lógico da propriedade de ser primo em numero.
*/
    public static boolean verificaPrimo(final int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("o número deve ser maior que 1");
        }

        int i = PRIMEIRO_INTEIRO_MAIOR_QUE_UM;

        while (i <= (numero - 1)) {
            if (numero % i == LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS) {
                return false;
            }
            i++;
        }
        return true;
    }

 /**
  * Obtém o maior divisor comum entre dois naturais.
  *
* @param primeiroNumero Maior número no cálculo de maior divisor comum.
*
* @param segundoNumero Menor número no cálculo de maior divisor comum.
*
* @throws IllegalArgumentException se primeiroNumero for maior que
* segundoNumero.
*
* @throws IllegalArgumentException se segundoNumero for negativo.
*
* @return O valor numérico do maior divisor comum enre
* primeiroNumero e segundoNumero.
*/
    public static int maiorDivisorComum(final int primeiroNumero,
            final int segundoNumero) {
        if (segundoNumero > primeiroNumero) {
            throw new IllegalArgumentException("o primeiro parâmetro deve ser "
                    + "maior ou igual ao segundo");
        }
        if (segundoNumero < LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS) {
            throw new IllegalArgumentException("os parâmetros"
                    + " devem ser positivos");
        }

        int m;
        int primeiroNumeroAux = primeiroNumero,
                segundoNumeroAux = segundoNumero;

        while (segundoNumeroAux != LIMIAR_ENTRE_POSITIVOS_E_NEGATIVOS) {
            m = primeiroNumeroAux % segundoNumeroAux;

            primeiroNumeroAux = segundoNumeroAux;

            segundoNumeroAux = m;
        }

        return primeiroNumeroAux;
    }

 /**
  * Obtém o enésimo número harmônico da sequência.
  *
* @param numero Tamanho da sequencia de números harmônicos somados.
*
* @throws IllegalArgumentException se numero for menor que 1.
*
* @return O valor numérico do enésimo número harmônico.
*/
    public static double numeroHarmonico(final int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("o número deve ser maior "
                    + "ou igual a 1");
        }
        double i = PRIMEIRO_INTEIRO_MAIOR_QUE_UM, s = 1;

        while (i <= numero) {
            s += 1 / i;
            i++;
        }
        return s;
    }
}
