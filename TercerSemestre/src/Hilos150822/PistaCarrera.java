package Hilos150822;

import java.util.logging.Level;
import java.util.logging.Logger;

class PistaCarrera {

    private Corredor c1;
    private Corredor c2;
    private int meta;
    private boolean hayGanador = false;

    public PistaCarrera(int meta) {
        this.meta = meta;
    }

    public int getMeta() {
        return meta;
    }

    public void setCorredores(Corredor c1, Corredor c2) {
        c1.setPista(this);
        c2.setPista(this);
        this.c1 = c1;
        this.c2 = c2;
    }

    public void empezarCarrera() {
        try {
            c1.start();
            c2.start();

            c1.join();
            c2.join();
            System.out.println("Carrera finalizada");
        } catch (InterruptedException ex) {
            Logger.getLogger(PistaCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized void cruzarMeta(Corredor corredor) {
        if(!hayGanador) {
            hayGanador = true;
            System.out.println("Corredor " + corredor.getNombre()+ " es el ganador");
        }
    }
}