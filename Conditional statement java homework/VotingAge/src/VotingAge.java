import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc1.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to Vote");
        } else {
            System.out.println("You are NOT eligible to vote");
        }
    }
}


