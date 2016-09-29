package com.github.trete.cs20162.aula03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RazaoAureaTest {

    @Test(expected = IllegalArgumentException.class)
    public void primeiroAureoNegativoInvalido(){
        MatematicaMais.razaoAurea(-2, 30, 11111);
    }

    @Test(expected = IllegalArgumentException.class)
    public void segundoAureoNegativoInvalido(){
        MatematicaMais.razaoAurea(2, -30, 11111);
    }

    @Test(expected = IllegalArgumentException.class)
    public void precisaoNegativaInvalida(){        
        MatematicaMais.razaoAurea(2, 30, 0);
    }

    @Test
    public void valorDeTesteArbitrario(){
        assertEquals(3 / 2, MatematicaMais.razaoAurea(1, 2, 3), 0.00001);
    }

}
