package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

/*Programa que recibe arreglo y los suma
  Autor: Fernando Ramos Martinez
  Fecha: 19 Agosto 2024
  Licencia: GNU GPL V3.
 * 
 */


public class Arreglonumerossuma {
    /**
     * @param args
     */
    public static void main (String[]args){
        int [] digito = new int[4];
    

        digito[0] = Integer.parseInt(JOptionPane.showInputDialog("ingrese un digito 1"));
        digito[1] = Integer.parseInt(JOptionPane.showInputDialog("ingrese un digito 2"));
        digito[2] = Integer.parseInt(JOptionPane.showInputDialog("ingrese un digito 3"));
        digito[3] = Integer.parseInt(JOptionPane.showInputDialog("ingrese un digito 4"));

        int suma=0;
        for (int i=0;i<4;i++){
            suma +=  digito[i];
        }
        JOptionPane.showMessageDialog(null, "la suma es: " + suma);

    }
}
