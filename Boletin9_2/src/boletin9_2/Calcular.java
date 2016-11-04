/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author Jose Barros
 */
public class Calcular {
    public String calcular(){
        double producto=1;
        int suma=0;
        
        for(int i=10;i<=90;i++){
            suma=suma+i;
            producto=producto*i;
        }
        return "La suma es "+suma+"\nEl producto es "+producto;
    }
}
