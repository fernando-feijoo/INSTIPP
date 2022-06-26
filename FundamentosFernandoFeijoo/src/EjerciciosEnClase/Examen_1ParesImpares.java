package EjerciciosEnClase;
import java.util.Scanner;
public class Examen_1ParesImpares 
{
    public static int[] paresImpares(int x)
    {
        Scanner tc = new Scanner(System.in);
        int numero = 0, contadorPar = 0, contadorImpar = 0, contador = 0;
        int paresImpares [] = new int[2];
        do
        {
            System.out.println("Ingrese el " + (contador+1) + "° número: ");
            numero = tc.nextInt();
            if(numero % 2 == 0)
            {
                contadorPar++;
                
            } else
            {
                if(numero != 0)
                {
                    contadorImpar++;
                }
            }
            contador++;
        }while(contador < x);
        paresImpares[0] = contadorPar;
        paresImpares[1] = contadorImpar;
        return paresImpares;
    }
}
