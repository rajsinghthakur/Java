package Loops.assignment2;

import java.util.Scanner;

public class L44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = interchangeFirstAndLastDigit(number);

        System.out.println("Number with first and last digits interchanged: " + result);
    }

    public static int interchangeFirstAndLastDigit(int number) {
        int lastDigit = number % 10;

        int temp = number;
        int numberOfDigits = 0;

        while (temp != 0) {
            numberOfDigits++;
            temp /= 10;
        }

        int firstDigit = number / (int) Math.pow(10, numberOfDigits - 1);
        int withoutFirstAndLastDigit = number % (int) Math.pow(10, numberOfDigits - 1) / 10;

        int result = lastDigit * (int) Math.pow(10, numberOfDigits - 1) + withoutFirstAndLastDigit * 10 + firstDigit;

        return result;
    }
}
