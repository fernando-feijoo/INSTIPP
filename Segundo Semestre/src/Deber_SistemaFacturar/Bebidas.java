package Deber_SistemaFacturar;
import java.util.Scanner;
public class Bebidas 
{
    Scanner tc = new Scanner(System.in);
    String NombreProducto;
    int cantidad;
    double precio;
    public void Op_Bebidas()
    {
        System.out.println("\n1.- Ingrese el nombre de la bebida: ");
        NombreProducto = tc.nextLine();
        System.out.println("2.- Ingrese la cantidad del producto: ");
        cantidad = tc.nextInt();
        System.out.println("3.- Ingrese el precio unitario del producto: ");
        precio = tc.nextDouble();
        Resultado(NombreProducto, cantidad, precio);
    }
    public void Resultado(String N_P, int C, double P)
    {
        System.out.println("\nEl articulo vendido es: " + N_P
                          +"\nLa cantidad es: " + C
                          +"\n               __________________________"
                          +"\nEl valor a pagar es: $ " + Calculo(C, P));
    }
    double Calculo(int c, double p)
    {
        double Re_calculo;
        Re_calculo = (c * p);
        return Re_calculo;
    }
}