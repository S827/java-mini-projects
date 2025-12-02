package TemperatureConverter;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Conversion:");
        System.out.println("1 for Celsius -> Fahrenheit");
        System.out.println("2 for Fahrenheit -> Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        double converted_temp;
        if (choice == 1) {
            converted_temp = (temperature * 9 / 5) + 32;
            System.out.println(temperature + "°C = " + converted_temp + "°F");
        } else if (choice == 2) {
            converted_temp = (temperature - 32) * 5 / 9;
            System.out.println(temperature + "°F = " + converted_temp + "°C");
        } else {
            System.out.println("Invalid choice!");
        }
        
    }
}
