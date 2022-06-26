package EjerciciosEnClase;
import java.util.Scanner;
public class Examen_1Suma 
{
    public static int sumaNumeros(int x)
    {
        Scanner tc = new Scanner(System.in);
        int contador = 1, numero, acumulador = 0;
        do
        {
        System.out.println("Ingrese el " + contador + "° número: ");
        numero = tc.nextInt();
        acumulador += numero;
        contador++;
        }while(contador <= x);
        return acumulador;
    }
}
