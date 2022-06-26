package ActividadClase_06082021;
import java.util.Scanner;
public class JuegoAdivina 
{
    public void juego()
    {
        Scanner tc = new Scanner(System.in);
        int numeroRandom, c = 0;
        Integer[] respuesta = new Integer[5];
        numeroRandom = (int)(Math.random() * (100 - 1 + 1) + 1);
        System.out.println("<Tiene 5 intentos para adivinar un numero del 1 al 100>" + numeroRandom);
        do
        {
            System.out.println("\nIngrese su respuesta: ");
            respuesta[c] = tc.nextInt();
        if (respuesta[c] > numeroRandom)
        {
            System.out.println("Su respuesta esta por arriba del numero deseado.");
        } else if(respuesta[c] < numeroRandom)
        {
            System.out.println("Su respuesta esta por debajo del numero deseado.");
        } else if(respuesta[c] == numeroRandom)
        {
            System.out.println("\nFELICIDADES ADIVINASTE EL NUMERO!");
            break;
        }
        c++;
        if (c == 5) 
        {
            System.out.println("\n\nLo sentimos has perdido, mas suerte a la proxima!");
        }
        }while(c != 5);
        for (int i = 0; i < respuesta.length; i++) 
        {
            if(respuesta[i] != null)
            {
                System.out.println("\nNumeros ingresados: #" + (i+1) + "  -  " + respuesta[i]);
            }
        }
        System.out.println("\nLa respuesta correcta era: " + numeroRandom);
    }
}