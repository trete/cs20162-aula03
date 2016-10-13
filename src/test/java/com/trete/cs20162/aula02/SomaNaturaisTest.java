
package com.trete.cs20162.aula02;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SomaNaturaisTest {
    @Test(expected = IllegalArgumentException.class)
    public void somaMenorQue1Invalido(){
        Matematica.somaNaturais(0);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals(6, Matematica.somaNaturais(3));
    }
}