import java.sql.SQLOutput;
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your Roll No. : ");
        int rollno = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println(" Sub 1: ");
        int sub1 = sc3.nextInt();

        Scanner sc4 = new Scanner(System.in);
        System.out.println(" Sub 2: ");
        int sub2 = sc4.nextInt();

        Scanner sc5 = new Scanner(System.in);
        System.out.println(" Sub 3: ");
        int sub3 = sc5.nextInt();

        if (sub1>=35 && sub2>=35 && sub3>=35) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        }





    }

