import javax.swing.*;

public class arreglo {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese un nombre");
            System.out.println(nombres[i]);
        }
    }
}

