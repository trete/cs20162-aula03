
package com.github.trete.aula2;

import org.junit.Test;

import static com.github.trete.aula2.Matematica.somaNaturais;

public class SomaNaturaisTest {
    @Test(expected = IllegalArgumentException.class)
    public void somaMenorQue1Invalido(){
        somaNaturais(0);
    }
    
}
