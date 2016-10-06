
package com.github.trete.cs20162.aula03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ValorPiTest {
    @Test(expected = IllegalArgumentException.class)
    public void qntCasasMenorQue1Invalido(){
        MatematicaMais.valorPi(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void qntCasasIgualA1Invalido(){
        MatematicaMais.valorPi(1);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals( 3.141, MatematicaMais.valorPi(3), 0.001);
    }
    
}
