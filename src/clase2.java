package trabajo1.src;

import javax.swing.*;

public class clase2 {
    public clase2() {
        numerosaleatorios();
    }

    public void numerosaleatorios() {

        int numero, aleatorio, contador = 0;

        aleatorio = (int) (Math.random() * 100);

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

            if (aleatorio > numero) {
                System.out.println("Ingrese un numero mayor");
            } else {
                System.out.println("Ingrese un numero menor");
            }
            contador++;

        } while (numero != aleatorio);
        System.out.println("has asertado el numero es  " + aleatorio + "Y lo hiciste en el " + contador + " Intento/s");

    }

    public static void main(String[] args) {
        new clase2();
    }
}
