package Array.Assignment1;

/*wap to ask 5 names from user and check if particular name exists in array or not . */

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        System.out.println("Enter five no.");
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search : ");
        int s = sc.nextInt();
        boolean e = false;
        for (int i = 0; i < 5; i++) {
            if (s == n[i]) {
                e = true;
            }
        }

        if (e)
            System.out.println(s + " exists in the array.");
        else
            System.out.println(s + " does not exist in the array.");

    }
}