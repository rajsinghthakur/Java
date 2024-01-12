package Loops.assignment2;

import java.util.Scanner;

public class L61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting year: ");
        int s = sc.nextInt();
        System.out.print("Enter the ending year: ");
        int e = sc.nextInt();
        System.out.println("Leap years between " + s + " and " + e + ":");
        for (int i = s; i <= e; i++) {
            if (isLeapYear(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
