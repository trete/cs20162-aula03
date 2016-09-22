
package java.com.github.trete.aula2;

import com.github.trete.aula2.Matematica;
import org.junit.Test;

public class SomaNaturaisTest {
    @Test(expected = IllegalArgumentException.class)
    public void somaMenorQue1Invalido(){
        Matematica.somaNaturais(0);
    }
    
}
