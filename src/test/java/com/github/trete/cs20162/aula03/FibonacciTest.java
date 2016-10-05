
package com.github.trete.cs20162.aula03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {
    @Test(expected = IllegalArgumentException.class)
    public void numeroIgualAZeroInvalido(){
        MatematicaMais.fibonacci(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueZeroInvalido(){
        MatematicaMais.fibonacci(-1);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals(MatematicaMais.fibonacci(5), 5);
    }
}