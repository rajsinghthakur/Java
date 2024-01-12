package Loops.assignment2;

import java.util.Scanner;

public class L57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int f = sc.nextInt();
        System.out.println("Enter second Number : ");
        int s = sc.nextInt();

        int start = f;
        int end = s;

        System.out.println("Prime numbers between " + start + " to " + end + ":");

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
