package Deberes_TareaIntraclase;
/*3)Elabora una aplicación que permita ingresar un color (texto) y determinar si el 
color pertenece a los colores de la bandera del Ecuador, para lo cual debe presentar un 
mensaje "Color de la bandera del Ecuador"; en caso de no sea un color de la bandera, 
presenta el mensaje "Color no pertenece a la Bandera del Ecuador".*/
import java.util.Scanner;
public class TareaSemana13_3_ColoresBandera 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        String color;
        System.out.print("Ingrese un color: ");
        color = tc.nextLine();
        if("Amarillo".equalsIgnoreCase(color) || "Azul".equalsIgnoreCase(color) || "Rojo".equalsIgnoreCase(color))
        {
            System.out.println("\nColor de la bandera del Ecuador");
        }else
        {
            System.out.println("\nColor no pertenece a la Bandera del Ecuador");
        }
    }
}
