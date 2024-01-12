package Array.Assignment1;
/* wap to define an array of integer and assign value in program and print sum of all values*/

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        System.out.println(" enter number ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
       
        System.out.println("sum : " + sum);

    }
}
