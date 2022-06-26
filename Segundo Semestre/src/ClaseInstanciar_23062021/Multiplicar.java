package ClaseInstanciar_23062021;
public class Multiplicar 
{
    public Multiplicar(double a, double b)
    {
        CMultiplicacion(a, b);
    }
    public void CMultiplicacion(double a, double b)
    {
        System.out.println("\nEl resultado de la multiplicacion es " + MULTIPLICACION(a, b));
    }
    double MULTIPLICACION(double y, double z)
    {
        double x;
        x = y * z;
        return x;
    }
}
