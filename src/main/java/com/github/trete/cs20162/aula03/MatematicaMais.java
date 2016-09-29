package com.github.trete.cs20162.aula03;

import static com.github.trete.cs20162.aula03.Matematica.potencia;

public class MatematicaMais {

    /**
     * Obtem o valor da soma elementar do numero especificado
     *
     * @param numero O índice do elemento até qual serão somados os elementares
     *
     * @throws IllegalArgumentException para valores de parâmetro menores ou
     * iguais a 1
     *
     * @return O valor numérico da soma elementar até o numero
     *
     */
    public static double somaElementar(int numero) throws IllegalArgumentException {
        if (numero <= 1) {
            throw new IllegalArgumentException("valor invalido para calculo");
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
     * Obtem o valor aproximado de pi com qntCasas casas decimais
     *
     * @param qntCasas A quantidade de casas decimais que quer se obter do valor
     * de pi
     *
     * @return O valor de pi com a quantidade de casas decimais igual a qntCasas
     *
     * @throws IllegalArgumentException se qntCasas for menor ou igual a 1
     */
    public static double valorPi(int qntCasas) throws IllegalArgumentException {
        if (qntCasas <= 1) {
            throw new IllegalArgumentException("valor invalido para calculo");
        }

        int indice = 1, denominador = -1;

        double pi = 0, soma = -1;

        while (indice <= qntCasas) {
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
     * @throws IllegalArgumentException se o número a ser fatorado for menor ou
     * igual a 1
     */
    public static int fatorial(int numero) throws IllegalArgumentException {
        if (numero < 1) {
            throw new IllegalArgumentException("valor invalido para calculo");
        }

        int indice = 2, fatorial = 1;

        while (indice <= numero) {
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
     * @throws IllegalArgumentException se a base for menor que 2 ou se o numero
     * for menor que 1
     */
    public static double logaritmo(int numero, int base)
            throws IllegalArgumentException {
        if (base < 2 || numero < 1) {
            throw new IllegalArgumentException("valor invalido para calculo");
        }

        int indice = 2, potencia, fatorial;

        double logaritmo = numero + 1;

        while (indice <= base) {
            potencia = potencia(numero, indice);

            fatorial = fatorial(indice);

            logaritmo += potencia / fatorial;

            indice++;
        }

        return logaritmo;
    }

/**
 * Obtém a razão Aurea baseado em dois números e na precisão desejada da mesma
 *
 * @param primeiroAureo O primeiro número conhecido da razão que deseja-se obter
 *
 * @param segundoAureo O segundo número conhecido da razão que deseja-se obter
 *
 * @param precisao O número de vezes que o cálculo da razão será feito, quanto
 * maior, mais precisa a razão
 *
 * @return O valor numérico da razão aurea construída pelos parâmetros
 *
 * @throws IllegalArgumentException se primeiroAureo for negativo, se
 * segundoAureo for menor que primeiroAureo, e se a precisao for menor ou igual
 * a 0
 */
    public static double razaoAurea(int primeiroAureo, int segundoAureo, int precisao)
            throws IllegalArgumentException{
        if(primeiroAureo < 0 || segundoAureo < primeiroAureo || precisao <= 0){
            throw new IllegalArgumentException("um ou mais parâmetros"
                    + " são inválidos");
	}

        int construtorAureoPrimario = segundoAureo,
                construtorAureoSecundario = primeiroAureo,
                indice = 1;
		
        int construtorAureoTerciario;
            
        double razaoAurea = 1;
            
        while(indice < precisao){
            construtorAureoTerciario = construtorAureoPrimario;
			
            construtorAureoPrimario += construtorAureoSecundario;
			
            construtorAureoSecundario = construtorAureoTerciario;
            
            razaoAurea = construtorAureoPrimario / construtorAureoSecundario;
            
            indice++;
        }
		
        return razaoAurea;
    }

 /**
  *Obtém o valor lógico da propriedade de um iteiro de ser um quadradoPerfeito
  *
 *@param numero O número que será checado
 *
 *@return O valor lógico da propriedade de um iteiro de ser um quadradoPerfeito
 *
 *@throws IllegalArgumentException se numero for menor que 1
 */
    public static boolean quadradoPerfeito(int numero)
        throws IllegalArgumentException{
	if(numero < 1){
            throw new IllegalArgumentException(
                           "parâmetro inválido");

		}
		
	int indice = 1, checador = 1;
		
	while(indice < numero){
            checador += 2;
            
            indice += checador;
	}
		
	return indice == checador;
	}
	
 /**
  *Obtém o resto de uma divisão inteira
  *
 *@param dividendo O número que será dividido pelo divisor para
 * obtenção do resto
 *
 *@param divisor O número que dividirá o dividendo para obtenção do resto
 *
 *@return O valor numérico do resto da divisão inteira
 * do dividendo pelo divisor
 *
 *@throws IllegalArgumentException se o dividendofor negativo ou
 * se o divisor for menor ou igual a 0
 */
    public static int resto(int dividendo, int divisor)
        throws IllegalArgumentException{
	if(dividendo < 0 || divisor <= 0){
            throw new IllegalArgumentException(
                    "um ou mais parâmetros inválidos");
        }
	
	int resto = dividendo;
		
	while(divisor <= resto){
            resto -= divisor;
	}
		
	return resto;
    }
	
/**
 *Obtém o valor aproximado da raiz quadrada de um número
 *
*@param numero O número que terá sua raiz quadrada calculada
*
*@param indice A quantidade de vezes que será feito o cálculo:
* quanto maior, mais preciso o valor de retorno
*
*@return O valor numérico aproximado da raiz quadrada do parâmetro numero
*
*@throws IllegalArgumentException se numero for menor que 0 ou
* se indice for menor ou igual a 0
*/
    public static double raizQuadrada(double numero, int indice)
        throws IllegalArgumentException{
	if(numero < 0 || indice <= 0){
            throw new IllegalArgumentException(
                     "um ou mais parâmetros inválidos");
	}
	
	double raiz =1;
	
	while(indice >= 0){
            raiz = (raiz + numero / raiz) / 2;
		
            indice--;
	}
	
	return raiz;
    }
	
/**
 *Obtém o valor de um polinomio com coeficientes num vetor para
 * um valor de x especificado
 *
*@param x O valor especificado de x
*
*@param grau O grau do polinomio
*
*@param coeficiente O vetor com os coeficientes do polinomio
*
*@return O valor numérico do polinomio para o x especificado
*
*@throws IllegalArgumentException se o grau for menor que 1
*/
    public static double regraHorner(double x, int grau, double coeficiente[])
        throws IllegalArgumentException{
	if(grau <= 1){
            throw new IllegalArgumentException("parâmetro inválido");
	}
		
	double polinomio = coeficiente[grau];
		
	int indice = grau - 1;
		
	while(indice >= 0){
            polinomio = polinomio * x + coeficiente[indice];
			
            indice--;
	}
		
	return polinomio;
    }
	
/**
 *Obtém o numero-ésimo número da sequência de fibonacci
 *
*@param numero 
* O valor da ordem do número da sequência de Fibonacci que se deseja obter
*
*@return O valor numérico do numero-ésimo número da sequência de fibonacci
*
*@throws IllegalArgumentException se numero for menor ou igual a 0
*/
    public static int fibonacci(int numero)throws IllegalArgumentException{
	if(numero <= 0){
            throw new IllegalArgumentException("parâmetro inválido");
	}
		
	int primeiro = 0, segundo = 1, segundoAux;
		
	if(numero == 1){
            return numero;
		}
	int indice = 2;
		
	while(indice <= numero){
            segundoAux = segundo;
	
            segundo += primeiro;
	
            primeiro = segundoAux;
	
            indice++;
        }
	
	return primeiro;
    }
}
