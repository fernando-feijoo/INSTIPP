package Deberes_TareaIntraclase;
/*2. Mostrar en pantalla los 10 primero números pares.*/
public class TareaSemana12_10NumPares 
{
    public static void main(String[] args)
    {
        for(int f = 0; f <= 20; f+=2)
        {
            if((f % 2) == 0 && f != 0)
            {
            System.out.println(f);
            }
        }
    }
}
