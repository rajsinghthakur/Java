package Loops.assignment2;

import java.util.Scanner;

public class L58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = convertToBinary(decimal);

        System.out.println("Binary representation: " + binary);
    }

    public static String convertToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binaryBuilder = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryBuilder.insert(0, remainder);
            decimal /= 2;
        }

        return binaryBuilder.toString();
    }
}
