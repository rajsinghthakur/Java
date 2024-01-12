package Loops.assignment2;

import java.util.Scanner;

public class L47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int s = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int e = sc.nextInt();

        for (int i = s; i <= e; i++) {
            int n = i;
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * n + " ");
            }
            System.out.println();
        }
    }
}
