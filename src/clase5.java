package trabajo1.src;

import javax.swing.*;

public class clase5 {

    public clase5() {
        arreglos();
    }

    public void arreglos() {
// un arreglo es un almacenamiento espontaneo donde podemos almacenar una informacion
// en el momento de ingresar los datos un arreglo unidimencional puede almacenar hasta 1000.000.000
// datos de tipo String int double float etc...

        int numeros[] = new int[5];
        int num1, num2, num3, num4;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;
        numeros[3] = num4;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("[" + i + "]" + i);
        }


    }


    public static void main(String[] args) {

        new clase5();
    }
}
