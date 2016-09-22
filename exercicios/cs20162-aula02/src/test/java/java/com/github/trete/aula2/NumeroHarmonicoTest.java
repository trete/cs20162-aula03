
package java.com.github.trete.aula2;

import com.github.trete.aula2.Matematica;
import org.junit.Test;

public class NumeroHarmonicoTest {
    @Test(expected = IllegalArgumentException.class)
    public void numeroHarmonicoMenorQue1Invalido(){
        Matematica.numeroHarmonico(0);
    }
    
}
