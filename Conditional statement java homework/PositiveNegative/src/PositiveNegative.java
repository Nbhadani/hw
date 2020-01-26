import java.util.Scanner;
public class PositiveNegative {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int num = sc1.nextInt();

        if (num >0){
            System.out.println(num + " is a positive number");
        }

        else if(num <0){
            System.out.println(num + " is a negative number");
        }

        else {
            System.out.println(num + " is ZERO");
        }
    }
}
