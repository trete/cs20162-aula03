
package com.github.trete.aula2;

import org.junit.Test;

public class ProdutoTest {
    @Test(expected = IllegalArgumentException.class)
    public void produtoComSomaNegativaInvalido(){
        Matematica.produto(-132,-40);
    }
}
