package ClasePractica_25062021;

public class Ventas
{
    public void DatosVentas (int cantidad, double precio, String producto)
    {
        System.out.println("Nombre articulo: " + producto + "    |     Valor a pagar: $" + (cantidad * precio));
    }
}
