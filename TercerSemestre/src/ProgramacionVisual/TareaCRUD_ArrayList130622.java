package ProgramacionVisual;
import java.util.ArrayList;
import java.util.Scanner;
public class TareaCRUD_ArrayList130622 
{
    ArrayList<Double> lisNumeros;
    Scanner teclado = new Scanner(System.in);
    double valor, nuevoValor;
    int contador;
    public static void main(String[] args) 
    {
        TareaCRUD_ArrayList130622 miLista = new TareaCRUD_ArrayList130622();
        miLista.lisNumeros = new ArrayList();
        miLista.leerMenu();
    }
    public void leerMenu() 
    {
        int opcion = 0;        
        do 
        {
            do
            {
                System.out.println("\nLista de números");
                System.out.println("[1] Agregar");
                System.out.println("[2] Mostrar");            
                System.out.println("[3] Modificar");            
                System.out.println("[4] Elminar");            
                System.out.println("[5] Salir");
                System.out.println("Ingrese una opción: ");
                opcion = teclado.nextInt();
                    if (opcion > 5 || opcion < 0) 
                    {
                        System.out.println("\n ¡¡Ingrese una opción correcta!!");
                    }
            }while(opcion > 5 || opcion < 0);
            switch(opcion) 
            {
                case 1: ingresarValor();
                        break;                        
                case 2: mostrarLista();
                        break;
                case 3:
                        modificarValor();
                        break;
                case 4:
                        eliminarValor();
                        break;
                case 5:
                        System.out.println("\nGracias por usar el programa. :)");
                        break;                    
            }             
        } while( opcion != 5);
    }
    public void ingresarValor() 
    {
        System.out.println("Ingrese el valor: ");
        valor = teclado.nextDouble();
        lisNumeros.add(valor);
    }
    public void mostrarLista() 
    {
        if (!lisNumeros.isEmpty()) 
        {
            System.out.println("Elementos de la lista: ");
            for ( int i = 0 ; i < lisNumeros.size() ; i++ ) 
            {
                System.out.println("[" + lisNumeros.get(i) + "]");
            }
        } 
        else 
        {
            System.out.println("\nLa lista está vacía.");
        }
    }
    public void modificarValor()
    {
        contador = 0;
        System.out.println("Ingrese el valor que desea modificar: ");
        valor = teclado.nextDouble();
        for (int i = 0 ; i < lisNumeros.size() ; i++) 
        {
            if (valor == lisNumeros.get(i)) 
            {
                System.out.println("Ingrese el valor nuevo: ");
                nuevoValor = teclado.nextDouble();
                lisNumeros.set(i, nuevoValor);
                System.out.println("\nValor modificado.");
                contador++;
                break;
            }
        }
        if (contador == 0)
        {
            System.out.println("\nEl valor no se encuentra.");
        }
    }
    public void eliminarValor()
    {
        contador = 0;
        System.out.println("Ingrese el valor que desea elminar: ");
        valor = teclado.nextDouble();
        for (int i = 0 ; i < lisNumeros.size() ; i++) 
        {
            if (valor == lisNumeros.get(i)) 
            {
                lisNumeros.remove(i);
                System.out.println("\nDato eliminado.");
                contador++;
                break;
            }
        }
        if (contador == 0)
        {
            System.out.println("\nDato no se encuentra.");
        }
    }
}
