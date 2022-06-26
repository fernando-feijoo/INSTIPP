package ClasePractica_25062021;
/*Desarrollar un sistema que me permita enviar el nombre, apellido y el año de nacimiento a 
un método llamado cliente presentar el apellido, el nombre y la edad si la edad es mayor a 
18 presentar el mensaje "ya es mayor de edad". caso contrario "es menor de edad" 
Otro método llamado  ventas que reciba la cantidad y el precio de un articulo y 
presente el nombre del articulo y el valor a pagar.  todo esto enviado desde un menú de tres opciones con salir*/
import java.util.Scanner;
public class Menu 
{
    public void MenuOp()
    {
        Scanner tc = new Scanner(System.in);
        Cliente DatosCliente = new Cliente();
        Ventas DatosVentas = new Ventas();
        String nombre, apellido, producto;
        int year, opcion = 0, cantidad;
        double precio;
        do
        {
        System.out.println("++++++| MENU |++++++");
        System.out.println("    Cliente [1]");
        System.out.println("    Ventas  [2]");
        System.out.println("    Salir   [3]");
        opcion = tc.nextInt();
        tc.nextLine();
        switch (opcion) 
        {
            case 1:
                System.out.println("Ingrese el nombre: ");
                nombre = tc.nextLine();
                System.out.println("Ingrese el apellido: ");
                apellido = tc.nextLine();
                System.out.println("Ingrese el año de nacimiento: ");
                year = tc.nextInt();
                DatosCliente.DatosCliente(nombre, apellido, year);
                break;
            case 2:
                System.out.println("Ingrese el nombre del producto: ");
                producto = tc.nextLine();
                System.out.println("Ingrese la cantidad de articulos: ");
                cantidad = tc.nextInt();
                System.out.println("Ingrese el valor individual: ");
                precio = tc.nextDouble();
                DatosVentas.DatosVentas(cantidad, precio, producto);
                break;
            case 3:
                System.out.println("\nGracias por usar el sistema.\n");
                break;
            default:
                System.out.println("\nOpcion incorrecta ingrese una correcta.\n");
        }
        }while(opcion != 3);      
    }
}
