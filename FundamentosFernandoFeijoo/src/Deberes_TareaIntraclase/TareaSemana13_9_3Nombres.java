package Deberes_TareaIntraclase;
/*9)Elabora un programa que permita ingresar 3 nombres de personas y sus edades 
respectivas, presentar por pantalla cuantos menores de edad y cuantos mayores de 
edad hay, y presentar el nombre y la edad del estudiante con mayor edad.*/
import java.util.Scanner;
public class TareaSemana13_9_3Nombres 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        String nombre, nombreMayor = "";
        int edad, menores = 0, mayores = 0, edadAux = 0, mayorEdad = 0;
        for(int f = 0; f < 3;f++)
        {
            System.out.println("\nIngrese el " + (f+1) + "° nombre:");
            nombre = tc.nextLine();
            System.out.println("Ingrese la edad de " + nombre + ":");
            edad = tc.nextInt();
            if(edad < 18)
            {
                menores++;
            } else if(edad >= 18)
            {
                mayores++;
            }
            if(edad > edadAux)
            {
                nombreMayor = nombre;
                mayorEdad = edad;
            }
            if(edad > edadAux)
            {
                edadAux = edad;
            }
            tc.nextLine();
        }
        System.out.println("\nEl número de menores de edad es: " + menores);
        System.out.println("El número de mayores de edad es: " + mayores);
        System.out.println("La persona mayor es " + nombreMayor + ", con " + mayorEdad + " años.");
    }
}
