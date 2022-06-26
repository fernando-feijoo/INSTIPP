package ActividadClase_14072021;
import java.util.Scanner;
public abstract class Resultados
{
    Scanner tc = new Scanner(System.in);
    String Nombre = "", Apellido = "";
    int Edad = 0, opcion;
    public void Datos(String N, String A, int E)
    {
        System.out.println("\nEl nombre es: " + N
                             + "\nEl Apellido es:  " + A
                             + "\nLa edad es: " + E);
    }
}
