package ProgramacionVisual;
import java.util.ArrayList;
import java.util.Scanner;
public class ListaNumeros 
{
    ArrayList<Double> lisNumeros;
    public static void main(String[] args) 
    {
        ListaNumeros miLista = new ListaNumeros();
        miLista.lisNumeros = new ArrayList();
        miLista.leerMenu();
    }
    public void leerMenu()
    {
        Scanner tc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\nLista de números");
            System.out.println("[1] Agregar");
            System.out.println("[2] Mostrar");
            System.out.println("[3] Sair");
            System.out.println("Ingrese una opción:");
            opcion = tc.nextInt();
            switch (opcion) {
                case 1:
                    ingresarValor();
                    break;
                case 2:
                    mostrarLista();
                    break;
                case 3:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion != 3);
    }
    public void ingresarValor()
    {
        Scanner tc = new Scanner(System.in);
        double valor;
        System.out.println("Ingrese el valor: ");
        valor = tc.nextDouble();
        lisNumeros.add(valor);
    }
    public void mostrarLista()
    {
        if (!lisNumeros.isEmpty()) 
        {
            System.out.println("Elementos de la lista: ");
            for (int i = 0; i < lisNumeros.size(); i++) 
            {
                System.out.println(lisNumeros.get(i));
            }
        }else
        {
            System.out.println("La lista está vacía.");
        }
    }
}
