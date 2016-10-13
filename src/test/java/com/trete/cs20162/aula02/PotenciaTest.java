package com.trete.cs20162.aula02;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PotenciaTest {
    @Test(expected = IllegalArgumentException.class)
    public void poenciaComBaseNegativaInvalida(){
        Matematica.potencia(-5, 12);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void potenciaComExpoenteNegativoInvalida(){
        Matematica.potencia(5,-12);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void potenciaComBaseZeroInvalida(){
        Matematica.potencia(0,403);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void potenciaComExpoenteZeroInvalida(){
        Matematica.potencia(403,0);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals(125, Matematica.potencia(5, 3));
    }
}