package day49.loops.src;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number. --0 ends the program");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num < 0) {
                System.out.println("Please enter positive numbers only.");
                continue;
            }
            System.out.println("You entered: " + num);
        }
        System.out.println("Program ended.");
        scanner.close();
    }
}
