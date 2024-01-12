import java.util.Scanner;

class Fibonacci {
    public void test(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i <= n - 2; i++) {
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}

public class Method8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        Fibonacci obj = new Fibonacci();
        obj.test(n);
    }

}