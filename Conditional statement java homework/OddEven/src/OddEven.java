// Input any number and find out its odd or even using Turnery Operator ( ? : )


import java.util.Scanner; // Scanner Class gets the user input

public class OddEven {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); // Creates an instance of the Scanner and reads the input

        System.out.print("Input your first number: ");
        int num = reader.nextInt(); // Reads in a string of digits

        String OddEven = ( num % 2 == 0) ? "Even Number" : "Odd Number"; // Replaced if else with Turnery operator ( ? : )

        System.out.println( num + " is a " + OddEven);

            }

}