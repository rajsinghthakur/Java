
package Loops.assignment2;

import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Table : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println((n * i) + " ");
        }
    }
}
