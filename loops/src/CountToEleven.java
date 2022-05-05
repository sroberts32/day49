package day49.loops.src;
import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11:");
        int num = Integer.valueOf(scanner.nextLine());
        while (num < 12) {
            System.out.println(num);
            num++;
        }
        scanner.close();
    }
}
