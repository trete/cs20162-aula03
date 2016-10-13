
package com.trete.cs20162.aula02;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaiorDivisorComumTest {
    @Test(expected = IllegalArgumentException.class)
    public void maiorDivisorComumComAMaiorQueB(){
        Matematica.maiorDivisorComum(400, 2);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void segundoNumeroNegativoInvalido(){
        Matematica.maiorDivisorComum(30, -5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void maiorDivisorComumComBNegativo(){
        Matematica.maiorDivisorComum(5, -10);
    }
    
    @Test
    public void valorDeTesteArbitrario(){
        assertEquals(Matematica.maiorDivisorComum(18, 54), 18);
    }
}