package EjerciciosEnClase;
import java.util.Scanner;
public class Examen_1Programa 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        Byte Op_respuesta = 0;
        int Op_numeros = 0, respuesta = 0;
        int paresImpares [] = new int[1];
        do
        {
            System.out.println("\n**********| MENU |**********");
            System.out.println("**                        **");
            System.out.println("**  Suma de números [1]   **");
            System.out.println("**  Pares e impares [2]   **");
            System.out.println("**  Salir           [3]   **");
            System.out.println("**                        **");
            System.out.println("****************************");
            System.out.print("\nSeleccione una opción: ");
            Op_respuesta = tc.nextByte();
            switch (Op_respuesta) 
            {
                case 1:
                    System.out.println("Ingrese la cantidad de numeros que va a sumar: ");
                    Op_numeros = tc.nextInt();
                    if(Op_numeros != 0 && Op_numeros > 0)
                    {
                        respuesta = Examen_1Suma.sumaNumeros(Op_numeros);
                        System.out.println("La suma total es: " + respuesta);
                    }else
                    {
                        System.out.println("\nIngrese un numero mayor a 0...");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de numeros que va a ingresar: ");
                    Op_numeros = tc.nextInt();
                    if(Op_numeros != 0 && Op_numeros > 0)
                    {
                    paresImpares = Examen_1ParesImpares.paresImpares(Op_numeros);
                    System.out.println("\nLa cantidad de números pares es: " + paresImpares[0]);
                    System.out.println("La cantidad de números impares es: " + paresImpares[1]);
                    } else
                    {
                        System.out.println("\nIngrese un numero mayor a 0...");
                    }
                    break;
                case 3:
                    System.out.println("\nGracias por usar nuestro sistema, hasta luego...");
                    break;
                default:
                    System.out.println("\nIngrese una opcion correcta...\n");
            }
        }while(Op_respuesta != 3);
    }
}
