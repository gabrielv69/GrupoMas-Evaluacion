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
public class Ejercicio1 {
    
    //Una matriz es simétrica si se ve igual si está invertida
    public void simetrica(char[] myArray){
        boolean simetrica = true;
        for (int i = 0; i < myArray.length/2; i++) {
            char first = myArray[i];
            char last = myArray[myArray.length- 1 - i];
            if (first!= last) {
                simetrica = false;
                break;
            }
        }
        String resultado = simetrica  ? "Simétrica" : "NO Simétrica";
        System.out.println(resultado);
    }   
}
