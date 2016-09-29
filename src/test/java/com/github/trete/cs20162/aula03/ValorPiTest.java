
package com.github.trete.cs20162.aula03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ValorPiTest {
    @Test(expected = IllegalArgumentException.class)
    public void qntCasasMenorQue1Invalido(){
        MatematicaMais.valorPi(0);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals( 3.14, MatematicaMais.valorPi(2), 0.001);
    }
    
}
