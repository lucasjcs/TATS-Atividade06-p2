package br.utfpr.tdd.ex1;

import org.junit.*;
import static org.junit.Assert.*;

public class ValidaVetorTest {

    public ValidaVetorTest() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void verificaVetorVazioTest() {
        ValidaVetor valida = new ValidaVetor();
        double v[] = {};
        valida.setVetor(v);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void verificaVetorNuloTest() {
        ValidaVetor valida = new ValidaVetor();
        double[] v = null;
        valida.setVetor(v);
    }
    
    @Test
    public void verificaNMenoresValores(){
        ValidaVetor valida = new ValidaVetor();
        double[] v = {1,2,3,4,5};
        double[] vresp = valida.getNMenoresValores(v, 4);
        assertEquals(vresp[0], 1, 0.000001);
        assertEquals(vresp[1], 2, 0.000001);
        assertEquals(vresp[2], 3, 0.000001);
    }
    
    @Test
    public void verificaNMaioresValores(){
        ValidaVetor valida = new ValidaVetor();
        double[] v = {1,2,3,4,5};
        double[] vresp = valida.getNMenoresValores(v, 3);
        assertEquals(vresp[0], 4, 0.000001);
        assertEquals(vresp[1], 5, 0.000001);
    }
    

}
