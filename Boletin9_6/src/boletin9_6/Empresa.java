/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

/**
 *
 * @author Jose Barros
 */
public class Empresa {
    public String cuentaSuel(float suel){
        int suelMil=0,suelMilSet=0,suelBajo=0;
        while(suel>0){
            if(suel>=1000f&&suel<1750f){
                suelMil++;
            }else if(suel>=1750){
                suelMilSet++;
            }
            else{
                suelBajo++;
            }
        }
        String empre="cobran mil € "+suelMil+" empleados\ncobran 1750 € "+suelMilSet+"\nel porcentaje de empleados que cobran menos de mil € es "+(suelBajo*100/(suelBajo+suelMil+suelMilSet))+" %";
        return empre;
    }
}
