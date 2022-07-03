package Controlador;
import Vista.Vista_Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Controlador_Paciente implements ActionListener
{
    Vista_Paciente vista_paciente;
    public Controlador_Paciente (Vista_Paciente vista_paciente) 
    {
        this.vista_paciente = vista_paciente;
        this.vista_paciente.btn_salir.addActionListener(this);
        this.vista_paciente.btn_guardar.addActionListener(this);
    }
    /*public static void generarArchivo (File fichero, String datos)
    {
        try 
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter salida = new BufferedWriter(fw);
            salida.write(datos);
            salida.close();
        } catch (IOException e) 
        {
            e.getStackTrace();
        }
    }*/
    /*public  String [] cadenaDatos ()
    {
        String [] datos = {this.vista_paciente.txf_nombre.getText(), 
                           this.vista_paciente.txf_edad.getText(), 
                           this.vista_paciente.txf_especie.getText(),
                           this.vista_paciente.txf_color.getText(),
                           this.vista_paciente.txf_sexo.getText(),
                           this.vista_paciente.txf_raza.getText(),
                           this.vista_paciente.txf_fechaNacimiento.getText()};
        return datos;
    }*/
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
            /*String [] datos;
            datos = cadenaDatos();
            String datosTexto = "";
            if(!datos[0].equalsIgnoreCase(""))
            {
                String[] titulos = {"Nombre: ", "Edad: ", "Especie: ", "Color: ", "Sexo: ", "Raza: ", "Fecha de Nac. : "};
                //PC Casa
                //File fichero = new File("C:\\Users\\User\\OneDrive\\ISTJOL\\3.- Tercer Semestre\\2. PROGRAMACIÓN VISUAL\\Clases Diarias\\DatosPaciente.txt");
                //PC Portatil
                File fichero = new File("C:\\Users\\USUARIO PC\\OneDrive\\ISTJOL\\3.- Tercer Semestre\\2. PROGRAMACIÓN VISUAL\\Clases Diarias\\DatosPaciente.txt");
                for (int i = 0; i < titulos.length; i++) 
                {
                    datosTexto += "\n" + titulos[i] + datos[i];
                }
                generarArchivo(fichero, datosTexto);
    //            Preguntar si desea ingresar mas datos. Aunque el corrado estaria por defecto...
                int opcion = JOptionPane.showConfirmDialog(vista_paciente, "¿Desea ingresas mas datos?", "Datos", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.OK_OPTION) 
                {
                    borrarDatos();
                }
            }else
            {
                JOptionPane.showMessageDialog(vista_paciente, "No ingreso todos los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }*/
        }
    }
}
