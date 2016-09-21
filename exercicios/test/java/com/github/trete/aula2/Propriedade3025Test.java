
package com.github.trete.aula2;

import static com.github.trete.aula2.Matematica.verificaPropriedade3025;
import org.junit.Test;

public class Propriedade3025Test {
    @Test(expected = IllegalArgumentException.class)
    public void propriedade3025MaiorQue9999Invalida(){
        verificaPropriedade3025(10000);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void popriedade3025MenorQue0Invalida(){
        verificaPropriedade3025(-111);
    }
}
