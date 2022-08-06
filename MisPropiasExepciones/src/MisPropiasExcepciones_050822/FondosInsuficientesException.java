package MisPropiasExcepciones_050822;
public class FondosInsuficientesException extends Exception
{
    public FondosInsuficientesException(double valorFaltante) 
    {
        super("Fondos insuficientes, le faltan " + valorFaltante);
    }
}