

import javax.swing.JOptionPane;

/*Programa que recibe 3 números y determina cual es el mayor
  Autor: Fernando Ramos Martinez
  Fecha: 19 Agosto 2024
  Licencia: GNU GPL V3.
  /* */
public class Elmayor {
    public static void main(String[] args) {
        int dig1, dig2, dig3;

        dig1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero por favor"));
        dig2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un otro numero por favor"));
        dig3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));

        if (dig1 > dig2 && dig1 > dig3) {
            JOptionPane.showMessageDialog(null, "El número " +" " + dig1+ " "+"es es el mayor" );
        }else{
            if (dig2>dig1 && dig2>dig3) {
                JOptionPane.showMessageDialog(null, "El número " + " " + dig2 + " "+ "es el mayor");
                
            }else{
                if (dig3>dig1 && dig3 > dig2) {
                    JOptionPane.showMessageDialog(null, "El número"+ " " + dig3 +" " +"es el mayor");
                    
                }
            }
        }

    }

}
