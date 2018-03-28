/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.tdd.ex1;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class testar {
    public static void main(String[] args){
        ValidaVetor valida = new ValidaVetor();
        double[] v = {1,2,3,4,5};
        ArrayList<Double> aux = valida.getNMenoresValores(v, 4);
        
        
            System.out.println("\n"+aux);
        
        
    }
}
