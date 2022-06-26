package Controlador;

import Vista.Vista_Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_Cliente implements ActionListener
{
    Vista_Cliente vista_cliente;
    public Controlador_Cliente(Vista_Cliente vista_cliente) 
    {
        this.vista_cliente = vista_cliente;
        this.vista_cliente.btn_salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == this.vista_cliente.btn_salir) 
        {
            this.vista_cliente.setVisible(false);
        }
    }
    
}
