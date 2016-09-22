
package java.com.github.trete.aula2;

import com.github.trete.aula2.Matematica;
import org.junit.Test;

public class Propriedade3025Test {
    @Test(expected = IllegalArgumentException.class)
    public void propriedade3025MaiorQue9999Invalida(){
        Matematica.verificaPropriedade3025(10000);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void popriedade3025MenorQue0Invalida(){
        Matematica.verificaPropriedade3025(-111);
    }
}
