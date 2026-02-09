package exercise6;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age "  + ": ");
        int number = scanner.nextInt();
        if (number<18){
            System.out.println("Underage");
        } else if (number>=24) {
            System.out.println("adult");
        }
        else{
            System.out.println("teenager");
        }
    }
}
