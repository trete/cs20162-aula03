package com.trete.cs20162.aula02;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class Propriedade153Test {
    @Test(expected = IllegalArgumentException.class)
    public void propriedade153MaiorQue9999Invalida(){
        Matematica.verificaPropriedade153(10000);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void popriedade153MenorQue0Invalida(){
        Matematica.verificaPropriedade153(-111);
    }
    
    @Test
    public void valorArbitrarioDeTesteInvalido(){
        assertEquals(false, Matematica.verificaPropriedade153(154));
    }
    
    @Test
    public void valorArbitrarioDeTesteValido(){
        assertEquals(true, Matematica.verificaPropriedade153(153));
    }
}