import java.util.Scanner;

class Seres2 {
    public void test(int n) {
        int a = 0, sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + a;
            System.out.print(sum + " ");
            a++;
        }
    }
}

public class Method17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        Seres2 r = new Seres2();
        r.test(n);
    }
}
