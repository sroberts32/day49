package day49.methods.src;
import java.util.Scanner;

public class App {
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
