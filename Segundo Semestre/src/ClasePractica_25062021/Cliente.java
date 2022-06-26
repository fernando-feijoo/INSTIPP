package ClasePractica_25062021;
public class Cliente 
{
    public void DatosCliente(String nombre, String apellido, int year)
    {
        System.out.println("Apellido: " + apellido + " Nombre: " + nombre + " Edad: " + year);
        int actual = 2021, calculo;
        calculo = (actual - year);
        if(calculo >= 18)
        {
            System.out.println("Ya es mayor de edad.");
        }else if(calculo < 18 && calculo > 0)
        {
            System.out.println("Es menor de edad.");
        }else
        {
            System.out.println("Ingresar valores correctos.");
        }
    }
}
