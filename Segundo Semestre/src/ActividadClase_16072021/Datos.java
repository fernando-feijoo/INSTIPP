package ActividadClase_16072021;
import java.util.Scanner;
public class Datos 
{
    Scanner tc = new Scanner(System.in);
    String nombre, apellido, ciudad; int edad;
    public void general()
    {
        int contador = 0;
        do
        {
        System.out.print("\nIngrese el nombre: ");
        nombre = tc.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = tc.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudad = tc.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = tc.nextInt();
        tc.nextLine();
        if (ciudad.equalsIgnoreCase("cuenca")) 
        {
            cuenca();
            contador ++;
            imprimir(nombre, apellido, ciudad, edad);
        }else if(ciudad.equalsIgnoreCase("pasaje"))
        {
            pasaje();
            contador ++;
            imprimir(nombre, apellido, ciudad, edad);
        }else if(ciudad.equalsIgnoreCase("tena"))
        {
            tena();
            contador ++;
            imprimir(nombre, apellido, ciudad, edad);
        }else
        {
            System.out.println("\nIngrese una ciudad entre Cuenca, pasaje y Tena.");
        }
        }while(contador != 4);
    }
    public void cuenca()
    {
        edad += 1;
    }
    public void pasaje()
    {
        edad += 2;
    }
    public void tena()
    {
        edad += 0;
    }
    public void imprimir(String N, String A, String C, int E)
    {
        System.out.println("\n--");
        System.out.println("El nombre es: " + N
                         + "\nEl apellido es: " + A
                         + "\nLa ciudad es: " + C
                         + "\nLa edad es: " + E);
        System.out.println("\n--");
    }
}