import java.sql.SQLOutput;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {


        int marks[] = new int[5];
        int i;
        float avg = 0, total=0;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.println("Enter Number " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }


            avg = total/5;

            System.out.println( "AVERAGE is : " + avg  );



    }
}

