package Hilos_Runneable_190822;
public class Proceso1 extends Thread{

    public Proceso1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Proceso 1");
    }
    
}
