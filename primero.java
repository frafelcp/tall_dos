/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import javax.swing.JOptionPane;

/**
 *
 * @author JHONXP
 */
public class primerejercicio {

    public static void main(String[] args) {
        int ingrnum, inicio,archivo;
        ingrnum = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LOS NUMEROS QUE DESEE"));

        do {

            inicio = 0;
            while (ingrnum > 0) {
                archivo = ingrnum % 10;
                inicio = archivo + inicio;
                ingrnum = ingrnum / 10;
            }

            ingrnum = inicio;

        } while (ingrnum > 9);

        JOptionPane.showMessageDialog(null, "EL ULTIMO NUMERO  ES  : " + inicio);
    }
}
