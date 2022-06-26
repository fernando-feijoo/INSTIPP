package EjerciciosEnClase;
/*Mostrar en pantalla la suma de los primeros 20 números múltiplos de 6.*/
public class Clase_08Mar2021_Numero20Multiplos6 
{
    public static void main(String[] args)
    {
        int numero = 0;
        for (int f = 6; f <= 120 ; f+=6)
        {
            System.out.println(f);
            numero = numero + f;
        }
        System.out.println("La suma es:" + numero);
    }
}
