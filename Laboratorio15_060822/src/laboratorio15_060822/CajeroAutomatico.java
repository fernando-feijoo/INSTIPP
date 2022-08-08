package laboratorio15_060822;
public class CajeroAutomatico 
{
    private double saldo;
    public double depositar(double cantidad) throws ValorException
    {
        if (cantidad <= 0) 
        {
            throw new ValorException();
        }
        saldo += cantidad;
        return saldo;
    }
    public double retirar(double cantidad) throws FondosException, ValorException
    {
        if (cantidad > saldo) 
        {
            throw new FondosException();
        } else if (cantidad <= 0)
        {
            throw new ValorException();
        }
        saldo -= cantidad;
        return saldo;
    }
}