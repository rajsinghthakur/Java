import java.util.Scanner;

class Test11 {
    public static void main(String[] args) {
        boolean a, b, c, d, e, f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of  X   : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of  y   : ");
        int y = sc.nextInt();
        a = x == y;
        b = x != y;
        c = x > y;
        d = x < y;
        e = x >= y;
        f = x <= y;
        System.out.println("x Equal y               : " + a);
        System.out.println("x NotEqual y            : " + b);
        System.out.println("x GreterThen y          : " + c);
        System.out.println("x SmallerThen y         : " + d);
        System.out.println("x GreterThen Equalto y  : " + e);
        System.out.println("x SmallerThen Equalto y : " + f);
    }
}