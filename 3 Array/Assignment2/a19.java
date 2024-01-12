package Array.Assignment2;

import java.util.Scanner;

public class a19 {

    public static void main(String[] args) {
        String s1[]=new String[6];
        int x[]=new int[5];
    
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            s1[i] = sc.next();
            x[i] = sc.nextInt();
            
        }
            for (int i = 0; i < 3; i++) {
        System.out.printf("%-14s %03d \n", s1, x);
            }
        System.out.println("================================");

    }
}
