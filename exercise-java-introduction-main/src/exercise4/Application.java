package exercise4;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number "  + ": ");
        int number = scanner.nextInt();
        System.out.println(toFahrenheit(number));



    }
    public static double toFahrenheit(int celsius) {
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        return fahrenheit;
    }
}
