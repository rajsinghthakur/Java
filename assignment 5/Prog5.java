import java.util.Scanner;

class Prog5 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swaping ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}