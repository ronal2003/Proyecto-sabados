package trabajo1.src;

import javax.swing.*;

public class Ejercicio1 {

    public Ejercicio1() {
        menu();
    }

    public void menu() {
        String sms = "Elije una opcion: \n\n";
        sms += "1.suma\n";
        sms += "2.resta\n";
        sms += "3.multiplicacion\n";
        sms += "4.division\n";

        String entrada = JOptionPane.showInputDialog(sms);

        switch (entrada) {
            case "1":
                int num1, num2, resultado;
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para tu suma"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero para tu suma"));
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado de tu suma es: " + resultado);
                break;
            case "2":
                int num_1, num_2, resultados;
                num_1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para tu suma"));
                num_2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero para tu suma"));
                resultados = num_1 - num_2;
                JOptionPane.showMessageDialog(null, "El resultado de tu resta es: " + resultados);
                break;
            case "3":
                int numero1, numero2, resultadoo;
                numero1  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para tu suma"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero para tu suma"));
                resultadoo = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "El resultado de tu multiplicacion es: " + resultadoo);
                break;
            case "4":
                int num3, num4, resulttado;
                num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para tu suma"));
                num4 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero para tu suma"));
                resulttado = num3 / num4;
                JOptionPane.showMessageDialog(null, "El resultado de tu division es: " + resulttado);
                break;

            default: JOptionPane.showMessageDialog(null, "esta opcion nop esta disponible por el momento");
                menu();
        }
    }

    public static void main(String[] args) {
        new Ejercicio1();
    }
}
