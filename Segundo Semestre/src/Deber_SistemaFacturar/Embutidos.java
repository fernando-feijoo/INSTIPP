package Deber_SistemaFacturar;
public class Embutidos extends Bebidas 
{
    public void Op_Embutidos()
    {
        System.out.println("\n1.- Ingrese el nombre del embutido: ");
        NombreProducto = tc.nextLine();
        System.out.println("2.- Ingrese la cantidad del producto: ");
        cantidad = tc.nextInt();
        System.out.println("3.- Ingrese el precio unitario del producto: ");
        precio = tc.nextDouble();
        Resultado(NombreProducto, cantidad, precio);
    }
}