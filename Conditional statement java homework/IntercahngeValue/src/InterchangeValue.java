import java.util.Scanner;

public class InterchangeValue {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your First Number : ");
        int num1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your Second Number : ");
        int num2 = sc2.nextInt();


        int temp =num1;

        num1 = num2;

        num2 = temp;

        System.out.println("First Number =" + num1);
        System.out.println("Second Number =" + num2);

    }


}
