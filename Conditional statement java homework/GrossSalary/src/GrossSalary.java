import java.sql.SQLOutput;
import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your Employee ID : ");
        String empid = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter your Basic Salary : ");
        int bsal = sc3.nextInt();

        System.out.println(" " );

        int hra=0,ta=0,da=0,pf=0,gsal=0;

        hra = (bsal/100)*10;
        System.out.println("HRA Allowance : " + hra);

        da = (bsal/100)*8;
        System.out.println("Daily Allowance : " + da);

        ta = (bsal/100)*9;
        System.out.println("Travelling Allowance : " + ta);

        pf = (bsal/100)*20;
        System.out.println("Provident Fund : " + pf);

        System.out.println(" " );

        gsal = ( bsal+hra+ta+da-pf);
        System.out.println("Gross Salary : " + gsal);

    }
}

