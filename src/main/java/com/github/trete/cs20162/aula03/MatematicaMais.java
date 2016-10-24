/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.trete.cs20162.aula03;

import com.trete.cs20162.aula02.Matematica;
/**
 * Mais métodos de operações matemáticas.
 */
public abstract class MatematicaMais {
    /**
     * valor obtido através de testes, qualquer número de operações abaixo
     * deste resultará em erro no método valorPi.
     */
    private static final int APROXIMACAO_MINIMA = 634;

    /**
     * número pelo qual se multiplica a divisão entre soma e divisor para se
     * obtero valor aproximado de pi no método valorPi.
     */
    private static final int FATOR_DEOBTENCAO_DE_PI = 4;

    /**
     * Obtem o valor da soma elementar do numero especificado.
     *
     * @param numero O índice do elemento até qual serão somados os elementares.
     *
     * @throws IllegalArgumentException para valores de parâmetro menores ou
     * iguais a 1.
     *
     * @return O valor numérico da soma elementar até o numero.
     *
     */
    public static double somaElementar(final int numero)
            throws IllegalArgumentException {
        if (numero <= 1) {
            throw new IllegalArgumentException("valor menor ou igual a 1");
        }

        int indice = 1;

        double soma = 0, divisor;

        while (indice <= numero) {
            divisor = 1 + (indice * indice);

            soma += 1 / divisor;

            indice++;
        }

        return soma;
    }

    /**
     * Obtem o valor aproximado de pi.
     *
     * @param precisao A quantidade de termos utilizados para a soma que
     * calcula o valor de pi, maiores valores resultam numa precisão maior.
     *
     * @return O valor aporximado de pi.
     *
     * @throws IllegalArgumentException se precisao for menor ou igual a 1.
     */
    public static double valorPi(final int precisao)
            throws IllegalArgumentException {
        if (precisao <= 1) {
            throw new IllegalArgumentException("valor menor ou igual a 1");
        }

        int indice = 1;

        double pi = 0, soma = -1, denominador = -1;

        while (indice <= precisao + APROXIMACAO_MINIMA) {
            denominador += 2;

            soma *= -1;

            pi += FATOR_DEOBTENCAO_DE_PI * soma / denominador;

            indice++;
        }

        return pi;
    }

    /**
     * Obtem o valor de um numero fatorial.
     *
     * @param numero O valor do inteiro que será fatorado.
     *
     * @return O valor do numero usado como parâmetro fatorado.
     *
     * @throws IllegalArgumentException se o número a ser fatorado for menor ou
     * igual a 1.
     */
    public static int fatorial(final int numero)
            throws IllegalArgumentException {
        if (numero < 1) {
            throw new IllegalArgumentException("valor menor que 1");
        }

        int indice = 2, fatorial = 1;

        while (indice <= numero) {
            fatorial *= indice;

            indice++;
        }

        return fatorial;
    }

    /**
     * Obtem o valor aproximado do logaritmo de um natural.
     *
     * @param numero Numero sobre o qual será calculado o logaritmo.
     *
     * @param base Base sobre a qual será calculada o loagaritmo.
     *
     * @return O valor aproximado ao qual o parametro base deve ser exponenciada
     * para obter-se o parametro numero.
     *
     * @throws ArithmeticException se a base for menor que 2 ou se o numero
     * for menor que 1.
     */
    public static double logaritmo(final int numero, final int base)
            throws ArithmeticException {
        if (base < 2 || numero < 1) {
            throw new ArithmeticException("base menor que 2 ou numero "
                    + "menor que 1");
        }

        int indice = 1, potencia = 0;

        double logaritmo = 0;

        while (potencia != numero) {
            potencia = Matematica.potencia(base, indice);

            if (potencia == numero) {
                logaritmo = indice;
            }

            indice++;
        }

        return logaritmo;
    }

/**
 * Obtém a razão Aurea baseado em dois números e na precisão desejada da mesma.
 *
 * @param primeiroAureo O primeiro número conhecido da razão que deseja-se
 * obter.
 *
 * @param segundoAureo O segundo número conhecido da razão que deseja-se obter.
 *
 * @param precisao O número de vezes que o cálculo da razão será feito, quanto.
 * maior, mais precisa a razão
 *
 * @return O valor numérico da razão aurea construída pelos parâmetros.
 *
 * @throws IllegalArgumentException se primeiroAureo for negativo, se
 * segundoAureo for menor que primeiroAureo, e se a precisao for menor ou igual
 * a 0.
 */
    public static double
        razaoAurea(final int primeiroAureo, final int segundoAureo,
                final int precisao)throws IllegalArgumentException {
        if (primeiroAureo < 0
                || segundoAureo < primeiroAureo || precisao <= 0) {
            throw new IllegalArgumentException("um ou mais parâmetros"
                    + " são negativos ou a precisão é igual a 0");
        }

        int construtorAureoPrimario = segundoAureo,
                construtorAureoSecundario = primeiroAureo,
                indice = 1;

        int construtorAureoTerciario;

        double razaoAurea = 1;

        while (indice < precisao) {
            construtorAureoTerciario = construtorAureoPrimario;

            construtorAureoPrimario += construtorAureoSecundario;

            construtorAureoSecundario = construtorAureoTerciario;

            razaoAurea = construtorAureoPrimario / construtorAureoSecundario;

            indice++;
        }

        return razaoAurea;
    }

