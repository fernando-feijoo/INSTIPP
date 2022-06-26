package ActividadClase_14072021;
public class MediaEdad extends Resultados
{
    public void Validacion2(String Nombre, String Apellido, int Edad)
    {
        if(Edad >= 18 && Edad <= 25)
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