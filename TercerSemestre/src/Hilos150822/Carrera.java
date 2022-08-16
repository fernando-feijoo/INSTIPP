package Hilos150822;
public class Carrera {

    public static void main(String[] args) {

        Corredor corredor1 = new Corredor("Ernesto");
        Corredor corredor2 = new Corredor("Jesus");

        PistaCarrera pista = new PistaCarrera(20);
        pista.setCorredores(corredor1, corredor2);
        pista.empezarCarrera();
    }

}
