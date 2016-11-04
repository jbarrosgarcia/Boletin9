/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

/**
 *
 * @author Jose Barros
 */
public class CalculaNum {
    public String calculaNum(int num[]){
            int positivos=0,negativos=0,ceros=0;
        for(int x=0;x<num.length;x++){
            if (num[x]>0){
                positivos++;
            }else if(num[x]<0){
                negativos++;
            }else{
                ceros++;
            }
        }
        return "el numero de positivos es "+positivos+"\nel numero de negativos es "+"\nel numero de ceros es "+ceros;
    }
}
