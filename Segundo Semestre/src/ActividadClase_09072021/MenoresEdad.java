package ActividadClase_09072021;
public class MenoresEdad extends Menu
{
    public void Validacion1(String Nombre, String Apellido, int Edad)
    {
        if(Edad >= 1 && Edad <= 17)
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