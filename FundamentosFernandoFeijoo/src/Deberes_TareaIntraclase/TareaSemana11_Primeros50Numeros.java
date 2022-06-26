package Deberes_TareaIntraclase;
/*Realizar un programa que muestre por pantalla los primeros 50 números pares.*/
public class TareaSemana11_Primeros50Numeros 
{
    public static void main(String[] args)
    {
        int contador = 0;
        int numero = 0;
        do
        {
            numero+=2;
            System.out.print(numero + ", ");
            contador++;
            if (contador % 10 == 0)
            {
                System.out.println("");
            }
        }while(contador != 50);
        System.out.println("");
    }
}
