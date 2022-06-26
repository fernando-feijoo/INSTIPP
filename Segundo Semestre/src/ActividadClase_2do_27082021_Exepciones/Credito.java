package ActividadClase_2do_27082021_Exepciones;
public class Credito extends Menu
{
    public void credito()
    {
        try
        {
        System.out.println("Ingrese el valor a cancelar: ");
        valor = tc.nextDouble();
        Respuesta = calculo(valor);
        System.out.println("\nEl recargo fue de: " + (valor*0.03));
        System.out.println("El valor a cancelar es: " + Respuesta);
        }catch(Exception e)
        {
            System.out.println("El error encontrado es: " + e);
        }
    }
    double calculo(double valor)
    {
        return Respuesta = valor * 1.03;
    }
    public void credito2()
    {
        try
        {
            System.out.println("Ingrese el valor a cancelar: ");
            valor = tc.nextDouble();
            Respuesta = calculo2(valor);
            System.out.println("\nEl descuento fue de: " + "No hay descuento :(");
            System.out.println("El valor a cancelar es: " + Respuesta);
        }catch(Exception e)
        {
            System.out.println("El error encontrado es: " + e);
        }
    }
    double calculo2(double valor)
    {
        return Respuesta = valor;
    }
}
