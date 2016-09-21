
package com.github.trete.aula2;

import static com.github.trete.aula2.Matematica.produto;
import org.junit.Test;

public class ProdutoTest {
    @Test(expected = IllegalArgumentException.class)
    public void produtoComSomaNegativaInvalido(){
        produto(-132,-40);
    }
}
