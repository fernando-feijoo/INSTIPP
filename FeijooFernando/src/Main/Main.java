package Main;

import Controlador.Controlador_Principal;
import Vista.Vista_Principal;

public class Main 
{
    public static void main(String[] args) 
    {
        Vista_Principal vistaPrincipal = new Vista_Principal();
        Controlador_Principal controlPrincipal = new Controlador_Principal(vistaPrincipal);
        vistaPrincipal.setVisible(true);
    }
}
