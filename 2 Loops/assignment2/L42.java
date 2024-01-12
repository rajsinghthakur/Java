package Loops.assignment2;

import java.util.Scanner;

public class L42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    public static int calculateHCF(int num1, int num2) {
        // Ensure num1 is greater than num2
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        return num1;
    }
}
