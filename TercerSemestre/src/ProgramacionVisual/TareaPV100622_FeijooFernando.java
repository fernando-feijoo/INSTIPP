package ProgramacionVisual;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
        Diseñe un programa que solicite el ingreso en consola por teclado de los
        siguientes datos:
        •	Nombres
        •	Apellidos
        •	Semestre
        •	Jornada
        •	Carera
        Estos datos se deben almacenar en un fichero de nombre matricula.txt en
        cualquier ubicación de su dispositivo. Al finalizar, debe mostrar un mensaje
        en consola indicando que "el archivo se ha creado en la ruta: (imprimir ruta
        del archivo)"
 */
public class TareaPV100622_FeijooFernando 
{
    public static void main(String[] args) 
    {
        Scanner tc = new Scanner(System.in);
        String datos = "";
        String[] titulos = {"Nombre: ", "Apellidos: ", "Semestre: ", "Jornada: ", "Carrera: "};
        //PC Casa
        File fichero = new File("C:\\Users\\User\\OneDrive\\ISTJOL\\3.- Tercer Semestre\\2. PROGRAMACIÓN VISUAL\\Clases Diarias\\matricula.txt");
        //PC Portatil
        //File fichero = new File("C:\\Users\\User\\OneDrive\\ISTJOL\\3.- Tercer Semestre\\2. PROGRAMACIÓN VISUAL\\Clases Diarias\\matricula.txt");
        for (int i = 0; i < titulos.length; i++) 
        {
            System.out.println("\n--------------------");
            System.out.println("\nIngrese " + titulos[i] + "\n");
            datos += "\n" + titulos[i] + tc.nextLine();
        }
        generarArchivo(fichero, datos);
    }
    public static void generarArchivo (File fichero, String datos)
    {
        try 
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter salida = new BufferedWriter(fw);
            salida.write(datos);
            salida.close();
            String absolutePath = fichero.getAbsolutePath();
            System.out.println("\nEl archivo se ha creado en la ruta: " + absolutePath);
        } catch (IOException e) 
        {
            e.getStackTrace();
        }
    }
}
