package Hilos_Runneable_190822;


public class Proceso2 implements Runnable{
    private int numeroLocal;
    
    public Proceso2(int numero) {
        this.numeroLocal = numero;
    }
    
    @Override
    public void run() {
        for (int i = numeroLocal; i > 0; i--) {
            try {
                Thread.sleep(1000);
                System.out.println("Proceso 2: " + numeroLocal/i);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Proceso2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
