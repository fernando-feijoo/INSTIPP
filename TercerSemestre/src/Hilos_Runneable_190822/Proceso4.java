package Hilos_Runneable_190822;

import javax.swing.JOptionPane;

public class Proceso4 implements Runnable {
    public Proceso4() {
    }

    @Override
    public void run() {
      JOptionPane.showMessageDialog(null, "Proceso 4");
    }

}
