package ClassWork;

import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenhite : ");
        float a = sc.nextFloat();
        float sum = ((a - 32) / 1.8f);
        System.out.println("celcius is : " + sum);
    }
}