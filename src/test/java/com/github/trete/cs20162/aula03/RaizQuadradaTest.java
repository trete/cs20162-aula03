package com.github.trete.cs20162.aula03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RaizQuadradaTest {
    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQue0Invalido(){
        MatematicaMais.raizQuadrada(-1, 1232142);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void indiceMenorOuIgualA0Invalido(){
        MatematicaMais.raizQuadrada(100, 0);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals(3, MatematicaMais.raizQuadrada(9, 300), 0.0000001);
    }
}
