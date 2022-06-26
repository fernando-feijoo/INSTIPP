package ActividadClase_2do_27082021_Exepciones;
public class Contado extends Menu
{
    public void contado()
    {
        try
        {
            System.out.println("Ingrese el valor a cancelar: ");
            valor = tc.nextDouble();
            Respuesta = calculo(valor);
            System.out.println("\nEl descuento fue de: " + (valor*0.05));
            System.out.println("El valor a cancelar es: " + Respuesta);
        }catch(Exception e)
        {
            System.out.println("El error encontrado es: " + e);
        }
    }
    double calculo(double valor)
    {
        return Respuesta = valor * 0.95;
    }
    public void contado2()
    {
        try
        {
        System.out.println("Ingrese el valor a cancelar: ");
        valor = tc.nextDouble();
        Respuesta = calculo2(valor);
        System.out.println("\nEl descuento fue de: " + (valor*0.12));
        System.out.println("El valor a cancelar es: " + Respuesta);
        }catch(Exception e)
        {
            System.out.println("El error encontrado es: " + e);
        }
    }
    double calculo2(double valor)
    {
        return Respuesta = valor * 0.88;
    }
}
