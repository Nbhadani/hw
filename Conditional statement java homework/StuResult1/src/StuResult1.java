import java.sql.SQLOutput;
import java.util.Scanner;

public class StuResult1 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your Roll No. : ");
        int rollno = sc2.nextInt();

        int marks[] = new int[3];
        int i;
        float total = 0, avg = 0;
        Scanner sc3 = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            System.out.println("Enter Marks of Subject " + (i + 1) + ":");
            marks[i] = sc3.nextInt();
            total = total + marks[i];
            //percentage = (total / (3 * 100)) * 100;
        }

        avg = total/3;
        if(avg>=35){
            System.out.println("Result is PASS");
        }
        else {
            System.out.println("Result is FAIL");
        }

    }
}
