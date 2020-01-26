import java.util.Scanner;

public class NumAlphaSym {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Value : ");
        char char1 = scanner.next().charAt(0);

        if ((char1 >= 48 && char1 <= 57) || char1 == 45) {
            System.out.print("Value is a number");

        } else if ((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
            System.out.print("Value is a Alphabet");
        } else {
            System.out.print("Value is a Symbol");

        }
    }
}