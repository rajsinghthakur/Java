package Loops.assignment2;

import java.util.Scanner;

public class L43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = convertBinaryToDecimal(binary);

        System.out.println("Decimal representation: " + decimal);
    }

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);

            if (digit == '1') {
                decimal += Math.pow(2, power);
            }

            power++;
        }

        return decimal;
    }
}
