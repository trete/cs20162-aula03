
package main.java.vom.github.trete.aula2;

import org.junit.Test;

import static main.java.com.github.trete.aula2.Matematica.*;

import static org.junit.Assert.*;

public class MatematicaTest {
    @Test(expected = IllegalArgumentException.class)
    public void somaMenorQue1Invalido(){
        somaNaturais(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void produtoComSomaNegativaInvalido(){
        produto(-132,-40);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void poenciaComBaseNegativaInvalida(){
        potencia(-5,12);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void potenciaComExpoenteNegativoInvalida(){
        potencia(5,-12);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void potenciaComBaseZeroInvalida(){
        potencia(0,403);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void potenciaComExpoenteZeroInvalida(){
        potencia(403,0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void propriedade3025MaiorQue9999Invalida(){
        verificaPropriedade3025(10000);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void popriedade3025MenorQue0Invalida(){
        verificaPropriedade3025(-111);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void propriedade153MaiorQue9999Invalida(){
        verificaPropriedade153(10000);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void popriedade153MenorQue0Invalida(){
        verificaPropriedade153(-111);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void primoIguala1Invalido(){
        verificaPrimo(1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void primoMenorQue1Invalido(){
        verificaPrimo(0);
    }
    
}
