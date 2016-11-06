/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Barros
 */
public class Boletin9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa emp=new Empresa();
        float suel=1;
        while(suel!=0){
            suel=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el sueldo"));
            if(suel!=0){
                System.out.println(emp.cuentaSuel(suel));
            }
        }
    }
    
}
