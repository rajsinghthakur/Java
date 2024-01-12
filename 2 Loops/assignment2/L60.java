package Loops.assignment2;

import java.util.Scanner;

public class L60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int s, c;
        for (int i = 1; i <= n; i++) {
            int v = i;
            s = v * v;
            c = v * v * v;
            double r = Math.sqrt(v);
            System.out.println();
            System.out.println("Square of : " + s);
            System.out.println("Cube of : " + c);
            System.out.println("Square root of : " + r);
        }

    }
}
