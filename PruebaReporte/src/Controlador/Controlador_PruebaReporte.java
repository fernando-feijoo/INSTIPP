package Controlador;

import Vista.Vista_PruebaReporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_PruebaReporte implements ActionListener {
    Vista_PruebaReporte vistaPrueba;

    public Controlador_PruebaReporte(Vista_PruebaReporte vistaPrueba) {
        this.vistaPrueba = vistaPrueba;
        this.vistaPrueba.btn_imprimir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaPrueba.btn_imprimir) {
            JasperReport reporte;
            JasperPrint jprint;
            reporte = JRLoader.loadObject(getClass().getResource("/Reportes/Pacientes_Reporte.jasper"));
        }
    }
}