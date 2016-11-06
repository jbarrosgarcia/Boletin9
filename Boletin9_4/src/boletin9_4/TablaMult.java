/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

/**
 *
 * @author Jose Barros
 */
public class TablaMult {
    public String tabla(int num){
        String tab="";
        for(int i=1;i<=10;i++){
            tab=tab+"\n"+num+" * "+i+" = "+(num*i);
        }
        return tab;
    }
}
