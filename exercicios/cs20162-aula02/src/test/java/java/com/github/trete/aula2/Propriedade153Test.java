
package java.com.github.trete.aula2;

import org.junit.Test;

public class Propriedade153Test {
    @Test(expected = IllegalArgumentException.class)
    public void propriedade153MaiorQue9999Invalida(){
        Matematica.verificaPropriedade153(10000);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void popriedade153MenorQue0Invalida(){
        Matematica.verificaPropriedade153(-111);
    }
}
