package Controlador;
import Modelo.Modelo_Login;
import Vista.Vista_Login;
import Vista.Vista_Principal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//2. implementar listener.
public class Controlador_Login implements ActionListener, ComponentListener, KeyListener, MouseListener, MouseMotionListener
{
    //iniciar la vista para acceder a los componentes.
    Vista_Login login;
    Vista_Principal principalView = new Vista_Principal();
    Controlador_Principal controlPrincipal = new Controlador_Principal(principalView);
    Modelo_Login modeloLogin = new Modelo_Login();
    int xMouse;
    int yMouse;
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
        
        this.login.txf_usuario.addMouseListener(this);
        this.login.txf_contrasena.addMouseListener(this);
        
        this.login.jp_header.addMouseListener(this);
        this.login.jp_header.addMouseMotionListener(this);
    }
    
    public void centrar_elementos()
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
            int temp = 0;
            try 
            {
                modeloLogin.usuario = this.login.txf_usuario.getText();
                modeloLogin.password = this.login.txf_contrasena.getText();
                
                ResultSet rs = modeloLogin.consulta_login();
                
                while (rs.next()) 
                {
                    temp = 1;
                }
                if (temp == 1) 
                {
                    login.setVisible(false);
                    principalView.setVisible(true);
                }else
                {
                    JOptionPane.showMessageDialog(login, "ACCESO DENEGADO.", "Error" , JOptionPane.WARNING_MESSAGE);
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
        centrar_elementos();
    }

    @Override
    public void componentMoved(ComponentEvent ce) 
    {
        centrar_elementos();
    }

    @Override
    public void componentShown(ComponentEvent ce) {    }

    @Override
    public void componentHidden(ComponentEvent ce) {    }

    @Override
    public void keyTyped(KeyEvent ke) 
    {
        char teclas = ke.getKeyChar();
        if (teclas == KeyEvent.VK_ENTER) 
        {
            login.btn_inicioSesion.doClick();
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {    }

    @Override
    public void keyReleased(KeyEvent ke) {    }

    @Override
    public void mouseClicked(MouseEvent me) {    }

    @Override
    public void mousePressed(MouseEvent me) 
    {
        if (me.getSource() == this.login.txf_usuario)
        {
            if (this.login.txf_usuario.getText().equals("Ingrese su usario")) 
            {
                this.login.txf_usuario.setText("");
                this.login.txf_usuario.setForeground(Color.black);
            }
            if (String.valueOf(this.login.txf_contrasena.getPassword()).isEmpty()) 
            {
                this.login.txf_contrasena.setText("**********");
                this.login.txf_contrasena.setForeground(Color.gray);

            }
        }
        if (me.getSource() == this.login.txf_contrasena)
        {
            if (String.valueOf(this.login.txf_contrasena.getPassword()).equals("**********")) 
            {
                this.login.txf_contrasena.setText("");
                this.login.txf_contrasena.setForeground(Color.black);
            }
            if (this.login.txf_usuario.getText().isEmpty()) 
            {
                this.login.txf_usuario.setText("Ingrese su usario");
                this.login.txf_usuario.setForeground(Color.gray);

            }
        }
        if (me.getSource() == this.login.jp_header) 
        {
            xMouse = me.getX();
            yMouse = me.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {    }

    @Override
    public void mouseEntered(MouseEvent me) {    }

    @Override
    public void mouseExited(MouseEvent me) {    }

    @Override
    public void mouseDragged(MouseEvent me) 
    {
        int x = me.getXOnScreen();
        int y = me.getYOnScreen();
        this.login.setLocation(x - xMouse, y - yMouse);
    }

    @Override
    public void mouseMoved(MouseEvent me) {    }
}
