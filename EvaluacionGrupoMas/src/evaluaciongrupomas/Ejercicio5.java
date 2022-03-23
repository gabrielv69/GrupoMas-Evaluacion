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
public class Ejercicio5 {

    public void imprimirTablero(int n) { //Recibe un entero que representa la dimensión de una matriz que será impresa simulando un tablero
        int aux = 0;
        if (n > 10 || n < 1) 
            n = 5;
        for (int j = 0; j < n; j++) {
            aux = (j % 2 == 0) ? 1 : 0;
            for (int i = 0; i < n; i++) {
                char simbol = ((i + aux) % 2 == 0) ? '_' : 'X';
                System.out.print(simbol);
            }
            System.out.println("");
        }
    }
}
