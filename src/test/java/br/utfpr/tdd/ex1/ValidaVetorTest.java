package br.utfpr.tdd.ex1;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class ValidaVetorTest {

    public ValidaVetorTest() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void verificaVetorVazioTest() throws Exception {
        ValidaVetor valida = new ValidaVetor();
        double v[] = {};
        valida.setVetor(v);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void verificaVetorNuloTest() throws Exception {
        ValidaVetor valida = new ValidaVetor();
        double[] v = null;
        valida.setVetor(v);
    }
    
    @Test
    public void verificaNMenoresValoresTest(){
        ValidaVetor valida = new ValidaVetor();
        double[] v = {1,2,3,4,5};
        ArrayList<Double> vresp = valida.getNMaioresValores(v, 4);
        assertEquals(vresp.get(0), 1, 0.000001);
        assertEquals(vresp.get(1), 2, 0.000001);
        assertEquals(vresp.get(3), 3, 0.000001);
    }
    
    @Test
    public void verificaNMaioresValoresTest(){
        ValidaVetor valida = new ValidaVetor();
        double[] v = {1,2,3,4,5};
        ArrayList<Double> vresp = valida.getNMaioresValores(v, 3);
        assertEquals(vresp.get(0), 4, 0.000001);
        assertEquals(vresp.get(1), 5, 0.000001);
    }
    

}
