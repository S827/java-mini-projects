package GreetingMachine;
import java.util.Scanner;
public class GreetingMachine {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // ask the user for name
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("hello, " + name + "! Welcom to Java.");
    }
}
