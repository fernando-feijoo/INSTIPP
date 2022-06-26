package ActividadClase_28072021;
import java.util.Scanner;
public class Datos1 
{
    public void Datos()
    {
        Scanner tc = new Scanner(System.in);
        System.out.println("Usuarios que desea ingresar: ");
        int opcion = tc.nextInt();
        tc.nextLine();
        String [][] data = new String [opcion][4];
        String[] nombre = new String[]{"Cedula:", "Nombre:", "Apellido:", "Direccion:"};
        for (int i = 0; i < data.length; i++) 
        {
            System.out.println("");
            for (int j = 0; j < data[i].length; j++)
            {
                System.out.println("Ingrese " + nombre[j]);
                data[i][j] = tc.nextLine();
            }
        }
        System.out.println("");
        for (int i = 0; i < data.length; i++) 
        {
            System.out.println("");
            for (int j = 0; j < data[i].length; j++)
            {
                System.out.println(nombre[j] + " (" + i + ")" + "(" + j + ") " + data[i][j]);
            }
        }
    }
}