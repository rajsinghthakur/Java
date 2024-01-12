/*wap to define an array of integer of size 6.
Take input from user and display it in reverse  order  */

import java.util.*;

public class C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>(6);

        System.out.println("Enter values");
        for (int i = 0; i < 6; i++) {
            int s = sc.nextInt();
            al.add(s);
        }
        System.out.print("result : ");
        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.print(al.get(i) + " ");
        }
    }
}
