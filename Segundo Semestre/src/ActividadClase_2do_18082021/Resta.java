package ActividadClase_2do_18082021;
public class Resta 
{
    private double numero1;
    private double numero2;
    private double numero3;
    private double numero4;
    private double respuesta;
    
    public double getRespuesta()
    {
        respuesta = numero1 - numero2 - numero3 - numero4;
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
    
    public void setNumero3(double numero3) 
    {
        this.numero3 = numero3;
    }
    
    public void setNumero4(double numero4) 
    {
        this.numero4 = numero4;
    }
}