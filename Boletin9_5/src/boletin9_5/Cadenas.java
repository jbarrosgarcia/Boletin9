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
    
    public String cadenaFib(int cont){
        String cadena="";
         int fibo1,fibo2,i;
        
        System.out.println("Los " + cont + " primeros términos de la serie de Fibonacci son:");

        fibo1=0;
        fibo2=1;

        cadena=""+fibo1 + " ";
        for(i=2;i<=cont;i++){
             cadena=cadena+fibo2 + " ";
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
    
        return cadena;
    }
    public String cadenaRestas(int cont){
        int i=0;
        String cadena="";
        while(i<=cont){
            i++;
            if(i%2==1){
                cadena=cadena+" - "+i;
            }else{
                cadena=cadena+" + "+i;
            }
        }
        return cadena;
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
