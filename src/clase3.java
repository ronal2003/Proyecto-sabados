package trabajo1.src;

import javax.swing.*;

public class clase3 {
    public clase3() {
        validacioncon_or();
        validacion_con_and();
    }

    public void validacion_con_and() {
        String usuario = "Holamundo", usuarios, password = "123456", passwords;

        usuarios = JOptionPane.showInputDialog("Ingrese su correo");
        password = JOptionPane.showInputDialog("Ingrese su password");

        if (usuarios.equals(usuario) && password.equals(password)) {
            System.out.println("Correo y contraseña correctos ");
        } else {
            System.out.println("Contraseña o correo incorrectos");
        }
    }

    public void validacioncon_or() {
        String usuario = "Holamundo", usuarios, password = "123456", passwords;

        usuarios = JOptionPane.showInputDialog("Ingrese su correo");
        password = JOptionPane.showInputDialog("Ingrese su password");

        if (usuarios.equals(usuario) || password.equals(password)) {
            System.out.println("Correo y contraseña correctos ");
        } else {
            System.out.println("Contraseña o correo incorrectos");
        }
    }

    public static void main(String[] args) {
        new clase3();

    }
}
