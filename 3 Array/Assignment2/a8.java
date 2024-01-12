/*Java Program to Increment All Element of an Array by One */
package Array.Assignment2;

import java.util.Scanner;

public class a8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array : ");

        int a[] = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Output : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
            System.out.print(a[i] + " ");
        }
    }

}
