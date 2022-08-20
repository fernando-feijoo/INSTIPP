package Hilos_Runneable_190822;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Proceso4 implements Runnable {
    private String nombre;
    Scanner tc = new Scanner(System.in);
    public Proceso4() {
        System.out.println("Proceso 4");
    }

    @Override
    public void run() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ", "Imput");
        System.out.println("Su nombre es: " + nombre);
    }

}
