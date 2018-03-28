/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.tdd.ex1;

/**
 *
 * @author lucas
 */
public class testar {
    public static void main(String[] args){
        ValidaVetor valida = new ValidaVetor();
        
        double[] v = {1,2,3,4,5,6,7,8};
        double[] aux = valida.getNMaioresValores(v, 5);
        
        for(int i = 0; i < aux.length; i++){
            System.out.println("\n"+aux[i]);
        }
    }
}
