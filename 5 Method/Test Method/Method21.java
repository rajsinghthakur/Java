import java.util.Scanner;

class Squre21 {
    public void test(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}

public class Method21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        Squre21 r = new Squre21();
        r.test(n);
    }
}
