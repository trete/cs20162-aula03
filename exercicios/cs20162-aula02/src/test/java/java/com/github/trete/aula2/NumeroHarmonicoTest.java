
package java.com.github.trete.aula2;

import org.junit.Test;

public class NumeroHarmonicoTest {
    @Test(expected = IllegalArgumentException.class)
    public void numeroHarmonicoMenorQue1Invalido(){
        Matematica.numeroHarmonico(0);
    }
    
}
