package Deberes_TareaIntraclase;
//Realizar funciones para, agregar, buscar, listar, y eliminar; elementos de un array bidimensional.
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TareaSemana16_FuncionesArray 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int puntero = 0, Op_principal, Pt_busqueda, validacion, resultado, Op_eliminar;
        String opcion, busqueda;
        //---------------------------------------
        String[][] bdDatos = new String [50][8];
        bdDatos = TareaSemana16_FuncionesArray_Datos.cargarDatosDatos();
        //---------------------------------------
        do
        {
            System.out.println("\n===================| MENU OPCIONES |=======================");
            System.out.println("|                                                         |");
            System.out.println("|           Para agregar datos  [1]                       |");
            System.out.println("|           Para buscar datos   [2]                       |");
            System.out.println("|           Para listar datos   [3]                       |");
            System.out.println("|           Para eliminar datos [4]                       |");
            System.out.println("|           Para salir          [5]                       |");
            System.out.println("|                                                         |");
            System.out.println("===========================================================");
            System.out.print("Ingrese su opción: ");
            Op_principal = tc.nextInt();
            tc.nextLine();
            switch (Op_principal) 
            {
                case 1: //              [[---| Agregar datos |---]]                    
                    bdDatos = TareaSemana16_FuncionesArray_Datos.nuevoIngreso(bdDatos);
                    break;
                case 2: //              [[---| Buscar datos |---]]
                    TareaSemana16_FuncionesArray_Datos.buscarDatos(bdDatos);
                    break;
                case 3: //              [[---| Imprimir datos |---]]
                    TareaSemana16_FuncionesArray_Datos.listarDatos(bdDatos);
                    break;
                case 4: //              ***********[[---| Eliminar datos |---]]***********
                    bdDatos = TareaSemana16_FuncionesArray_Datos.eliminarDatos(bdDatos);
                    break;
                case 5: //                   [[---| Salir |---]]
                    System.out.println("\nGracias por usar nustro programa. \nHasta luego...\n");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }while(Op_principal != 5);
    }
}
