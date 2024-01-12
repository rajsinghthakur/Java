import java.util.Scanner;

class Prog4 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        a = sc.nextInt();
        System.out.print("b : ");
        b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Swaping ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}