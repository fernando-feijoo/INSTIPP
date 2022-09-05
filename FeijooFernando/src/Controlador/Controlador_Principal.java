package Controlador;
import Vista.Vista_Datos;
import Vista.Vista_Usuarios;
import Vista.Vista_Principal;
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
    Vista_Datos vistaDatos = new Vista_Datos();
    Controlador_Datos controlDatos = new Controlador_Datos(vistaDatos);
    Vista_Usuarios vistaUsuarios = new Vista_Usuarios();
    Controlador_Usuarios controlUsuarios = new Controlador_Usuarios(vistaUsuarios);
    Color colorCover = new Color(213,245,227);
    Color colorBase = new Color(204,204,204);
    Color colorBaseExit = new Color(238,238,238);
    Color colorOpcion = new Color(65, 204, 0);
    int opcionClick, contador, xMouse, yMouse;
    Vista_Principal vistaPrincipal;
    public Controlador_Principal(Vista_Principal vistaPrincipal) 
    {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPrincipal.addComponentListener(this);
//        Control de opciones de menu.
        this.vistaPrincipal.jp_opcionUno.addMouseListener(this);
        this.vistaPrincipal.jp_opcionDos.addMouseListener(this);
        this.vistaUsuarios.jp_botonSalir.addMouseListener(this);
        this.vistaDatos.jp_botonSalir.addMouseListener(this);
        this.vistaPrincipal.jp_exit.addMouseListener(this);
//        Control de ventana subMenus
        this.vistaPrincipal.jp_contenedor.addComponentListener(this);
        this.vistaUsuarios.addComponentListener(this);
//        Implementacion de MouseMotionListener, para cuando mueva la pantalla.
        this.vistaPrincipal.jp_textoLogo.addMouseMotionListener(this);
        this.vistaPrincipal.jp_textoLogo.addMouseListener(this);
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
//        Opcion 1 Usuarios
        if (me.getSource() == this.vistaPrincipal.jp_opcionUno) 
        {
//            Coloco el nuevo color del boton seleccionado.
            this.vistaPrincipal.jp_opcionUno.setBackground(colorOpcion);
//            Ocultamos las ventanas que no usaremos.
            this.vistaPrincipal.jp_bienvenida.setVisible(false);
//            Muestro la que necesito.
            this.vistaPrincipal.jp_resultadoOpcion.add(vistaUsuarios);
            this.vistaUsuarios.setBorder(null);
            this.vistaDatos.setVisible(false);
            this.vistaUsuarios.setVisible(true);
//            Valido cada click en la opcion para su animacion MouseListener.
            opcionClick = 1;
//            Valido cuando se hace mas de un click entre menus, pero no sale aun, si sale retorna el color base.
            contador++;
        }
//        Opcion 2 ListaUsuarios
        if (me.getSource() == this.vistaPrincipal.jp_opcionDos) 
        {
//            Coloco el nuevo color del boton seleccionado.
            this.vistaPrincipal.jp_opcionDos.setBackground(colorOpcion);
//            Ocultamos las ventanas que no usaremos.
            this.vistaPrincipal.jp_bienvenida.setVisible(false);
//            Muestro la que necesito.
            this.vistaPrincipal.jp_resultadoOpcion.add(vistaDatos);
            this.vistaDatos.setBorder(null);
            this.vistaUsuarios.setVisible(false);
            this.vistaDatos.setVisible(true);
//            Valido cada click en la opcion para su animacion MouseListener.
            opcionClick = 2;
//            Valido cuando se hace mas de un click entre menus, pero no sale aun, si sale retorna el color base.
            contador++;
        }
//        Opciones de salida:
        if (me.getSource() == this.vistaUsuarios.jp_botonSalir || me.getSource() == this.vistaDatos.jp_botonSalir)
        {
            this.vistaPrincipal.jp_bienvenida.setVisible(true);
            opcionClick = 0;
            contador = 0;
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
        if (me.getSource() == this.vistaPrincipal.jp_textoLogo)
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
        //coloca el color base del boton. El problema era con la opcionClick.
        if (ce.getSource() == this.vistaUsuarios) 
        {
            this.vistaPrincipal.jp_opcionUno.setBackground(colorBase);
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
//        Controlo si se alterna entre menus, cuando se sale de cada 1 el valor de opcionClick regresa a 0.
//        Control para subMenus, temporal toca remplazarlo...
        this.vistaPrincipal.jp_bienvenida.setVisible(true);
        opcionClick = 0;
        contador = 0;
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