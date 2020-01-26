import java.util.Scanner;

public class CityName{
     public static void main(String[]args){

         Scanner sc1 = new Scanner(System.in);
         System.out.println("Enter a alphabet from a to f : ");
         String ct;
         ct = sc1.nextLine();

         switch (ct) {
             case "a":
                 System.out.println("ABERDEEN");
                 break;
             case "b":
                 System.out.println("BELFAST");
                 break;
             case "c":
                 System.out.println("COVENTRY");
                 break;
             case "d":
                 System.out.println("DERBY");
                 break;
             case "e":
                 System.out.println("EUSTON");
                 break;
             case "f":
                 System.out.println("FULHAM");
                 break;
             default:
                 System.out.println("INVALID INPUT");
         }
     }
}