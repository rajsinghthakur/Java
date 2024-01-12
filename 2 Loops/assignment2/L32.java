package Loops.assignment2;

import java.util.Scanner;

public class L32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        char n = sc.next().charAt(0);

        for (char a = 'A'; a <= n; a++) {
            System.out.print(a + " ");
        }

    }
}
