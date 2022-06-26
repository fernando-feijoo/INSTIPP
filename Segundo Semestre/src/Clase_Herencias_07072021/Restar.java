package Clase_Herencias_07072021;
public class Restar extends Sumar
{
    public void Op_Restar(double a, double b)
    {
        double c;
        c = (a - b);
        System.out.println("El resultado de la resta es: " + c);
    }
}
