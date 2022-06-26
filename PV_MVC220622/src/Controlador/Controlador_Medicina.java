package Controlador;

import Vista.Vista_Medicina;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_Medicina implements ActionListener
{
    Vista_Medicina vista_medicina;
    public Controlador_Medicina(Vista_Medicina vista_medicina) 
    {
        this.vista_medicina = vista_medicina;
        this.vista_medicina.btn_salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == this.vista_medicina.btn_salir) 
        {
            this.vista_medicina.setVisible(false);
        }
    }
    
}
