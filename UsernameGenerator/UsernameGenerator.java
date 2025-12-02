package UsernameGenerator;
import java.util.Scanner;

public class UsernameGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        char firstLetter = lastName.charAt(0);
        String username = firstName + firstLetter;
        System.out.println("Your username is: " + username);
    }
}
