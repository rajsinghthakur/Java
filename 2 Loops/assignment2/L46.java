package Loops.assignment2;

import java.util.Scanner;

public class L46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfFirstAndLastDigit(number);

        System.out.println("Sum of the first and last digits: " + sum);
    }

    public static int calculateSumOfFirstAndLastDigit(int number) {
        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }

        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}
