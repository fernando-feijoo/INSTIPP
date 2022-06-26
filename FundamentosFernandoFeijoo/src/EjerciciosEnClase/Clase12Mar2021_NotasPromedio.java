package EjerciciosEnClase;
/*Realice un programa que permita ingresar una cantidad de notas determinada, 
presentar por pantalla el promedio de las notas ingresadas.*/
import java.util.Scanner;
public class Clase12Mar2021_NotasPromedio 
{
    public static void main (String[] args)
    {
        double nota, suma = 0, promedio, totalNotas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero de notas que va a ingresar:");
        totalNotas = teclado.nextDouble();
        System.out.println("");
        if(totalNotas > 0)
        {
        for(int f = 1; f <= totalNotas; f++)
        {
            do
            {
            System.out.println("Ingrese la "+ f + "° nota:");
            nota = teclado.nextDouble();
            suma += nota;
            if(nota < 0)
            {
                System.out.println("\nIngrese un numero mayor o igual a 0.");
            }
            }while(nota < 0);
        }
        }else
        {
            System.out.println("No va a ingresar notas.");
        }
        if(totalNotas != 0 && totalNotas > 0)
        {
            promedio = suma / totalNotas;
            System.out.println("\nEl promedio final es: " + promedio);
        }
    }  
}
