package Loops.assignment2;

import java.util.Scanner;

public class L48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int startNumber = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int endNumber = scanner.nextInt();

        System.out.println("Factors of numbers between " + startNumber + " and " + endNumber + ":");

        for (int number = startNumber; number <= endNumber; number++) {
            System.out.print("Factors of " + number + ": ");
            printFactors(number);
            System.out.println();
        }
    }

    public static void printFactors(int number) {
        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                System.out.print(divisor + " ");
            }
        }
    }
}
