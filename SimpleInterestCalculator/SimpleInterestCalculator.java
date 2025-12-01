package SimpleInterestCalculator;
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter tenure: ");
        int tenure = sc.nextInt();
        double si;
        si = principal * rate * tenure / 100;
        System.out.println("Simple Interest is: " + si);
    }    
}
