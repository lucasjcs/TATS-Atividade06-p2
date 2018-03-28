package br.utfpr.tdd.ex1;

import java.util.ArrayList;

class ValidaVetor {

    public void setVetor(double v[]) throws Exception {
        if (v == null) {
            throw new IllegalArgumentException("vetor nao pode ser nulo");
        }

        if (v.length == 0) {
            throw new IllegalArgumentException("vetor com zero elementos");
        }
    }

    public ArrayList getNMenoresValores(double[] v, double numero) {
        ArrayList<Double> aux = new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            if (v[i] < numero) {
                aux.add(v[i]);
            }
        }

        return aux;
    }

    public ArrayList getNMaioresValores(double[] v, double numero) {
        ArrayList<Double> aux = new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            if (v[i] > numero) {
                aux.add(v[i]);
            }
        }

        return aux;
    }

}
