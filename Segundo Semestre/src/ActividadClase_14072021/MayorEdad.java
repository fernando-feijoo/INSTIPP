package ActividadClase_14072021;
public class MayorEdad extends Resultados
{
    public void Validacion3(String Nombre, String Apellido, int Edad)
    {
        if(Edad >= 26 && Edad <= 40)
        {
            Datos(Nombre, Apellido, Edad);
            System.out.println("\nLa persona corresponde al rango de edad seleccionada.");
        }else
        {
            Datos(Nombre, Apellido, Edad);
            System.out.println("\nLa persona NO corresponde al rango de edad seleccionada.");
        }
    }
}