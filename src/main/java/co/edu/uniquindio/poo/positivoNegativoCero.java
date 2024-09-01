package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

/*Programa que determina cual es positivo, negativo o cero
  Autor: Fernando Ramos Martinez
  Fecha: 19 Agosto 2024
  Licencia: GNU GPL V3.
 * 
 */
public class positivoNegativoCero {
    /**
     * @param args
     */
    public static void main(final String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero"));

        if (num < 0) {
            JOptionPane.showMessageDialog(null, " El numero ingresado es negativo");
        } else {
            if (num > 0) {
                JOptionPane.showMessageDialog(null, " El numero ingresado es positivo");
            } else {
                JOptionPane.showMessageDialog(null, " El numero ingresado es cero");

            }

        }

    }
}
