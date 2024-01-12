package Loops.assignment2;

import java.util.Scanner;

public class L52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int startNumber = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int endNumber = scanner.nextInt();

        System.out.println("Armstrong numbers between " + startNumber + " and " + endNumber + ":");

        for (int number = startNumber; number <= endNumber; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, getNumberOfDigits(originalNumber));
            number /= 10;
        }

        return originalNumber == sum;
    }

    public static int getNumberOfDigits(int number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
