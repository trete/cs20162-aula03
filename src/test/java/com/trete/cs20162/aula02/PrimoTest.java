package com.trete.cs20162.aula02;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class PrimoTest {
    @Test(expected = IllegalArgumentException.class)
    public void primoIguala1Invalido(){
        Matematica.verificaPrimo(1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void primoMenorQue1Invalido(){
        Matematica.verificaPrimo(0);
    }
    
    @Test
    public void valorArbitrarioQueFunciona(){
        assertEquals(true, Matematica.verificaPrimo(13));
    }
    
    @Test
    public void valorArbitrarioQueNaoFunciona(){
        assertEquals(false, Matematica.verificaPrimo(15));
    }
}