package Controlador;
import Modelo.Modelo_Paciente;
import Vista.Vista_Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Controlador_Paciente implements ActionListener
{
    Vista_Paciente vista_paciente;
    Modelo_Paciente modeloPaciente = new Modelo_Paciente();
    public Controlador_Paciente (Vista_Paciente vista_paciente) 
    {
        this.vista_paciente = vista_paciente;
        this.vista_paciente.btn_salir.addActionListener(this);
        this.vista_paciente.btn_guardar.addActionListener(this);
        modeloPaciente.cargar();
    }
    public void borrarDatos ()
    {
        this.vista_paciente.txf_nombre.setText(null);
        this.vista_paciente.txf_edad.setText(null);
        this.vista_paciente.txf_especie.setText(null);
        this.vista_paciente.txf_color.setText(null);
        this.vista_paciente.txf_sexo.setText(null);
        this.vista_paciente.txf_raza.setText(null);
        this.vista_paciente.txf_fechaNacimiento.setText(null);
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
//        Salimos de la ventana y se oculta sando paso a la palabra bienvenida en Vista_Principal.
        
        if (ae.getSource() == this.vista_paciente.btn_salir) 
        {
            this.vista_paciente.setVisible(false);
            borrarDatos();
        }
//        Guardamos la informacion dentro de los textField de Vista_Paciente y se borra una vez guardado.
        if (ae.getSource() == this.vista_paciente.btn_guardar) 
        {
            modeloPaciente.nombre = this.vista_paciente.txf_nombre.getText();
            modeloPaciente.edad = this.vista_paciente.txf_edad.getText();
            modeloPaciente.especie = this.vista_paciente.txf_especie.getText();
            modeloPaciente.color = this.vista_paciente.txf_color.getText();
            modeloPaciente.sexo = this.vista_paciente.txf_sexo.getText();
            modeloPaciente.raza = this.vista_paciente.txf_raza.getText();
            modeloPaciente.fechaNacimiento = this.vista_paciente.txf_fechaNacimiento.getText();
            try 
            {
                modeloPaciente.guardarDatosPaciente();
            } catch (SQLException ex) 
            {
                
            }
            int opcion = JOptionPane.showConfirmDialog(vista_paciente, "¿Desea ingresas mas datos?", "Datos", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.OK_OPTION) 
            {
                borrarDatos();
            }
        }
    }
}
