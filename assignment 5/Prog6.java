import java.util.Scanner;

class Prog6 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number  : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();
        if (a > b)
            System.out.println("greater number is :" + a);
        else
            System.out.println("greater number is :" + b);

    }
}