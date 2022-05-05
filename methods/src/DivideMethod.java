package day49.methods.src;

import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int arg1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int arg2 = Integer.valueOf(scanner.nextLine());

        double answer = divide(arg1, arg2);

        System.out.println(arg1 + " / " + arg2 + " = " + answer);
    }

    public static double divide(int num1, int num2) {
        return (num1 / num2);
    }

}