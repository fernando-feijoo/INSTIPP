package Practicas_Personales;
import java.util.Scanner;
public class InteresDeCredito 
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int amount = scanner.nextInt();
//your code goes here
 for(int i=0;i<6;i++){
     int payment =(int)(10*amount)/100;
     if((amount%10)!=0){
         amount = amount-1;
     }
     amount = amount- payment;
    
     }
     System.out.println(amount);
     }
}
