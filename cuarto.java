package testfe;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author XP
 */
public class cuarto {

    public static void main(String[] args) {
        int cambMoned;
        int ventMil = 0, diezmil = 0, dosmil = 0, monedados = 0, monedcien = 0;

        Scanner leer = new Scanner(System.in);

        System.out.print("DIGITE EL VALOR A CAMBIAR: ");
        cambMoned = leer.nextInt();

        do {
            ventMil = cambMoned / 20000;
            cambMoned = cambMoned - (ventMil * 20000);

            diezmil = cambMoned / 10000;
            cambMoned = cambMoned - (diezmil * 10000);

            dosmil = cambMoned / 2000;
            cambMoned = cambMoned - (dosmil * 2000);

            monedados = cambMoned / 200;
            cambMoned = cambMoned - (monedados * 200);

            monedcien = cambMoned / 100;
            cambMoned = cambMoned - (monedcien * 100);

            System.out.println();
            if (ventMil > 0) {
                System.out.println("numero de billetes de 20 mil: " + ventMil);
            }
            if (diezmil > 0) {
                System.out.println("numero de billetes de 10 mil: " + diezmil);
            }
            if (dosmil > 0) {
                System.out.println("numero de billetes de dosmil: " + dosmil);
            }
            if (monedados > 0) {
                System.out.println("numero de monedas de 200 pesos: " + monedados);
            }
            if (monedcien > 0) {
                System.out.println("numero de monedas de 100 pesos: " + monedcien);
            }
        } while (cambMoned > 0);

    }
}

