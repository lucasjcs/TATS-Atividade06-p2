package br.utfpr.tdd.ex1;

class ValidaVetor {

    void setVetor(double v[]) throws Exception {
        if (v == null) {
            throw new IllegalArgumentException("vetor nao pode ser nulo");
        }

        if (v.length == 0) {
            throw new IllegalArgumentException("vetor com zero elementos");
        }
    }

    double[] getNMenoresValores(double[] v, double numero) {
        double[] aux = {};
        for (int i = 0; i < v.length; i++) {
            if (v[i] < numero) {
                aux[i] = v[i];
            }
        }

        return aux;
    }

    double[] getNMaioresValores(double[] v, int numero) {
        double[] aux = {};
        for (int i = 0; i < v.length; i++) {
            if (v[i] > numero) {
                aux[i] = v[i];
            }
        }
        return aux;
    }

}
