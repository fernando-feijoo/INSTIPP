package ActividadClase_2do_20082021;
import java.util.Scanner;
public class Menu 
{
    public void menu()
    {
        Scanner tc = new Scanner(System.in);
        int Op;
        double numero, Respuesta = 0;
        String User, Password;
        boolean ToF = true;
        String[][] Data = new String[3][2];
        String[] F = new String[]{"el Usuraio: ", "la Contraseña: "};
        for (int i = 0; i < Data.length; i++) 
        {
            System.out.println("\nUsuario #" + (i+1));
            for (int j = 0; j < Data[i].length; j++) 
            {
                System.out.print("  Ingrese " + F[j]);
                Data[i][j] = tc.nextLine();
                System.out.println("");
            }
        }
        do
        {
            System.out.println("\n=============================");
            System.out.println("|  Valide su información    |");
            System.out.println("=============================");
            System.out.print("\n   USUARIO: ");
            User =  tc.nextLine();
            System.out.println("");
            System.out.print("   CONTRASEÑA: ");
            Password = tc.nextLine();
            System.out.println("");
            for (int g = 0; g < Data.length; g++) 
            {
                for (int y = 0; y < Data[g].length - 1; y++) 
                {
                    if (Data[g][y].equalsIgnoreCase(User) && Data[g][y+1].equalsIgnoreCase(Password)) 
                    {
                        ToF = false;
                    }
                }
            }
            if (ToF == true) 
            {
                System.out.println("Usuario o contraseña incorrectos, ingrese nuevamente.");
            }
        }while(ToF);
        do
        {
            do 
            {
                System.out.println("__________________________");
                System.out.println("|  Ingrese una opcion    |");
                System.out.println("--------------------------");
                System.out.println("|  Raiz Cuadrada    [1]  |");
                System.out.println("|  Raiz Cubica      [2]  |");
                System.out.println("|  Logaritmo        [3]  |");
                System.out.println("|  Numero, Potencia [4]  |");
                System.out.println("|  Salir            [5]  |");
                System.out.println("--------------------------");
                Op = tc.nextInt();
                if (Op < 0 || Op > 5) 
                {
                    System.out.println("\nIngrese una opcion correcta. \n");
                }
            } while (Op < 0 || Op > 5);
            switch (Op) 
            {
                case 1:
                    System.out.println("\nIngrese un número: ");
                    numero = tc.nextDouble();
                    Respuesta = Math.sqrt(numero);
                    break;
                case 2:
                    System.out.println("Ingrese un número: ");
                    numero = tc.nextDouble();
                    Respuesta = Math.cbrt(numero);
                    break;
                case 3:
                    System.out.println("Ingrese un número: ");
                    numero = tc.nextDouble();
                    Respuesta = Math.log10(numero);
                    break;
                case 4:
                    System.out.println("Ingrese un número: ");
                    numero = tc.nextDouble();
                    Respuesta = Math.pow(numero, 3);
                    break;
                case 5:
                    System.out.println("\nGracias por usar nuestro sistema. :)\n");
                    break;
            }
            if (Op != 5) 
            {
                System.out.println("\n Su respuesta es: " + Respuesta);
            }
        }while(Op != 5);
    }
}