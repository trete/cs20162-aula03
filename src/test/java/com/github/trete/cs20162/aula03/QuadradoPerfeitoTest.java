package com.github.trete.cs20162.aula03;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class QuadradoPerfeitoTest {
        @Test(expected = IllegalArgumentException.class)
        public void numeroMenorQue1Invalido(){
            MatematicaMais.quadradoPerfeito(0);
        }
        
        @Test
        public void valorArbitrarioDeTeste(){
            assertEquals(true, MatematicaMais.quadradoPerfeito(81));
        }
        
        @Test
        public void valorArbitrarioDeTesteInavlido(){
            assertEquals(true, MatematicaMais.quadradoPerfeito(322));
        }
}
