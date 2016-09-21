
package com.github.trete.aula2;

import static com.github.trete.aula2.Matematica.potencia;
import org.junit.Test;

public class PotenciaTest {
    @Test(expected = IllegalArgumentException.class)
    public void poenciaComBaseNegativaInvalida(){
        potencia(-5,12);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void potenciaComExpoenteNegativoInvalida(){
        potencia(5,-12);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void potenciaComBaseZeroInvalida(){
        potencia(0,403);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void potenciaComExpoenteZeroInvalida(){
        potencia(403,0);
    }
}
