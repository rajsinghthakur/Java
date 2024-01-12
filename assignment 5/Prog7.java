import java.util.Scanner;

class Prog7 {
    public static void main(String[] args) {
        int a, b, c, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number  : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();
        System.out.print("Enter the third number  : ");
        c = sc.nextInt();
        x = (a < b) ? b : a;
        int max = (x > c) ? x : c;
        System.out.println("smallest number is :" + max);
    }
}