/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Barros
 */
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadenas cad=new Cadenas();
        System.out.println(cad.cadenaFib(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la longitud de la serie de Fibonacci"))));
        System.out.println(cad.cadenaPar(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de numeros pares que quiere visualizar"))));
        System.out.println(cad.cadenaRestas(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de numeros"))));
        
    }
    
}
