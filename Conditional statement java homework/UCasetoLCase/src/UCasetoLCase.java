import java.util.Scanner;

public class UCasetoLCase {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter any alphabet in Uppercase only : ");
        char ch = sc1.next().charAt(0);

        char lcase = Character.toLowerCase(ch);
        System.out.println(lcase);

    }
}
