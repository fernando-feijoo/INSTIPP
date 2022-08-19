package Personal;

import java.io.File;
import java.util.*;

public class LecturaNombreArchivos 
{
    
    public static void main(String[] args) {
        String dirPath = "D:\\User\\Music\\Nivel Medio - Todos los episodios\\";
        File dir = new File(dirPath);
        String[] files = dir.list();
        if (files.length == 0) {
            System.out.println("The directory is empty");
        } else {
            System.out.println(missing(subString(files)));
        }
    }
    
   public static int[] subString(String[] datos) {
        int[] subStringNumber =  new int[datos.length];
        for (int i = 0; i < datos.length; i++) {
            if (datos[i].substring(10, 11).equals("-")){
                subStringNumber[i] = Integer.parseInt(datos[i].substring(8, 10));
            }else{
                subStringNumber[i] = Integer.parseInt(datos[i].substring(8, 11));
            }
        }
        return subStringNumber;
    }
   
    public static Set<Integer> missing(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= arr.length; i++) {
            set.add(i);
        }
        for (int a : arr) {
            set.remove(a);
        }
        return set;
    }
}
