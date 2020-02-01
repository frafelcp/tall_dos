
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
public class cambiobilletemoneda {
    public static void main(String[] args) {
        int cambio;
        int veintemil=0, diezmil=0, dosmil=0, monedados=0, monedcien=0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("DIGITE EL VALOR A CAMBIAR: ");
        cambio = leer.nextInt();
        
        veintemil=cambio/20000;
        cambio=cambio-(veintemil*20000);
        
        diezmil=cambio/10000;
        cambio=cambio-(diezmil*10000);
        
        dosmil=cambio/2000;
        cambio=cambio-(dosmil*2000);
        
        monedados=cambio/200;
        cambio=cambio-(monedados*200);
        
        monedcien=cambio/100;
        cambio=cambio-(monedcien*100);
   
        System.out.println();
        if (veintemil > 0){
            System.out.println("numero de billetes de 20 mil: "+ veintemil);
        }if (diezmil > 0){
            System.out.println("numero de billetes de 10 mil: "+ diezmil);
        }if (dosmil > 0) {
            System.out.println("numero de billetes de dosmil: "+ dosmil);
        }if (monedados > 0){
            System.out.println("numero de monedas de 200 pesos: "+monedados);
        }if (monedcien > 0) {
            System.out.println("numero de monedas de 100 pesos: "+ monedcien);
        }
    }  
}
