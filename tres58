import javax.swing.*;
public class EJERCICIO_58 {
    public static void main(String[] args) {
        int a,b,i,n;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dos números enteros positivos\nIngrese el primer número"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        String v="";
        if(a<=b){
            for( i=a; i<=b ; i++){
                n=(int) Math.sqrt(i);
                if(n*n==i){
                    v=v+i+"  ";
                }
            }
            JOptionPane.showMessageDialog(null, "Los numeros cuadrados perfectos entre "+a+" y "+b+" son: "+v);
        }else{
            JOptionPane.showMessageDialog(null, "Error\nEl primer numero debe ser mayor que el segundo");
        }
    }
}
