package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class primo {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        
        if (esPrimo(num)) {
            JOptionPane.showMessageDialog(null, "El número es primo");
        } else {
            JOptionPane.showMessageDialog(null, "El número no es primo");
        }
    }
    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}