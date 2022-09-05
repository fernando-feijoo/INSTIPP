package Hilos_Runneable_190822;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Proceso1 p1 = new Proceso1();
        Proceso2 p2 = new Proceso2(8);
        Proceso3 p3 = new Proceso3();
        Proceso4 p4 = new Proceso4();
        
        p1.start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();
        
    }
}
