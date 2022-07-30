package Main;

import Controlador.Controlador_Principal;
import Vista.Vista_Principal;

public class Main {
    public static void main(String[] args) 
    {
        Vista.Vista_Principal vistaPrincipal = new Vista_Principal();
        Controlador.Controlador_Principal controladorPincipal = new Controlador_Principal(vistaPrincipal);
        vistaPrincipal.show(true);
    }
    
}
