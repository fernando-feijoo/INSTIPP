package ProgramacionVisual;
import java.util.Scanner;
public class ActividadClase_Veterianaria060622 
{
    public static void main(String[] args) 
    {
        /*Programe un formulario para una veterinaria en Java que pida los siguientes datos por consola:
            *Nombre, Edad, Sexo, Raza, Fecha de Nacimiento, Color, Nombre del propietario*/
        Scanner tc = new Scanner(System.in);
        int edad = 0;
        String nombre = "", sexo = "", raza = "", fechaNacimiento = "", color = "", nombrePropietario = "";
        String [] datos = {"su nombre: ", "su edad: ", "su sexo: ", "su raza: ", 
            "su fecha de nacimiento: ", " su color: ", " nombre del propietario: "};
        for (int i = 0; i < datos.length; i++) 
        {
            System.out.println("\n________________________________");
            System.out.println("Ingrese " + datos[i]);
            switch (i) 
            {
                case 0:
                    nombre = tc.nextLine();
                    break;
                case 1:
                    edad = tc.nextInt();
                    tc.nextLine();
                    break;
                case 2:
                    System.out.println("   -Hembra"
                            + "\n   -Macho");
                    sexo = tc.nextLine();
                    break;
                case 3:
                    raza = tc.nextLine();
                    break;
                case 4:
                    fechaNacimiento = tc.nextLine();
                    break;
                case 5:
                    color = tc.nextLine();
                    break;
                case 6:
                    nombrePropietario = tc.nextLine();
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("________________________________");
        }
        System.out.println("\nDatos ingresados: "
                    + "\nNombre: " + nombre 
                    + "\nEdad: " + edad + " años"
                    + "\nSexo: " + sexo
                    + "\nRaza: " + raza
                    + "\nFecha de nacimiento: " + fechaNacimiento
                    + "\nColor: " + color
                    + "\nNombre de propietario: " + nombrePropietario);
    }
}