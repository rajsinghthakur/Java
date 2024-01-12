import java.util.Scanner;

public class People5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age people 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter the age people 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter the age people 3 : ");
        int c = sc.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println("people 1 is : oldest");
        } else {
            if (b > a && b > c) {
                System.out.println("people 2 is : oldest");
            } else {
                if (c > a && c > b) {
                    System.out.println("people 3 is : oldest");
                }

            }
        }

        if ((a < b) && (a < c)) {
            System.out.println("people 1 is : youngest");
        } else {
            if (b < a && b < c) {
                System.out.println("people 2 is : youngest");
            } else {
                if (c < a && c < b) {
                    System.out.println("people 3 is : youngest");
                }

            }
        }

    }
}
