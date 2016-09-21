
package com.github.trete.aula2;

import static com.github.trete.aula2.Matematica.verificaPropriedade153;
import org.junit.Test;

public class Propriedade153Test {
    @Test(expected = IllegalArgumentException.class)
    public void propriedade153MaiorQue9999Invalida(){
        verificaPropriedade153(10000);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void popriedade153MenorQue0Invalida(){
        verificaPropriedade153(-111);
    }
}
