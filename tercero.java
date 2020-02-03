/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfe;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class tercero {

    public static void main(String[] args) {
        int numA, numB, raiz, v;       
        
        Scanner leer = new Scanner(System.in);
        
        v = 0;
        
        System.out.print("Ingrese el numero A:");
        numA = leer.nextInt();
        System.out.print("Ingrese el numero B:");
        numB = leer.nextInt();
        
        if (numA <= numB) {
            for (int i = numA; i <= numB; i++) {
                raiz = (int) Math.sqrt(i);
                if (raiz * raiz == i) {
                    v = i;
                }
            }
            System.out.println("Los numeros cuadrados perfectos entre " + numA + " y " + numB + " son: " + v);
        } else {
            System.err.println("Error\nEl primer numero debe ser mayor que el segundo");
        }
    }
}

