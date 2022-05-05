package day49.loops.src;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Guess a number. Guess the right number and win nothing.");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 5) {
                break;
            }
        }
        System.out.println("Cheater");
        scanner.close();
    }

}
