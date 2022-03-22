/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciongrupomas;

/**
 *
 * @author DELL
 */
public class Ejercicio2 {
    public void sumaDiez(int[] myArray){
        int suma =0;
        aa:  
        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = 1; j < myArray.length; j++) {
                if (myArray[i]+myArray[j]==10) {
                    System.out.println("Número 1 = "+myArray[i]);
                    System.out.println("Número 2 = "+myArray[j]);
                    break aa;
                }
            }  
        }
    }   
}
