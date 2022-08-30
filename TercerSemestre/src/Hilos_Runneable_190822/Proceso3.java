package Hilos_Runneable_190822;

import java.time.LocalDateTime;


public class Proceso3 implements Runnable{
    public Proceso3() throws InterruptedException {
        Thread.sleep(1000);
        
        System.out.println("Proceso 3");
        
    }
    
    @Override
    public void run() {
        System.out.println("Fecha: " + LocalDateTime.now());
    }
    
}
