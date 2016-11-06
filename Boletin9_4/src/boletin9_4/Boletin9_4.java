/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Barros
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=1;
        TablaMult tab=new TablaMult();
        while(num!=0){
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero para ver su tabla de multiplicar"));
            if(num!=0){
                System.out.println(tab.tabla(num));;
            }
        }
    }
    
}
