package ActividadClase_09072021;
import java.util.Scanner;
public class Menu
{
    Scanner tc = new Scanner(System.in);
    String Nombre = "", Apellido = "";
    int Edad = 0, opcion;
    public void Op_Menu()
    {
        
        MenoresEdad Op_1 = new MenoresEdad();
        MediaEdad Op_2 = new MediaEdad();
        MayorEdad Op_3 = new MayorEdad();
        do
        {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++"
                             + "\n       |       Ingrese una opción       |       "
                             + "\n       |--------------------------------|       "
                             + "\n       |    1-17 años              [1]  |       "
                             + "\n       |   18-25 años              [2]  |       "
                             + "\n       |   26-40 años              [3]  |       "
                             + "\n       |   Salir                   [4]  |       "
                             + "\n       |--------------------------------|       "
                             + "\n++++++++++++++++++++++++++++++++++++++++++++++++\n");
            opcion = tc.nextInt();
            tc.nextLine();
            if(opcion >= 1 && opcion <= 3)
            {
                System.out.println("Ingrese el nombre: ");
                Nombre = tc.nextLine();
                System.out.println("Ingrese el apellido: ");
                Apellido = tc.nextLine();
                System.out.println("Ingrese la edad: ");
                Edad = tc.nextInt();
            }
            switch (opcion) 
            {
                case 1:
                    Op_1.Validacion1(Nombre, Apellido, Edad);
                    break;
                case 2:
                    Op_2.Validacion2(Nombre, Apellido, Edad);
                    break;
                case 3:
                    Op_3.Validacion3(Nombre, Apellido, Edad);
                    break;
                case 4:
                    System.out.println("\nGracias por usar nuestro sistema.\n");
                    break;
                default:
                    System.out.println("\nOpción incorrecta... \n");
            }
        }while(opcion != 4);
    }
    public void Datos(String N, String A, int E)
    {
        System.out.println("\nEl nombre es: " + N
                             + "\nEl Apellido es:  " + A
                             + "\nLa edad es: " + E);
    }
}