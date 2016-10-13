package com.trete.cs20162.aula02;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class Propriedade3025Test {
    @Test(expected = IllegalArgumentException.class)
    public void propriedade3025MaiorQue9999Invalida(){
        Matematica.verificaPropriedade3025(10000);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void popriedade3025MenorQue0Invalida(){
        Matematica.verificaPropriedade3025(-111);
    }
    
    @Test
    public void valorArbitrarioDeTesteInvalido(){
        assertEquals(false, Matematica.verificaPropriedade3025(3024));
    }
    
    @Test
    public void valorArbitrarioDeTesteValido(){
        assertEquals(true,Matematica.verificaPropriedade3025(3025));
    }
}