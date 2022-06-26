package ActividadClase_2do_25082021_exeption;
public class Division 
{
    private double numero1;
    private double numero2;
    private double respuesta;
    
    public double getRespuesta()
    {
        respuesta = numero1 / numero2;
        return respuesta;
    }
    
    public void setNumero1(double numero1) 
    {
        this.numero1 = numero1;
    }
    
    public void setNumero2(double numero2) 
    {
        this.numero2 = numero2;
    }
}