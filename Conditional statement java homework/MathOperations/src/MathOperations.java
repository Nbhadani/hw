import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        int a, b;
        String result;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a = sc1.nextInt();
        b = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Mathematicl Operation from +,-,/,* : ");
        result = sc2.nextLine();

        switch (result) {
            case "+":
                System.out.println("Result is " + (a + b));
                break;
            case "-":
                System.out.println("Result is " + (a - b));
                break;
            case "/":
                System.out.println("Result is " + (a / b));
                break;
            case "*":
                System.out.println("Result is " + (a * b));
                break;
        }
    }
}
