package Loops.assignment2;

import java.util.Scanner;

public class L55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Number : ");
        int f = sc.nextInt();
        System.out.println("Enter end Number : ");
        int l = sc.nextInt();
        System.out.println(" odd no. between " + f + " to " + l);
        for (int i = f; i <= l; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}