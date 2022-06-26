package ActividadClase_28072021;
import java.util.Scanner;
/*Realizar el registro de clientes Cedula, nombrea, apellido y direccion de N clientes.*/
public class Datos 
{
    public void Datos()
    {
        Scanner tc = new Scanner(System.in);
        System.out.println("Usuarios que desea ingresar: ");
        int opcion = tc.nextInt();
        tc.nextLine();
        String [][] data = new String [opcion][4];
        String[] nombre = new String[]{"Cedula", "Nombre", "Apellido", "Direccion"};
        int puntero1 = 0, puntero2 = 0, contador = 0;
        do 
        {
            System.out.println("\nIngrese la cedula del usuario: ");
            data[puntero1][puntero2] = tc.nextLine(); puntero2++;
            System.out.println("Ingrese el nombre del usuario: ");
            data[puntero1][puntero2] = tc.nextLine(); puntero2++;
            System.out.println("Ingrese el apellido del usuario: ");
            data[puntero1][puntero2] = tc.nextLine(); puntero2++;
            System.out.println("Ingrese la direccion del usuario: ");
            data[puntero1][puntero2] = tc.nextLine(); puntero2 = 0;
            puntero1++;
            contador++;
        } while (opcion != contador);
        for (int i = 0; i < data.length; i++) 
        {
            for (int j = 0; j < data[i].length/4; j++)
            {
                System.out.println("\nCedula: " + "    (" + i + ")" + "(" + j + ") " + data[i][j]);
                System.out.println("Nombre: " + "    (" + i + ")" + "(" + (j+1) + ") " + data[i][j+1]);
                System.out.println("Apellido: " + "  (" + i + ")" + "(" + (j+2) + ") " + data[i][j+2]);
                System.out.println("Dirección: " + " (" + i + ")" + "(" + (j+3) + ") " + data[i][j+3]);
            }
        }
        
    }
}
