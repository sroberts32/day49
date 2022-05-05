package day49.loops.src;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to take a break?");
            String input = scanner.nextLine();
            if (input.equals("yes") || input.equals("y")) {
                break;
            }
        }
        scanner.close();
    }
}
