import java.util.Scanner;

public class DayName{
    public static void main(String[]args){

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number from 1-7 : ");
        String ct;
        ct = sc1.nextLine();

        switch (ct) {
            case "1":
                System.out.println("MONDAY");
                break;
            case "2":
                System.out.println("TUESDAY");
                break;
            case "3":
                System.out.println("WEDNESDAY");
                break;
            case "4":
                System.out.println("THURSDAY");
                break;
            case "5":
                System.out.println("FRIDAY");
                break;
            case "6":
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("INVALID NUMBER");
        }
    }
}