package PV_MVC220622;
import Controlador.Controlador_Login;
import Vista.Vista_Login;
public class Main 
{

    public static void main(String[] args) 
    {
        Vista_Login login = new Vista_Login();
        Controlador_Login controlLogin = new Controlador_Login(login);
        login.show(true);
        login.txf_usuario.setText("Fernando Feijoo"); 
        login.txf_contrasena.setText("123f");
    }
}
