package Deber_SistemaFacturar;
public class Menu extends Electrodomesticos
{
    public Menu()
    {
        Op_Menu();
    }
    public void Op_Menu()
    {
        int opcion;
        double c, d;
        do
        {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++"
                             + "\n       |       Ingrese una opción       |       "
                             + "\n       |--------------------------------|       "
                             + "\n       |   Bebidas                 [1]  |       "
                             + "\n       |   Embutidos               [2]  |       "
                             + "\n       |   Vegetales               [3]  |       "
                             + "\n       |   Frutas                  [4]  |       "
                             + "\n       |   Electrodomesticos       [5]  |       "
                             + "\n       |   Salir                   [6]  |       "
                             + "\n       |--------------------------------|       "
                             + "\n++++++++++++++++++++++++++++++++++++++++++++++++\n");
            opcion = tc.nextInt();
            tc.nextLine();
            switch (opcion) 
            {
                case 1:
                    Op_Bebidas();
                    break;
                case 2:
                    Op_Embutidos();
                    break;
                case 3:
                    Op_Vegetales();
                    break;
                case 4:
                    Op_Frutas();
                    break;
                case 5:
                    Op_Electrodomesticos();
                    break;
                case 6:
                    System.out.println("\nGracias por usar nuestro sistema.\n");
                    break;
                default:
                    System.out.println("\nOpción incorrecta... \n");
            }
        }while(opcion != 6);
    }
}