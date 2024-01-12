package Loops.assignment2;

import java.util.Scanner;

public class L49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int startNumber = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int endNumber = scanner.nextInt();

        System.out.println("Perfect numbers between " + startNumber + " and " + endNumber + ":");

        for (int number = startNumber; number <= endNumber; number++) {
            if (isPerfectNumber(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }

        return sum == number;
    }
}
