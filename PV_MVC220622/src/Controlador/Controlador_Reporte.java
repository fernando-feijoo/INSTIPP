package Controlador;

import Vista.Vista_Reporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_Reporte implements ActionListener
{
    Vista_Reporte vista_reporte;
    public Controlador_Reporte(Vista_Reporte vista_reporte) 
    {
        this.vista_reporte = vista_reporte;
        this.vista_reporte.btn_salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == this.vista_reporte.btn_salir) 
        {
            this.vista_reporte.setVisible(false);
        }
    }
    
}
