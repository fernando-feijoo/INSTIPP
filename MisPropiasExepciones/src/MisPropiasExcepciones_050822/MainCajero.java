package MisPropiasExcepciones_050822;
public class MainCajero 
{
    public static void main(String[] args) 
    {
        try
        {
            CajeroAutomatico cajero = new CajeroAutomatico();
            int cantidad = 201;
            cajero.depositar(200);
            cajero.retirar(cantidad);
            System.out.println("Se retiraron: " + cantidad);
        }catch (FondosInsuficientesException fie)
        {
            System.out.println("No tienes fondos en tu cuenta.");
            fie.printStackTrace();
        }
    }
}
