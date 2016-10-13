package com.trete.cs20162.aula02;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProdutoTest {
    @Test(expected = IllegalArgumentException.class)
    public void produtoComSomaDoisFatoresNegativaInvalido(){
        Matematica.produto(-132, -40);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void produtoComSomaPrimeiroFatorNegativoInvalido(){
        Matematica.produto(-132, 40);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void produtoComSomaSegundoFatorNegativoInvalido(){
        Matematica.produto(132, -40);
    }
    
    @Test
    public void valorArbitrarioDeTeste(){
        assertEquals(450, Matematica.produto(15, 30));
    }
}