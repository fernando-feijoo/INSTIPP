package Controlador;
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
import java.awt.event.MouseMotionListener;
public class Controlador_Principal implements MouseListener, ComponentListener, ActionListener, MouseMotionListener
{
    Vista_Paciente vistaPaciente = new Vista_Paciente();
    Controlador_Paciente controlPaciente = new Controlador_Paciente(vistaPaciente);
    Vista_Cliente vistaCliente = new Vista_Cliente();
    Controlador_Cliente controlCliente = new Controlador_Cliente(vistaCliente);
    Vista_Medicina vistaMedicina = new Vista_Medicina();
    Controlador_Medicina controlMedicina =  new Controlador_Medicina(vistaMedicina);
    Vista_Reporte vistaReporte = new Vista_Reporte();
    Controlador_Reporte controlReporte = new Controlador_Reporte(vistaReporte);
    Vista_Configuracion vistaConfiguracion = new Vista_Configuracion();
    Controlador_Configuracion controlConfiguracion = new Controlador_Configuracion(vistaConfiguracion);
    Color colorCover = new Color(213,245,227);
    Color colorBase = new Color(204,204,204);
    Color colorBaseExit = new Color(238,238,238);
    Color colorOpcion = new Color(65, 204, 0);
    int opcionClick, xMouse, yMouse;
    Vista_Principal vistaPrincipal;
    public Controlador_Principal(Vista_Principal vistaPrincipal) 
    {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPrincipal.addComponentListener(this);
//        Control de opciones de menu.
        this.vistaPrincipal.jp_opcionUno.addMouseListener(this);
        this.vistaPrincipal.jp_opcionDos.addMouseListener(this);
        this.vistaPrincipal.jp_opcionTres.addMouseListener(this);
        this.vistaPrincipal.jp_opcionCuatro.addMouseListener(this);
        this.vistaPrincipal.jp_opcionCinco.addMouseListener(this);
        this.vistaPaciente.jp_botonSalir.addMouseListener(this);
        this.vistaCliente.jp_botonSalir.addMouseListener(this);
        this.vistaMedicina.jp_botonSalir.addMouseListener(this);
        this.vistaPrincipal.jp_exit.addMouseListener(this);
//        Control de ventana subMenus
        this.vistaPrincipal.jp_contenedor.addComponentListener(this);
        this.vistaPaciente.addComponentListener(this);
        this.vistaCliente.addComponentListener(this);
        this.vistaMedicina.addComponentListener(this);
        this.vistaReporte.addComponentListener(this);
        this.vistaConfiguracion.addComponentListener(this);
//        Control de salida de subMenus, para restablecer color base de botones y pantalla Bienvenida.
        this.vistaReporte.btn_salir.addActionListener(this);
        this.vistaConfiguracion.btn_salir.addActionListener(this);
//        Implementacion de MouseMotionListener, para cuando mueva la pantalla.
        this.vistaPrincipal.jp_textoLogo.addMouseMotionListener(this);
        this.vistaPrincipal.jp_textoLogo.addMouseListener(this);
        this.vistaPrincipal.txf_logoPrincipal.addMouseMotionListener(this);
        this.vistaPrincipal.txf_logoPrincipal.addMouseListener(this);
    }
    public void centrarElementos()
    {
        int panelX = (vistaPrincipal.getWidth() - vistaPrincipal.jp_contenedor.getWidth() - vistaPrincipal.getInsets().left - vistaPrincipal.getInsets().right) / 2;
	int panelY = ((vistaPrincipal.getHeight() - vistaPrincipal.jp_contenedor.getHeight() - vistaPrincipal.getInsets().top - vistaPrincipal.getInsets().bottom) / 2);
        this.vistaPrincipal.jp_contenedor.setLocation(panelX, panelY);
    }
    @Override
    public void mouseClicked(MouseEvent me) 
    {
//        Opcion 1 Pacientes
        if (me.getSource() == this.vistaPrincipal.jp_opcionUno) 
        {
//            Coloco el nuevo color del boton seleccionado.
            this.vistaPrincipal.jp_opcionUno.setBackground(colorOpcion);
//            Ocultamos las ventanas que no usaremos.
            this.vistaPrincipal.jp_bienvenida.setVisible(false);
            this.vistaCliente.setVisible(false);
            this.vistaMedicina.setVisible(false);
            this.vistaReporte.setVisible(false);
            this.vistaConfiguracion.setVisible(false);
//            Muestro la que necesito.
            this.vistaPrincipal.jp_resultadoOpcion.add(vistaPaciente);
            this.vistaPaciente.setBorder(null);
            this.vistaPaciente.setVisible(true);
//            Valido cada click en la opcion para su animacion MouseListener.
            opcionClick = 1;
//            Valido cuando se hace mas de un click entre menus, pero no sale aun, si sale retorna el color base.
        }
//        Opcion 2 Clientes
        if (me.getSource() == this.vistaPrincipal.jp_opcionDos) 
        {
            this.vistaPrincipal.jp_opcionDos.setBackground(colorOpcion);
            
            this.vistaPrincipal.jp_bienvenida.setVisible(false);
            this.vistaPaciente.setVisible(false);
            this.vistaMedicina.setVisible(false);
            this.vistaReporte.setVisible(false);
            this.vistaConfiguracion.setVisible(false);
            
            this.vistaPrincipal.jp_resultadoOpcion.add(vistaCliente);
            this.vistaCliente.setBorder(null);
            this.vistaCliente.setVisible(true);
            
            opcionClick = 2;
        }
//        Opcion 3 Medicinas 
        if (me.getSource() == this.vistaPrincipal.jp_opcionTres) 
        {
            this.vistaPrincipal.jp_opcionTres.setBackground(colorOpcion);
            
            this.vistaPrincipal.jp_bienvenida.setVisible(false);
            this.vistaPaciente.setVisible(false);
            this.vistaCliente.setVisible(false);
            this.vistaReporte.setVisible(false);
            this.vistaConfiguracion.setVisible(false);
            
            this.vistaPrincipal.jp_resultadoOpcion.add(vistaMedicina);
            this.vistaMedicina.setBorder(null);
            this.vistaMedicina.setVisible(true);
            
            opcionClick = 3;
        }
//        Opcion 4 Reporte
        if (me.getSource() == this.vistaPrincipal.jp_opcionCuatro) 
        {
            this.vistaPrincipal.jp_opcionCuatro.setBackground(colorOpcion);
            
            this.vistaPrincipal.jp_bienvenida.setVisible(false);
            this.vistaPaciente.setVisible(false);
            this.vistaCliente.setVisible(false);
            this.vistaMedicina.setVisible(false);
            this.vistaConfiguracion.setVisible(false);
            
            this.vistaPrincipal.jp_resultadoOpcion.add(vistaReporte);
            this.vistaReporte.setBorder(null);
            this.vistaReporte.setVisible(true);
            
            opcionClick = 4;
        }
//        Opcion 5 Configuracion
        if (me.getSource() == this.vistaPrincipal.jp_opcionCinco) 
        {
            this.vistaPrincipal.jp_opcionCinco.setBackground(colorOpcion);
            
            this.vistaPrincipal.jp_bienvenida.setVisible(false);
            this.vistaPaciente.setVisible(false);
            this.vistaCliente.setVisible(false);
            this.vistaMedicina.setVisible(false);
            this.vistaReporte.setVisible(false);
            
            this.vistaPrincipal.jp_resultadoOpcion.add(vistaConfiguracion);
            this.vistaConfiguracion.setBorder(null);
            this.vistaConfiguracion.setVisible(true);
            
            opcionClick = 5;
        }
//        Opciones de salida:
        if (me.getSource() == this.vistaPaciente.jp_botonSalir || me.getSource() == this.vistaCliente.jp_botonSalir
         || me.getSource() == this.vistaMedicina.jp_botonSalir)
        {
            this.vistaPrincipal.jp_bienvenida.setVisible(true);
            opcionClick = 0;
        }
        
        if (me.getSource() == this.vistaPrincipal.jp_exit)
        {
            System.exit(0);
        }
    }
    @Override
    public void mousePressed(MouseEvent me) 
    {
        //        Opcion de mover ventana.
        if (me.getSource() == this.vistaPrincipal.jp_textoLogo || me.getSource() == this.vistaPrincipal.txf_logoPrincipal)
        {
            xMouse = me.getX();
            yMouse = me.getY();
        }
    }
    @Override
    public void mouseReleased(MouseEvent me) {    }
    @Override
    public void mouseEntered(MouseEvent me) 
    {
//        Asigno color al jPanel donde se encuentre el mouse.
        if (me.getSource() == this.vistaPrincipal.jp_opcionUno && (opcionClick != 1)) 
        {
            this.vistaPrincipal.jp_opcionUno.setBackground(colorCover);
        }
        else if (me.getSource() == this.vistaPrincipal.jp_opcionDos && (opcionClick != 2)) 
        {
            this.vistaPrincipal.jp_opcionDos.setBackground(colorCover);
        }
        else if (me.getSource() == this.vistaPrincipal.jp_opcionTres && (opcionClick != 3)) 
        {
            this.vistaPrincipal.jp_opcionTres.setBackground(colorCover);
        }
        else if (me.getSource() == this.vistaPrincipal.jp_opcionCuatro && (opcionClick != 4)) 
        {
            this.vistaPrincipal.jp_opcionCuatro.setBackground(colorCover);
        }
        else if (me.getSource() == this.vistaPrincipal.jp_opcionCinco && (opcionClick != 5)) 
        {
            this.vistaPrincipal.jp_opcionCinco.setBackground(colorCover);
        }
        if (me.getSource() == this.vistaPrincipal.jp_exit) 
        {
            this.vistaPrincipal.jp_exit.setBackground(Color.red);
        }
    }
    @Override
    public void mouseExited(MouseEvent me) 
    {
//        Asigno nuevo color, que es el base cuando sale el mouse del jPanel.
        if (me.getSource() == this.vistaPrincipal.jp_opcionUno && (opcionClick != 1)) 
        {
            this.vistaPrincipal.jp_opcionUno.setBackground(colorBase);
        }
        else if (me.getSource() == this.vistaPrincipal.jp_opcionDos && (opcionClick != 2)) 
        {
            this.vistaPrincipal.jp_opcionDos.setBackground(colorBase);
        }
        else if (me.getSource() == this.vistaPrincipal.jp_opcionTres && (opcionClick != 3)) 
        {
            this.vistaPrincipal.jp_opcionTres.setBackground(colorBase);
        }
        else if (me.getSource() == this.vistaPrincipal.jp_opcionCuatro && (opcionClick != 4)) 
        {
            this.vistaPrincipal.jp_opcionCuatro.setBackground(colorBase);
        }
        else if (me.getSource() == this.vistaPrincipal.jp_opcionCinco && (opcionClick != 5)) 
        {
            this.vistaPrincipal.jp_opcionCinco.setBackground(colorBase);
        }
        if (me.getSource() == this.vistaPrincipal.jp_exit) 
        {
            this.vistaPrincipal.jp_exit.setBackground(colorBaseExit);
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
        // coloca el color base del boton. El problema era con la opcionClick.
        // Actualizamos los colores de los botones cuando seleccionamos una opcion.
        if (ce.getSource() == this.vistaPaciente) 
        {
            this.vistaPrincipal.jp_opcionUno.setBackground(colorBase);
        }
        if (ce.getSource() == this.vistaCliente) 
        {
            this.vistaPrincipal.jp_opcionDos.setBackground(colorBase);
        }
        if (ce.getSource() == this.vistaMedicina) 
        {
            this.vistaPrincipal.jp_opcionTres.setBackground(colorBase);
        }
        if (ce.getSource() == this.vistaReporte) 
        {
            this.vistaPrincipal.jp_opcionCuatro.setBackground(colorBase);
        }
        if (ce.getSource() == this.vistaConfiguracion) 
        {
            this.vistaPrincipal.jp_opcionCinco.setBackground(colorBase);
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
//        Controlo si se alterna entre menus, cuando se sale de cada 1 el valor de opcionClick regresa a 0.
        this.vistaPrincipal.jp_bienvenida.setVisible(true);
        opcionClick = 0;
    }

    @Override
    public void mouseDragged(MouseEvent me) 
    {
        int x = me.getXOnScreen();
        int y = me.getYOnScreen();
        this.vistaPrincipal.setLocation(x - xMouse, y - yMouse);
    }

    @Override
    public void mouseMoved(MouseEvent me) {    }
}