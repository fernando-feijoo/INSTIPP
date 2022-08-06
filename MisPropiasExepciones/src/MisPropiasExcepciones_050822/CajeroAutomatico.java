package MisPropiasExcepciones_050822;
public class CajeroAutomatico 
{
    private double saldo;
    public void depositar(double cantidad)
    {
        saldo += cantidad;
    }
    public double retirar(double cantidad) throws FondosInsuficientesException
    {
        if (cantidad > saldo) 
        {
            throw new FondosInsuficientesException(cantidad - saldo);
        }
        saldo -= cantidad;
        return cantidad;
    }
}