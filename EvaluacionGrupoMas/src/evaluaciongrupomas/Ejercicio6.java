/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciongrupomas;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Ejercicio6 {

    public void movimientos(int[] myArray) { //Recibe un array y retorna en consola un tablero con la posición final de la ficha
        char tablero[][] = {
            {'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O'}};
        int sumaH = 0, sumaV = 0;
        for (int i = 0; i < myArray.length - 1; i = i + 2) {
            sumaH += myArray[i];
            sumaV += myArray[i + 1];
            if (sumaH > 3) sumaH = 3;
            if (sumaH < 0) sumaH = 0;
            if (sumaV > 3) sumaV = 3;
            if (sumaV < 0) sumaV = 0;
        }
        tablero[sumaV][sumaH] = 'X';
        for (char[] row : tablero) {
            System.out.println(Arrays.toString(row));
        }
    }
}
