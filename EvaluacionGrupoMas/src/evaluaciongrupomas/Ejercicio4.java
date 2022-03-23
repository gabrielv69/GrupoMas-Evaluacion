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
public class Ejercicio4 {
        public void histograma(int[] myArray) {//Recibe un array y retorna en consola un histograma
        for (int i = 1; i < 6; i++) {
            int contador = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[j] == i) 
                    contador++;
            }
            System.out.println(i+":" +"*".repeat(contador));
        }
    }
}
