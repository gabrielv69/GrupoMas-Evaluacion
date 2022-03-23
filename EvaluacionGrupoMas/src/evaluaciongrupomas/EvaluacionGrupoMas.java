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
public class EvaluacionGrupoMas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 1:");
        Ejercicio1 ejer1 = new Ejercicio1();
        char myArray[] = {'a', 'b', 'c', 'd', 'd', 'c', 'b', 'a'};
        ejer1.simetrica(myArray);

        System.out.println("\nEjercicio 2:");
        Ejercicio2 ejer2 = new Ejercicio2();
        int myArray2[] = {1,3,4,2,7,0};
        ejer2.sumaDiez(myArray2);
        
        System.out.println("\nEjercicio 3:");
        Ejercicio3 ejer3 = new Ejercicio3();
        int myArray3[] = {1,2,2,5,4,6,7,8,8,8};
        ejer3.masOcurrencias(myArray3);
        
        System.out.println("\nEjercicio 4:");
        Ejercicio4 ejer4 = new Ejercicio4();
        int myArray4[] = {1,2,1,3,3,1,2,1,5,1};
        ejer4.histograma(myArray4);
        
        System.out.println("\nEjercicio 5:");
        Ejercicio5 ejer5 = new Ejercicio5();
        ejer5.imprimirTablero(7);//Cambiar el tamaño del tablero deseado
        
        System.out.println("\nEjercicio 6:");
        Ejercicio6 ejer6 = new Ejercicio6();
        int myArray5[] = {1,2,  -1,1,  0,1,  2,-1,  -1,-2};
        ejer6.movimientos(myArray5);
    }

}
