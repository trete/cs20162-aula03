package com.github.trete.cs20162.aula03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RestoTest {
    @Test(expected = IllegalArgumentException.class)
    public void dividendoMenorQue0Invalido(){
        MatematicaMais.resto(-23, 123);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void divisorMenorQue0Invalido(){
        MatematicaMais.resto(1458, 0);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals(1, MatematicaMais.resto(10, 3));
    }
}
