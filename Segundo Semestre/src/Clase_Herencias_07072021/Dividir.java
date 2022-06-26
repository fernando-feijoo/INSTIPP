package Clase_Herencias_07072021;
public class Dividir extends Multiplicar
{
    public void Op_Dividir(double a, double b)
    {
        double c;
        c = (a / b);
        System.out.println("El resultado de la division es: " + c);
    }
}
