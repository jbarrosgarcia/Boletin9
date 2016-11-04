/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Barros
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rec =new Rectangulo();
           boolean pos=false;
           int bas=0,alt=0;
           while(pos!=true){
               bas=Integer.parseInt(JOptionPane.showInputDialog("Introduzca una base positiva"));
               alt=Integer.parseInt(JOptionPane.showInputDialog("Introduzca una altura positiva"));
               if(bas>0&&alt>0){
                   pos=true;
               }
                }
           System.out.println("El area es "+rec.calculaArea(bas, alt));
    }
}
