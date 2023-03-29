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
        String parametro = this.vistaPrueba.txf_busqueda.getText();
        System.out.println("P> " + parametro);
        if (e.getSource() == vistaPrueba.btn_imprimir) {
            try {
            System.out.println("PE> " + parametro);
                JasperReport reporte, jasperSubReport1, jasperSubReport2, jasperSubReport3, jasperSubReport4, jasperSubReport5;
                JasperPrint jprint = null;
                
                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Reporte_Pricipal.jasper"));
//                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Despacho.jasper"));
//                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Reporte_Pricipal.jasper"));
                
//                jasperSubReport1 = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ControlPalet.jasper"));
//                jasperSubReport2 = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Despacho.jasper"));
//                jasperSubReport3 = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Higiene.jasper"));
//                jasperSubReport4 = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Inspeccion.jasper"));
//                jasperSubReport5 = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/datosLlegada.jasper"));
//                
                HashMap<String, Object> param = new HashMap<String, Object>();
//                param.put("contenedor", jasperSubReport1);
//                param.put("contenedor", jasperSubReport2);
//                param.put("contenedor", jasperSubReport3);
//                param.put("contenedor", jasperSubReport4);
//                param.put("contenedor", jasperSubReport5);
                param.put("contenedor", parametro);
                param.put("contenedor", parametro);
                jprint = JasperFillManager.fillReport(reporte, param, modeloConexion.conexion_bd());
                System.out.println("PE> " + parametro);
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
