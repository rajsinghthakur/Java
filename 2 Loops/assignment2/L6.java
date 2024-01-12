
package Loops.assignment2;

import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the  number: ");
        int e = scanner.nextInt();

            System.out.print("Factors of " + e + ": ");
            printFactors(e);
            System.out.println();
        }

    public static void printFactors(int number) {
        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                System.out.print(divisor + " ");
            }
        }
    }
}
