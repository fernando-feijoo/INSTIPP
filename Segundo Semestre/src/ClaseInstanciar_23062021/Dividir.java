package ClaseInstanciar_23062021;
public class Dividir 
{
    public Dividir(double a, double b)
    {
        CDividir(a, b);
    }
    public void CDividir(double a, double b)
    {
        System.out.println("\nEl resultado de la division es " + DIVISION(a, b));
    }
    double DIVISION (double y, double z)
    {
        double x;
        x = y / z;
        return x;
    }
}
