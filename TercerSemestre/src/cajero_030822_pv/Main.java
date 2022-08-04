package cajero_030822_pv;

class Cuenta 
{

    private double saldo;

    public Cuenta() 
    {
        saldo = 0;
    }

    public void deposito(double cantidad) 
    {
        saldo += cantidad;
    }

    public double retirar(double cantidad) throws Exception 
    {
        if (cantidad > saldo) 
        {
            throw new Exception("Saldo insuficiente.");
        }
        saldo -= cantidad;
        return cantidad;
    }

}

public class Main 
{

    public static void main(String[] args) 
    {
        try 
        {
            Cuenta cuenta = new Cuenta();
            double deposito = 100;
            double retiro = 120;
            double saldoActual = deposito - retiro;
            cuenta.deposito(deposito);
            System.out.println("Saldo inicial: " + deposito);
            System.out.println("Retiro: " + cuenta.retirar(retiro));
            System.out.println("Saldo actual: " + saldoActual);
        } catch (Exception e) 
        {
            System.out.println("Error; " + e);
        }
    }
}
