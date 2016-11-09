/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

/**
 *
 * @author Jose Barros
 */
public class Cadenas {
    public void cadenaRestas(){
        
    }
    
    public String cadenaPar(int cont){
        int i=0;
        int num=0;
        String cadena="2";
        while(i<=cont){
            num++;
            if(num%2==0){
                i++;
                if(num>2){
                cadena=cadena+", "+num;
            }
            }
        }
        return cadena;
    }
}
