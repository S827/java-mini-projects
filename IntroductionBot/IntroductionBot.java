package IntroductionBot;
import java.util.Scanner;
public class IntroductionBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = sc.nextLine();
        System.out.println("What is your age? ");
        int age = sc.nextInt();
        System.out.println("Where do you live? ");
        sc.nextLine();
        String city = sc.nextLine();

        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You live in " + city + ".");
    }

}
