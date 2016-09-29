package com.github.trete.cs20162.aula03;

import org.junit.Test;

public class QuadradoPerfeitoTest {
        @Test(expected = IllegalArgumentException.class)
        public void numeroMenorQue1Invalido(){
            MatematicaMais.quadradoPerfeito(0);
        }
        
        @Test
        public void valorArbitrarioDeTeste(){
            MatematicaMais.quadradoPerfeito(81);
        }
}
