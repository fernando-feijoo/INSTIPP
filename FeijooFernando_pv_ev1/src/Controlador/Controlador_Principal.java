package Controlador;

import Vista.Vista_Estudiante;
import Vista.Vista_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_Principal implements ActionListener
{
    Vista_Principal vistaPrincipal;
    Vista_Estudiante vistaEstudiante = new Vista_Estudiante();
    Controlador_Estudiantes controladorEtudiante = new Controlador_Estudiantes(vistaEstudiante);
    
    public Controlador_Principal(Vista_Principal vistaPrincipal) 
    {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPrincipal.btn_estudiantes.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == this.vistaPrincipal.btn_estudiantes) 
        {
            System.out.println("ingreso");
            this.vistaPrincipal.jp_contenedorOpciones.add(vistaEstudiante);
            this.vistaEstudiante.setVisible(true);
        }
        if (e.getSource() == this.vistaPrincipal.btn_matriculados) 
        {
            
        }
    }
    
}
