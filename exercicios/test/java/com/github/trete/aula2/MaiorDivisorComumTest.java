
package com.github.trete.aula2;

import static com.github.trete.aula2.Matematica.maiorDivisorComum;
import org.junit.Test;

public class MaiorDivisorComumTest {
    @Test(expected = IllegalArgumentException.class)
    public void maiorDivisorComumComAMaiorQueB(){
        maiorDivisorComum(400,2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void maiorDivisorComumComBNegativo(){
        maiorDivisorComum(5, -10);
    }
}
