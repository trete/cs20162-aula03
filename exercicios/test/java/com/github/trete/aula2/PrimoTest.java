
package com.github.trete.aula2;

import static com.github.trete.aula2.Matematica.verificaPrimo;
import org.junit.Test;

public class PrimoTest {
    @Test(expected = IllegalArgumentException.class)
    public void primoIguala1Invalido(){
        verificaPrimo(1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void primoMenorQue1Invalido(){
        verificaPrimo(0);
    }
}
