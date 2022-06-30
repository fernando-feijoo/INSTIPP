package Controlador;
import Modelo.Modelo_Login;
import Vista.Vista_Login;
import Vista.Vista_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//2. implementar listener.
public class Controlador_Login implements ActionListener, ComponentListener, KeyListener
{
    //iniciar la vista para acceder a los componentes.
    Vista_Login login;
    Vista_Principal principalView = new Vista_Principal();
    Controlador_Principal controlPrincipal = new Controlador_Principal(principalView);
    Modelo_Login modeloLogin = new Modelo_Login();
    //constructor.
    public Controlador_Login(Vista_Login login) 
    {
        this.login = login;
        //1. add oyente de eventos.
        this.login.addComponentListener(this);
        this.login.txf_contrasena.addKeyListener(this);
        this.login.txf_usuario.addKeyListener(this);
        this.login.btn_inicioSesion.addActionListener(this);
        this.login.btn_salir.addActionListener(this);
    }
    
    public void centrarElementos()
    {
        int panelX = (login.getWidth() - login.jp_contenedor.getWidth() - login.getInsets().left - login.getInsets().right) / 2;
	int panelY = ((login.getHeight() - login.jp_contenedor.getHeight() - login.getInsets().top - login.getInsets().bottom) / 2);
        login.jp_contenedor.setLocation(panelX, panelY);
    }
    //3. importar los metodos abstractos de los listener.
    // metodo abstracto.
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //preguntar si el evento se ha iniciado en el boton iniciar.
        if (e.getSource() == this.login.btn_inicioSesion) 
        {
            try 
            {
                modeloLogin.usuario = this.login.txf_usuario.getText();
                modeloLogin.password = this.login.txf_contrasena.getText();
                boolean verificacion = modeloLogin.consultaLogin();
                if (verificacion)
                {
                    login.setVisible(false);
                    principalView.setVisible(true);
                }
            else
            {
                JOptionPane.showMessageDialog(login, "Usuario o contraseña incorrectos.", "Error" , JOptionPane.WARNING_MESSAGE);
            }
            } catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(principalView, "Error al ejecutar la consulta. " + ex);
            }
        }
        if (e.getSource() == this.login.btn_salir) 
        {
            int opcion = JOptionPane.showConfirmDialog(login, "¿Desea salir del sistema?", "Salir", JOptionPane.OK_OPTION, JOptionPane.NO_OPTION);
            if (JOptionPane.OK_OPTION == opcion)
            {
                System.exit(0);
            }
        }
    }

    @Override
    public void componentResized(ComponentEvent ce) 
    {
        centrarElementos();
    }

    @Override
    public void componentMoved(ComponentEvent ce) 
    {
        centrarElementos();
    }

    @Override
    public void componentShown(ComponentEvent ce) {    }

    @Override
    public void componentHidden(ComponentEvent ce) {    }

    @Override
    public void keyTyped(KeyEvent ke) 
    {
        char Teclas = ke.getKeyChar();
        if (Teclas == KeyEvent.VK_ENTER) 
        {
            login.btn_inicioSesion.doClick();
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {    }

    @Override
    public void keyReleased(KeyEvent ke) {    }
}
