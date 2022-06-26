package ProgramacionVisual;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FicherosJava 
{
    //Programa para la lectutura de datos de ficheros.
    public static void main(String[] args) 
    {
        BufferedReader lector = null;
        try
        {
            String lineaActual;
            lector = new BufferedReader(new FileReader("C:\\Users\\USUARIO PC\\OneDrive\\ISTJOL\\3.- Tercer Semestre\\Codigos y punto backup\\Java\\A_La_Deriva.txt"));
            while ((lineaActual = lector.readLine()) != null) 
            {
                System.out.println(lineaActual);
            }
        } catch (IOException ex)
        {
            ex.printStackTrace();
        } finally
        {
            try
            {
                if (lector != null) 
                {
                    lector.close();
                }
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
