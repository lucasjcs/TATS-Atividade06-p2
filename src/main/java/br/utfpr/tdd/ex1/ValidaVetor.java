package br.utfpr.tdd.ex1;

class ValidaVetor {

    public void setVetor(double v[]) throws Exception {
        if (v == null) {
            throw new IllegalArgumentException("vetor nao pode ser nulo");
        }

        if (v.length == 0) {
            throw new IllegalArgumentException("vetor com zero elementos");
        }
    }

    public double[] getNMenoresValores(double[] v, double numero) {
        double[] aux = {};
        for (int i = 0; i < v.length; i++) {
            if (v[i] < numero) {
                aux[i] = v[i];
            }
        }

        return aux;
    }

    public  double[] getNMaioresValores(double[] v, int numero) {
        double[] aux = {0};
        for (int i = 0; i < v.length; i++) {
            if (v[i] > numero) {
                aux[i] = v[i];
            }
        }
        return aux;
    }

}
