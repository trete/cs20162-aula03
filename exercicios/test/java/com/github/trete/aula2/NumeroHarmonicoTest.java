
package com.github.trete.aula2;

import static com.github.trete.aula2.Matematica.numeroHarmonico;
import org.junit.Test;

public class NumeroHarmonicoTest {
    @Test(expected = IllegalArgumentException.class)
    public void numeroHarmonicoMenorQue1Invalido(){
        numeroHarmonico(0);
    }
    
}
