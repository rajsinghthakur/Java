import java.util.Scanner;

class Seres1 {
    public void test(int n) {
        for (int i = -n; i <= n + 3; i += 3) {
            System.out.print(i + " ");
        }
    }
}

public class Method16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        Seres1 r = new Seres1();
        r.test(n);
    }
}
