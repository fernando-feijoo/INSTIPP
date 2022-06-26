package Deberes_TareaIntraclase;
/*Realizar un programa que lea el nombre de una persona y su edad, 
deberá presentar el nombre de la persona mayor y la edad.*/
import java.util.Scanner;
public class TareaSemana11_PersonaMayorEdad 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int numPersonas, contador,respuestaFinal;
        int respuestaUno = 0;
        int respuestaDos = 0;
        System.out.println("Cuantas personas va a ingresar?");
        numPersonas = teclado.nextInt();
        int[] edad = new int[numPersonas];
        String[] nombre = new String[numPersonas];
        contador = 0;
        while(contador <= numPersonas-1)
        {
            System.out.println("");
            teclado.nextLine();
            System.out.println("Ingrese el nombre de la " + (contador+1) + "° persona: ");
            nombre[contador] = teclado.nextLine();
            System.out.println("Ingrese la edad de " + nombre[contador] + ": ");
            edad[contador] = teclado.nextInt();
            contador++;
        }
        contador = 1;
        while(contador <= numPersonas-1)
        {
            for(int f=0; f <= numPersonas-2; f++)
            {
                if(edad[f] > edad[contador])
                {
                    respuestaUno = f;
                }else if(edad[contador] > edad[f])
                {
                    respuestaDos = contador;
                }
                contador++;
            }
        }
        if(edad[respuestaUno] > edad[respuestaDos])
        {
            respuestaFinal = respuestaUno;
        }else
        {
            respuestaFinal = respuestaDos;
        }
        System.out.println("");
        System.out.println("La persona mayor es: " + nombre[respuestaFinal] + " con " + edad[respuestaFinal] + " años.");
    }
}
