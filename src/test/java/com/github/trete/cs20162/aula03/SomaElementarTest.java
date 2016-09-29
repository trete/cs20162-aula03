
package com.github.trete.cs20162.aula03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SomaElementarTest {
        @Test(expected = IllegalArgumentException.class)
        public void paramMenorQue1Invalido(){
            MatematicaMais.somaElementar(0);
        }
        
        @Test
        public void umValorArbitrario(){
            assertEquals(0.8, MatematicaMais.somaElementar(3), 0.0001);
        }
}
