package Loops.assignment2;

import java.util.Scanner;

public class L56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int f = sc.nextInt();
        System.out.println("Enter second Number : ");
        int s = sc.nextInt();
        for (int i = f; i <= s; i++) {
            int number = i;
            sc.close();

            long factorial = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;

    }
}