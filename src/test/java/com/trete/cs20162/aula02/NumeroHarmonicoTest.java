package com.trete.cs20162.aula02;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumeroHarmonicoTest {
    @Test(expected = IllegalArgumentException.class)
    public void numeroHarmonicoMenorQue1Invalido(){
        Matematica.numeroHarmonico(0);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals(3. / 2., Matematica.numeroHarmonico(2), 0.0001);
    }
}