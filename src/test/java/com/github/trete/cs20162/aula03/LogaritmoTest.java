
package com.github.trete.cs20162.aula03;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class LogaritmoTest {
    @Test(expected = IllegalArgumentException.class)
    public void baseMenorQue2Invalida(){
        MatematicaMais.logaritmo(1, 123);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQue1Invalida(){
        MatematicaMais.logaritmo(123,0);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals(2, MatematicaMais.logaritmo(10, 100), 0.00001);
    }
}
