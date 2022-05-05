package day49.loops.src;
import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        scanner.close();
    }
}
