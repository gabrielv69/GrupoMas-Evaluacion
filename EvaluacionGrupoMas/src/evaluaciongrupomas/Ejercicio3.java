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
public class Ejercicio3 {

    public void masOcurrencias(int[] myArray) { //Recibe un array y retorna en consola el número que más se repite
        int repeticiones = 0,mayor = 0,numero = 0;
        for (int i = 0; i < myArray.length; i++) {
            int contador = 0;
            numero = myArray[i];
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[j] == numero) 
                    contador++;
            }
            if (contador > repeticiones) {
                repeticiones = contador;
                mayor = numero;
            }
        }
        System.out.println("Cantidad = " + repeticiones);
        System.out.println("Número = " + mayor);
    }
}
