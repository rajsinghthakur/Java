import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        int a, b, c, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number  : ");
        x = sc.nextInt();
        System.out.println("Enter the second number : ");
        b = sc.nextInt();
        System.out.println("Enter the third number  : ");
        c = sc.nextInt();
        a = x;
        if (a>b) {
            System.out.println(b);
        }
        else (a<b) {
            System.out.println(a);
        }
        if (a>c) {
            System.out.println(c);
        }
        else (a<c) {
            System.out.println(a);
        }
        if (b>c) {
            System.out.println(c);
        }
        else (b<c) {
            System.out.println(b);
        }
        // x = (a > b) ? b : a;
        // int min = (x < c) ? x : c;
        //System.out.println("smallest number is :" + a);
    }
}