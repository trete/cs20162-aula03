package com.github.trete.cs20162.aula03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FatorialTest {

    @Test(expected = IllegalArgumentException.class)
    public void parametroMenorQue1Invalido(){
        MatematicaMais.fatorial(0);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals(24, MatematicaMais.fatorial(4));
    }
}
