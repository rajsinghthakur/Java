import java.util.Scanner;

class Prog8 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number  : ");
        a = sc.nextInt();
        if (a > 0)
            System.out.print("even : ");
        else
            System.out.print("odd : ");
    }
}