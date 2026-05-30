package proyecto_poo;

import vista.VentanaAsistencia;

public class Main {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {

            new VentanaAsistencia().setVisible(true);

        });

    }
}