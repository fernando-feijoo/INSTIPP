package PV_MVC220622;
import Controlador.Controlador_Login;
import Vista.Vista_Login;
public class Main_MVC 
{

    public static void main(String[] args) 
    {
        Vista_Login login = new Vista_Login();
        Controlador_Login controlLogin = new Controlador_Login(login);
        login.show(true);
    }
}
