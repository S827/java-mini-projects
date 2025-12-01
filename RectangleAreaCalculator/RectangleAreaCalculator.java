package RectangleAreaCalculator;
import java.util.Scanner;
public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        double length = sc.nextDouble();
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("Area of rectangle is: " + area);
    }
}
