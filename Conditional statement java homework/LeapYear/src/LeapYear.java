// WAP to check leap year
// Used if else

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        int year; // Take a Integer Variable year
        Scanner s = new Scanner(System.in);

        System.out.print( " Enter the Year : ");
        year = s.nextInt(); // Assign a value tp the variable year

        if ((year%4 == 0) && (year%100!=0)) // Check if the year is divisible by 4 but not by 100
        {
            System.out.println(" This is a Leap Year");
        }
        else if ((year%100 ==0) && (year%400 == 0)) // Check if the year is divisible by 100 and 400
        {
            System.out.println(" This is a Leap Year");
        }
        else if (year%400 == 0) // Check if the year id divisible by 400
        {
            System.out.println("This is a Leap Year");
        }
        else
        {
      System.out.println("This is NOT a Leap Year"); // If none of above condition is satisfied
        }
    }
}


