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
    public void verificaNMenoresValoresTest() {
        ValidaVetor valida = new ValidaVetor();
        double[] v = {1, 2, 3, 4, 5};
        ArrayList<Double> vresp = valida.getNMenoresValores(v, 4);
        assertEquals(1, vresp.get(0), 0.000001);
        assertEquals(2, vresp.get(1), 0.000001);
        assertEquals(3, vresp.get(2), 0.000001);
    }

    @Test
    public void verificaNMaioresValoresTest() {
        ValidaVetor valida = new ValidaVetor();
        double[] v = {1, 2, 3, 4, 5};
        ArrayList<Double> vresp = valida.getNMaioresValores(v, 3);
        assertEquals(4, vresp.get(0), 0.000001);
        assertEquals(5, vresp.get(1), 0.000001);
    }
}
