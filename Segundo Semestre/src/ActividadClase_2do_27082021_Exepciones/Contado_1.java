package ActividadClase_2do_27082021_Exepciones;
public class Contado_1 extends Menu
{
    
    public void contado()
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
        return Respuesta = valor * 1.12;
    }
}
