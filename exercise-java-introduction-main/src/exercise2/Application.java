package exercise2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number "  + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }

        double average = sum / 3;
        System.out.println("Average = " + average);
    }
}