package Controlador;

import Modelo.Modelo_Conexion;
import Vista.Vista_PruebaReporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Controlador_PruebaReporte implements ActionListener {

    Vista_PruebaReporte vistaPrueba;
    Modelo_Conexion modeloConexion = new Modelo_Conexion();
    public Controlador_PruebaReporte(Vista_PruebaReporte vistaPrueba) {
        this.vistaPrueba = vistaPrueba;
        this.vistaPrueba.btn_imprimir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaPrueba.btn_imprimir) {
            String parametro = this.vistaPrueba.txf_busqueda.getText();
            try {
                JasperReport reporte;
                JasperPrint jprint = null;
                HashMap<String, Object> param = new HashMap<String, Object>();
                param.put("OBS_GENERAL", parametro);
                param.put("subReporteUno", "/C:\\Users\\User\\JaspersoftWorkspace\\Proyecto_TierraFertil\\Reporte_Principal\\datosLlegada.jasper");
                param.put("subReporteDos", "/C:\\Users\\User\\JaspersoftWorkspace\\Proyecto_TierraFertil\\Reporte_Principal\\Inspeccion.jasper");
                param.put("subReporteTres", "/C:\\Users\\User\\JaspersoftWorkspace\\Proyecto_TierraFertil\\Reporte_Principal\\Higiene.jasper");
                param.put("subReporteTresObs", "/C:\\Users\\User\\JaspersoftWorkspace\\Proyecto_TierraFertil\\Reporte_Principal\\Observacion_Higiene.jasper");
                param.put("subReporteCuatro", "/C:\\Users\\User\\JaspersoftWorkspace\\Proyecto_TierraFertil\\Reporte_Principal\\Despacho.jasper");
                param.put("subReporteCinco", "/C:\\Users\\User\\JaspersoftWorkspace\\Proyecto_TierraFertil\\Reporte_Principal\\ControlPalet.jasper");
                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Reporte.jasper"));
                jprint = JasperFillManager.fillReport(reporte, param, modeloConexion.conexion_bd());
                if (jprint != null) {
                    JasperViewer view = new JasperViewer(jprint);
                    view.setVisible(true);
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex);
            }

        }
    }
}
