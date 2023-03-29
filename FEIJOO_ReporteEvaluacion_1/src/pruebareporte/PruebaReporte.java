package pruebareporte;

import Controlador.Controlador_PruebaReporte;
import Vista.Vista_PruebaReporte;

public class PruebaReporte {
    public static void main(String[] args) {
        Vista_PruebaReporte vistaPrueba = new Vista_PruebaReporte();
        Controlador_PruebaReporte controladorPrueba = new Controlador_PruebaReporte(vistaPrueba);
        vistaPrueba.setVisible(true);
    }
}