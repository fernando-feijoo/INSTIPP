package ClaseInstanciar_23062021;
public class Restar 
{
    public Restar(double a, double b)
    {
         CResta(a, b);
    }
    public void CResta (double a, double b)
    {
        System.out.println("\nEl resultado de la resta es " + RESTA(a, b));
    }
    double RESTA (double y,double z)
    {
        double x;
        x = y - z;
        return x;
    }
}
