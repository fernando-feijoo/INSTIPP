package ClaseInstanciar_23062021;
public class Sumar 
{
    public Sumar(double a, double b)
    {
        CSuma(a, b);
    }
    public void CSuma(double a, double b)
    {
        System.out.println("\nEl resultado de la suma es " + SUMA(a, b));
    }
    double SUMA (double y, double z)
    {
        double x;
        x = y + z;
        return x;
    }
}
