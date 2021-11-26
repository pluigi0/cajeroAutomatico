
package cajero;

import javax.swing.JOptionPane;

/*
Programa que simule un cajero automatico con un saldo inicial de 1000 
dolares, con el siguiente menu de opciones:
1 Ingresar dinero a la cuenta
2 Retirar dinero de la cuenta
3 Salir
*/
public class CajeroAut {
    public static void main(String[] args) {
        float saldoInicial = 1000, ingreso, saldoActual, retiro;
        int opciones;
        
        
        opciones = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico"
                + "\n1. Ingresar dinero a la cuenta."
                + "\n2. Retirar dinero de la cuenta"
                + "\n3. Salir"));
        
        switch(opciones){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog(" Cuanto $$ ingresara? "));
                    saldoActual = ingreso + saldoInicial;
                    JOptionPane.showMessageDialog(null, " El dinero ingresado es: "+ingreso +" \nEl nuevo saldo es: "+saldoActual);
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog(" Cuanto $$ retirara? "));
                    
                if (retiro > saldoInicial){
                    JOptionPane.showMessageDialog(null, " Saldo Insuficiente: ");
                }
                else{
                    saldoActual = saldoInicial - retiro;
                    JOptionPane.showMessageDialog(null, "El saldo actual es: "+saldoActual);
                }
                   break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null, "Tas jodido, coge la vaina correcta");
                     break;
        
        }
    }
    
}
