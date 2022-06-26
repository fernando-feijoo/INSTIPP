package EjerciciosEnClase;
/*Realice un programa que permita presentar los números terminados 
en 0 comprendidos entre 25 al 105.*/
public class Clase12Mar2021_NumerosTerminanEn0 
{
    public static void main(String[] args)
    {
        int numero = 25;
        for(int f = numero; f <= 105; f++)
        {
            if((f%10) == 0)
            {
                System.out.println(f);
            }
        }
    }
}
