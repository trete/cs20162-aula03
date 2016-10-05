
package com.github.trete.cs20162.aula03;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class RegraHornerTest {
    @Test(expected = IllegalArgumentException.class)
    public void grauMenorQueUmInvalido(){
        double[] arrayDeTeste = new double[4];
        MatematicaMais.regraHorner(5, 0, arrayDeTeste);
}

    @Test(expected = IllegalArgumentException.class)
    public void grauIgualAUmInvalido(){
        double[] arrayDeTeste = new double[4];
        MatematicaMais.regraHorner(5, 1, arrayDeTeste);
}
    @Test
    public void valorArbitrarioDeTeste(){
        double[] arrayDeTeste = new double[3];
        
        arrayDeTeste[0] = 2;
        arrayDeTeste[1] = 2;
        arrayDeTeste[2] = 2;
        
        assertEquals(MatematicaMais.regraHorner(3, 2, arrayDeTeste), 74);
    }
}
