package Loops.assignment2;

import java.util.Scanner;

public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n*2; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    }
}
