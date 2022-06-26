package ActividadClase_06082021;
public class Tridimension 
{
    public void datos()
    {
        String[][][] Op = new String[3][3][3];
        Op[0][0][0] = "Juan";                   
        Op[0][1][0] = "Pepe";
        Op[0][2][0] = "Luis";
        Op[1][0][0] = "Pablo";
        Op[1][1][0] = "Maria";
        Op[1][2][0] = "Robert";
        Op[2][0][0] = "Cody";
        Op[2][1][0] = "Dicxon";
        Op[2][2][0] = "Angie";
        
        Op[0][0][1] = "Juan 2";
        Op[0][1][1] = "Pepe 2";
        Op[0][2][1] = "Luis 2";
        Op[1][0][1] = "Pablo 2";
        Op[1][1][1] = "Maria 2";
        Op[1][2][1] = "Robert 2";
        Op[2][0][1] = "Cody 2";
        Op[2][1][1] = "Dicxon 2";
        Op[2][2][1] = "Angie 2";
        
        Op[0][0][2] = "Juan 3";
        Op[0][1][2] = "Pepe 3";
        Op[0][2][2] = "Luis 3";
        Op[1][0][2] = "Pablo 3";
        Op[1][1][2] = "Maria 3";
        Op[1][2][2] = "Robert 3";
        Op[2][0][2] = "Cody 3";
        Op[2][1][2] = "Dicxon 3";
        Op[2][2][2] = "Angie 3";
        
        System.out.println(Op[1][1][1]);
    }
}
