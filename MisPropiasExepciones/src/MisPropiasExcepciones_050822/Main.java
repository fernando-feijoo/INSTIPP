package MisPropiasExcepciones_050822;
public class Main 
{
    public static void main(String[] args) 
    {
        try 
        {
            throw new MiExcepcion();
        } catch (MiExcepcion e) 
        {
            e.printStackTrace();
        }
    }
}