
//Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.

import java.util.Scanner;

public class Prog29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st value : ");
        int a = sc.nextInt();

        System.out.print("enter 2nd value : ");
        int b = sc.nextInt();

        System.out.print("enter operator : ");
        char c = sc.next().charAt(0);

        if ((c == '+') || (c == '>') || (c == '=')) {
            if (c == '+')
                System.out.print("addition is : " + (a + b));
            else {
                if (c == '>') {
                    if (a > b)
                        System.out.print("greaterst is : " + (a));
                    else
                        System.out.print("greaterst is : " + (b));
                } else if (c == '=') {
                    if (a == b)
                        System.out.print("both are equal  : ");
                    else
                        System.out.print("both are not equal  : ");

                }
            }

        }
    }

}
