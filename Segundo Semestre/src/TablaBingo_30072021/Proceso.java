package TablaBingo_30072021;
import java.util.Scanner;
public class Proceso 
{
    int cuenta = 0;
    public void datos()
    {
        Scanner tc = new Scanner(System.in);
        Integer[][] columnas;
        int Op = 0;
        System.out.println("Numero de tablas de Bingo que desea:");
        int opcion = tc.nextInt();
        do
        {
        System.out.println("¿Hasta cuantos numeros desea la tabla?"
                         + "\n     [1] = 75  Números"
                         + "\n     [2] = 100 Números");
        Op = tc.nextInt();
        }while(Op < 1 || Op > 2);
        if (Op == 1) 
        {
            columnas = new Integer[][]{{1, 15}, {16, 30}, {31, 45}, {46, 60}, {61, 75}};
        } else
        {
            columnas = new Integer[][]{{1, 20}, {21, 40}, {41, 60}, {61, 80}, {81, 100}};
        }
        tc.nextLine();
        String[][] txt_num = new String[5][5];
        int z = 0, x = 0, o = 0;
        do
        {
            txt_num = orden(txt_num, z, x, columnas);
            tabla(txt_num);
            o++;
        }while(o != opcion);
    }
    String[][] orden(String[][]txt_num, int z, int x, Integer[][] columnas)
    {
        z = 0; x = 0;
        do
        {
            for (int c = 0; c < txt_num.length; c++) 
            {
                if (c == 0) 
                {
                    txt_num[c][z] = numRandom(columnas, z);
                }
                if (c == 1) 
                {
                    do
                    {
                        txt_num[c][z] = numRandom(columnas, z);
                    }while((Integer.parseInt(txt_num[c][z]) == Integer.parseInt(txt_num[c-1][z])));
                }
                if (c == 2) 
                {
                    do
                    {
                        txt_num[c][z] = numRandom(columnas, z);
                    }while (Integer.parseInt(txt_num[c][z]) == Integer.parseInt(txt_num[c-1][z]) || Integer.parseInt(txt_num[c][z]) == Integer.parseInt(txt_num[c-2][z]));
                }
                if (c == 3)
                {
                    do
                    {
                        txt_num[c][z] = numRandom(columnas, z);
                    }while (Integer.parseInt(txt_num[c][z]) == Integer.parseInt(txt_num[c-1][z]) || Integer.parseInt(txt_num[c][z]) == Integer.parseInt(txt_num[c-2][z])
                         || Integer.parseInt(txt_num[c][z]) == Integer.parseInt(txt_num[c-3][z]));
                }
                if (c == 4)
                {
                    do 
                    {
                        txt_num[c][z] = numRandom(columnas, z);
                    }while (Integer.parseInt(txt_num[c][z]) == Integer.parseInt(txt_num[c-1][z]) || Integer.parseInt(txt_num[c][z]) == Integer.parseInt(txt_num[c-2][z])
                         || Integer.parseInt(txt_num[c][z]) == Integer.parseInt(txt_num[c-3][z]) || Integer.parseInt(txt_num[c][z]) == Integer.parseInt(txt_num[c-4][z]));
                }
            }
        z++;
        x++;
        }while(x != 5);
        return txt_num;
    }
    public void tabla(String[][] txt_num)
    {
        cuenta++;
        System.out.println();
        System.out.println("\n________________________________"
                         + "\n|  DON FERNANDO F. FEIJOO # " + cuenta
                         + "\n--------------------------------"
                         + "\n|   B  |  I  |  N  |  G  |  O  |"
                         + "\n--------------------------------");
        for (int y = 0; y < txt_num.length; y++) 
        {
            System.out.print("| ");
            for (int w = 0; w < txt_num[y].length; w++)
            {
                if(y == 2 && w ==2)
                {
                    System.out.print("(-;-)|");
                }else
                {
                    String cadenaEspacios = "";
                    String f = txt_num[y][w];
                    int es = 5 - f.length();
                    for (int p = 1; p < es; p++)
                    {
                        cadenaEspacios += " ";
                    }
                    System.out.print(" " + txt_num[y][w] + cadenaEspacios+ "|") ;
                    if (((w+1) % 5) == 0)
                    {
                        System.out.println("");
                    }
                }
            }
        }
        System.out.println("--------------------------------");
    }
    String numRandom(Integer[][] columnas, int z)
    {
        int col = (int)(Math.random() * (columnas[z][1] - columnas[z][0] + 1 ) + columnas[z][0]);
        return Integer.toString(col);
    }
}