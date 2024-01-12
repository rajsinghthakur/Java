package Loops.assignment2;

import java.util.Scanner;

public class L50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int startNumber = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int endNumber = scanner.nextInt();

        System.out.println("Palindrome numbers between " + startNumber + " and " + endNumber + ":");

        for (int number = startNumber; number <= endNumber; number++) {
            if (isPalindrome(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
