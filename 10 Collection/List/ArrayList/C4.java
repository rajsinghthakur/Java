/*wap to define an array of integer and assign value in program
and print sum of all values  */

import java.util.ArrayList;
import java.util.Scanner;

public class C4 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>(n);
            System.out.println("Enter values");
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int n1 = sc.nextInt();
                al.add(n1);
            }
            for (Integer in : al) {
                sum = sum + in;
            }
            System.out.println("Sum : " + sum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
