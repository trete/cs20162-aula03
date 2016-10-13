
package com.github.trete.cs20162.aula03;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class LogaritmoTest {
    @Test(expected = ArithmeticException.class)
    public void baseMenorQue2Invalida(){
        MatematicaMais.logaritmo(10, 1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void numeroMenorQue1Invalida(){
        MatematicaMais.logaritmo(123,0);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals(10.0, MatematicaMais.logaritmo(1024, 2), 0.01);
    }
}
