package ActividadClase_21072021;
import java.util.Scanner;
public class Clase1 
{
    public void datos()
    {
        Scanner tc = new Scanner(System.in);
        int opcion, contador = 0, acumulador = 0;
        System.out.println("Cantidad de usuarios que desea ingresar: ");
        opcion = tc.nextInt();
        tc.nextLine();
        String[] datos = new String[5*opcion];
        do
        {
        System.out.println("\n----Ingrese los datos----");
        System.out.println("Ingrese la cedula: ");
        datos[acumulador] = tc.nextLine();
        acumulador++;
        System.out.println("Ingrese el nombre: ");
        datos[acumulador] = tc.nextLine();
        acumulador++;
        System.out.println("Ingrese el apellido: ");
        datos[acumulador] = tc.nextLine();
        acumulador++;
        System.out.println("Ingrese la edad: ");
        datos[acumulador] = tc.nextLine();
        acumulador++;
        System.out.println("Ingrese la ciudad: ");
        datos[acumulador] = tc.nextLine();
        acumulador++;
        contador++;
        //Print de datos
        }while(contador != opcion);
        acumulador = 0;
        for (int i = 0; i < opcion; i++) 
        {
            System.out.println("\nLa ciudad es: " + datos[4+acumulador]);
            System.out.println("El apellido es: " + datos[2+acumulador]);
            System.out.println("El nombre es: " + datos[1+acumulador]);
            System.out.println("La edad es: " + datos[3+acumulador]);
            System.out.println("La cedula es: " + datos[0+acumulador]);
            acumulador += 5;
        }
    }
}