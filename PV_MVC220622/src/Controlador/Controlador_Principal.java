package Controlador;
import Modelo.Modelo_Paciente;
import Vista.Vista_Cliente;
import Vista.Vista_Configuracion;
import Vista.Vista_Medicina;
import Vista.Vista_Paciente;
import Vista.Vista_Principal;
import Vista.Vista_Reporte;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Controlador_Principal implements MouseListener, ComponentListener, ActionListener
{
    Vista_Paciente vista_paciente = new Vista_Paciente();
    Controlador_Paciente controlPaciente = new Controlador_Paciente(vista_paciente);
    Vista_Cliente vista_cliente = new Vista_Cliente();
    Controlador_Cliente controlCliente = new Controlador_Cliente(vista_cliente);
    Vista_Medicina vista_medicina = new Vista_Medicina();
    Controlador_Medicina controlMedicina =  new Controlador_Medicina(vista_medicina);
    Vista_Reporte vista_reporte = new Vista_Reporte();
    Controlador_Reporte controlReporte = new Controlador_Reporte(vista_reporte);
    Vista_Configuracion vista_configuracion = new Vista_Configuracion();
    Controlador_Configuracion controlConfiguracion = new Controlador_Configuracion(vista_configuracion);
    Color colorOscuro1 = new Color(213,245,227);
    Color colorOscuro2 = new Color(204,204,204);
    Color colorOpcion = new Color(65, 204, 0);
    int opcion_click, contador;
    Vista_Principal principal;
    public Controlador_Principal(Vista_Principal principal) 
    {
        this.principal = principal;
        this.principal.addComponentListener(this);
//        Control de opciones de menu.
        this.principal.jp_contenedor.addComponentListener(this);
        this.principal.jp_opcionUno.addMouseListener(this);
        this.principal.jp_opcionDos.addMouseListener(this);
        this.principal.jp_opcionTres.addMouseListener(this);
        this.principal.jp_opcionCuatro.addMouseListener(this);
        this.principal.jp_opcionCinco.addMouseListener(this);
//        Control de ventana subMenus
        this.vista_paciente.addComponentListener(this);
        this.vista_cliente.addComponentListener(this);
        this.vista_medicina.addComponentListener(this);
        this.vista_reporte.addComponentListener(this);
        this.vista_configuracion.addComponentListener(this);
//        Control de salida de subMenus, para restablecer color base de botones y pantalla Bienvenida.
        this.vista_paciente.btn_salir.addActionListener(this);
        this.vista_cliente.btn_salir.addActionListener(this);
        this.vista_medicina.btn_salir.addActionListener(this);
        this.vista_reporte.btn_salir.addActionListener(this);
        this.vista_configuracion.btn_salir.addActionListener(this);
    }
    public void centrarElementos()
    {
        int panelX = (principal.getWidth() - principal.jp_contenedor.getWidth() - principal.getInsets().left - principal.getInsets().right) / 2;
	int panelY = ((principal.getHeight() - principal.jp_contenedor.getHeight() - principal.getInsets().top - principal.getInsets().bottom) / 2);
        this.principal.jp_contenedor.setLocation(panelX, panelY);
    }
    @Override
    public void mouseClicked(MouseEvent me) 
    {
//        Opcion 1 Pacientes
        if (me.getSource() == this.principal.jp_opcionUno) 
        {
//            Coloco el nuevo color del boton seleccionado.
            this.principal.jp_opcionUno.setBackground(colorOpcion);
//            Ocultamos las ventanas que no usaremos.
            this.principal.jp_bienvenida.setVisible(false);
            this.vista_cliente.setVisible(false);
            this.vista_medicina.setVisible(false);
            this.vista_reporte.setVisible(false);
            this.vista_configuracion.setVisible(false);
//            Muestro la que necesito.
            this.principal.jp_resultadoOpcion.add(vista_paciente);
            this.vista_paciente.setBorder(null);
            this.vista_paciente.setVisible(true);
//            Valido cada click en la opcion para su animacion MouseListener.
            opcion_click = 1;
//            Valido cuando se hace mas de un click entre menus, pero no sale aun, si sale retorna el color base.
            contador++;
        }
//        Opcion 2 Clientes
        if (me.getSource() == this.principal.jp_opcionDos) 
        {
            this.principal.jp_opcionDos.setBackground(colorOpcion);
            
            this.principal.jp_bienvenida.setVisible(false);
            this.vista_paciente.setVisible(false);
            this.vista_medicina.setVisible(false);
            this.vista_reporte.setVisible(false);
            this.vista_configuracion.setVisible(false);
            
            this.principal.jp_resultadoOpcion.add(vista_cliente);
            this.vista_cliente.setBorder(null);
            this.vista_cliente.setVisible(true);
            
            opcion_click = 2;
            contador++;
        }
//        Opcion 3 Medicinas 
        if (me.getSource() == this.principal.jp_opcionTres) 
        {
            this.principal.jp_opcionTres.setBackground(colorOpcion);
            
            this.principal.jp_bienvenida.setVisible(false);
            this.vista_paciente.setVisible(false);
            this.vista_cliente.setVisible(false);
            this.vista_reporte.setVisible(false);
            this.vista_configuracion.setVisible(false);
            
            this.principal.jp_resultadoOpcion.add(vista_medicina);
            this.vista_medicina.setBorder(null);
            this.vista_medicina.setVisible(true);
            
            opcion_click = 3;
            contador++;
        }
//        Opcion 4 Reporte
        if (me.getSource() == this.principal.jp_opcionCuatro) 
        {
            this.principal.jp_opcionCuatro.setBackground(colorOpcion);
            
            this.principal.jp_bienvenida.setVisible(false);
            this.vista_paciente.setVisible(false);
            this.vista_cliente.setVisible(false);
            this.vista_medicina.setVisible(false);
            this.vista_configuracion.setVisible(false);
            
            this.principal.jp_resultadoOpcion.add(vista_reporte);
            this.vista_reporte.setBorder(null);
            this.vista_reporte.setVisible(true);
            
            opcion_click = 4;
            contador++;
        }
//        Opcion 5 Configuracion
        if (me.getSource() == this.principal.jp_opcionCinco) 
        {
            this.principal.jp_opcionCinco.setBackground(colorOpcion);
            
            this.principal.jp_bienvenida.setVisible(false);
            this.vista_paciente.setVisible(false);
            this.vista_cliente.setVisible(false);
            this.vista_medicina.setVisible(false);
            this.vista_reporte.setVisible(false);
            
            this.principal.jp_resultadoOpcion.add(vista_configuracion);
            this.vista_configuracion.setBorder(null);
            this.vista_configuracion.setVisible(true);
            
            opcion_click = 5;
            contador++;
        }
    }
    @Override
    public void mousePressed(MouseEvent me) {    }
    @Override
    public void mouseReleased(MouseEvent me) {    }
    @Override
    public void mouseEntered(MouseEvent me) 
    {
//        Asigno color al jPanel donde se encuentre el mouse.
        if (me.getSource() == this.principal.jp_opcionUno && (opcion_click != 1)) 
        {
            this.principal.jp_opcionUno.setBackground(colorOscuro1);
        }
        else if (me.getSource() == this.principal.jp_opcionDos && (opcion_click != 2)) 
        {
            this.principal.jp_opcionDos.setBackground(colorOscuro1);
        }
        else if (me.getSource() == this.principal.jp_opcionTres && (opcion_click != 3)) 
        {
            this.principal.jp_opcionTres.setBackground(colorOscuro1);
        }
        else if (me.getSource() == this.principal.jp_opcionCuatro && (opcion_click != 4)) 
        {
            this.principal.jp_opcionCuatro.setBackground(colorOscuro1);
        }
        else if (me.getSource() == this.principal.jp_opcionCinco && (opcion_click != 5)) 
        {
            this.principal.jp_opcionCinco.setBackground(colorOscuro1);
        }
    }
    @Override
    public void mouseExited(MouseEvent me) 
    {
//        Asigno nuevo color, que es el base cuando sale el mouse del jPanel.
        if (me.getSource() == this.principal.jp_opcionUno && (opcion_click != 1)) 
        {
            this.principal.jp_opcionUno.setBackground(colorOscuro2);
        }
        else if (me.getSource() == this.principal.jp_opcionDos && (opcion_click != 2)) 
        {
            this.principal.jp_opcionDos.setBackground(colorOscuro2);
        }
        else if (me.getSource() == this.principal.jp_opcionTres && (opcion_click != 3)) 
        {
            this.principal.jp_opcionTres.setBackground(colorOscuro2);
        }
        else if (me.getSource() == this.principal.jp_opcionCuatro && (opcion_click != 4)) 
        {
            this.principal.jp_opcionCuatro.setBackground(colorOscuro2);
        }
        else if (me.getSource() == this.principal.jp_opcionCinco && (opcion_click != 5)) 
        {
            this.principal.jp_opcionCinco.setBackground(colorOscuro2);
        }
    }
    @Override
    public void componentResized(ComponentEvent ce) 
    {
//        Esto es cuando se maximiza la pestaña.
        centrarElementos();
    }
    @Override
    public void componentMoved(ComponentEvent ce) 
    {
//        Me sirve cuando se hace alguna opcion, que mueva el jPanel. Asi lo centrol.
        centrarElementos();
    }
    @Override
    public void componentShown(ComponentEvent ce) {    }
    @Override
    public void componentHidden(ComponentEvent ce) 
    {
        //coloca el color base del boton. El problema era con la opcion_click.
        if (ce.getSource() == this.vista_paciente) 
        {
            this.principal.jp_opcionUno.setBackground(colorOscuro2);
        }
        if (ce.getSource() == this.vista_cliente) 
        {
            this.principal.jp_opcionDos.setBackground(colorOscuro2);
        }
        if (ce.getSource() == this.vista_medicina) 
        {
            this.principal.jp_opcionTres.setBackground(colorOscuro2);
        }
        if (ce.getSource() == this.vista_reporte) 
        {
            this.principal.jp_opcionCuatro.setBackground(colorOscuro2);
        }
        if (ce.getSource() == this.vista_configuracion) 
        {
            this.principal.jp_opcionCinco.setBackground(colorOscuro2);
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
//        Controlo si se alterna entre menus, cuando se sale de cada 1 el valor de opcion_click regresa a 0.
//        Control para subMenus
        this.principal.jp_bienvenida.setVisible(true);
        opcion_click = 0;
        contador = 0;
    }
}