/* wap to print max and minimum value in given array  */

import java.util.ArrayList;
import java.util.Scanner;

public class C5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>(n);
        System.out.println("Enter values");
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            al.add(n1);
        }

        int min = al.get(0);
        int max = al.get(0);

        for (int num : al) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("minimum : " + min);
        System.out.println("maximum : " + max);
    }
}