 /**
  *Obtém o valor lógico da propriedade de um inteiro de ser um quadradoPerfeito.
  *
 *@param numero O número que será checado.
 *
 *@return O valor lógico da propriedade de um iteiro de ser um quadradoPerfeito.
 *
 *@throws IllegalArgumentException se numero for menor que 1.
 */
    public static boolean quadradoPerfeito(final int numero)
        throws IllegalArgumentException {
        if (numero < 1) {
            throw new IllegalArgumentException("parâmetro menor ou igaul a 0");
        }
        int indice = 0, checador = 1;

        while (indice < numero / 2) {
            checador += 2;

            indice++;
        }

        return numero == checador;
        }

 /**
  *Obtém o resto de uma divisão inteira.
  *
 *@param dividendo O número que será dividido pelo divisor para
 * obtenção do resto.
 *
 *@param divisor O número que dividirá o dividendo para obtenção do resto.
 *
 *@return O valor numérico do resto da divisão inteira
 * do dividendo pelo divisor.
 *
 *@throws IllegalArgumentException se o dividendofor negativo ou
 * se o divisor for menor ou igual a 0.
 */
    public static int resto(final int dividendo, final int divisor)
        throws IllegalArgumentException {
        if (dividendo < 0 || divisor <= 0) {
            throw new IllegalArgumentException(
                    "um ou mais parâmetros negativos ou divisor menor que 0");
        }

        int resto = dividendo;

        while (divisor <= resto) {
            resto -= divisor;
        }

        return resto;
    }

/**
 *Obtém o valor aproximado da raiz quadrada de um número.
 *
*@param numero O número que terá sua raiz quadrada calculada.
*
*@param indice A quantidade de vezes que será feito o cálculo:
* quanto maior, mais preciso o valor de retorno.
*
*@return O valor numérico aproximado da raiz quadrada do parâmetro numero.
*
*@throws IllegalArgumentException se numero for menor que 0 ou
* se indice for menor ou igual a 0.
*/
    public static double raizQuadrada(final double numero, final int indice)
        throws IllegalArgumentException {
        if (numero < 0 || indice <= 0) {
            throw new IllegalArgumentException(
                     "um ou mais parâmetros negativos ou índice menor que 0");
        }

        double raiz = 1;
        int indiceAux = indice;
        while (indiceAux >= 0) {
            raiz = (raiz + numero / raiz) / 2;

            indiceAux--;
        }

        return raiz;
    }

/**
 *Obtém o valor de um polinomio com coeficientes num vetor para
 * um valor de x especificado.
 *
*@param x O valor especificado de x.
*
*@param grau O grau do polinomio.
*
*@param coeficiente O vetor com os coeficientes do polinomio.
*
*@return O valor numérico do polinomio para o x especificado.
*
*@throws IllegalArgumentException se o grau for menor que 1.
*/
    public static double regraHorner(final double x, final int grau,
            final double[] coeficiente)throws IllegalArgumentException {
        if (grau <= 1) {
            throw new IllegalArgumentException("parâmetro menor ou igual a 1");
        }

        double polinomio = coeficiente[grau];

        int indice = grau - 1;

        while (indice >= 0) {
            polinomio = polinomio * x + coeficiente[indice];

            indice--;
        }

        return polinomio;
    }

/**
 *Obtém o numero-ésimo número da sequência de fibonacci.
 *
*@param numero O valor da ordem do número da sequência de Fibonacci que se
* deseja obter
*
*@return O valor numérico do numero-ésimo número da sequência de fibonacci
*
*@throws IllegalArgumentException se numero for menor ou igual a 0
*/
    public static int fibonacci(final int numero)
            throws IllegalArgumentException {
        if (numero <= 0) {
            throw new IllegalArgumentException("parâmetro menor ou igual a 0");
        }

        int primeiro = 0, segundo = 1, segundoAux;

        if (numero == 1) {
            return numero;
        }
        int indice = 2;

        while (indice <= numero) {
            segundoAux = segundo;

            segundo += primeiro;

            primeiro = segundoAux;

            indice++;
        }

        return segundo;
    }
}
