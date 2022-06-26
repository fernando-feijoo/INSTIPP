package Controlador;

import Vista.Vista_Configuracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_Configuracion implements ActionListener
{
    Vista_Configuracion vista_configuracion;
    public Controlador_Configuracion(Vista_Configuracion vista_configuracion) 
    {
        this.vista_configuracion = vista_configuracion;
        this.vista_configuracion.btn_salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == this.vista_configuracion.btn_salir) 
        {
            this.vista_configuracion.setVisible(false);
        }
    }
    
}
