import java.sql.SQLOutput;
import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your Sales ID : ");
        String id = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your Seller's name : ");
        String name = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter your Sales Amount : ");
        int amt = sc3.nextInt();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter your Basic Salary : ");
        int bsal = sc4.nextInt();

        System.out.println(" " );

        int commission=0;

        if (amt >= 50000){
            commission = ((amt/100)*35);
            System.out.println("Commission is : " + commission);
        }

        else if (amt >= 30000 && amt < 49999){
            commission = ((amt/100)*20);
            System.out.println("Commission is : " + commission);
        }

        else if (amt >= 20000 && amt < 29999){
            commission = ((amt/100)*10);
            System.out.println("Commission is : " + commission);
        }

        else if (amt >= 10000 && amt < 19999){
            commission = ((amt/100)*5);
            System.out.println("Commission is : " + commission);
        }

        else if (amt >= 20000 && amt < 29999){
            commission = ((amt/100)*10);
            System.out.println("Commission is : " + commission);
        }

        else if (amt < 10000){
            commission = ((amt/100)*2);
            System.out.println("Commission is : " + commission);
        }

        }
    }