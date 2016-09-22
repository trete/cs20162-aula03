
package java.com.github.trete.aula2;

import com.github.trete.aula2.Matematica;
import org.junit.Test;

public class MaiorDivisorComumTest {
    @Test(expected = IllegalArgumentException.class)
    public void maiorDivisorComumComAMaiorQueB(){
        Matematica.maiorDivisorComum(400, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void maiorDivisorComumComBNegativo(){
        Matematica.maiorDivisorComum(5, -10);
    }
}
