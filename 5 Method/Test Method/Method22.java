import java.util.Scanner;

class Qube22 {
    public void test(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i * i + " ");
        }
    }
}

public class Method22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        Qube22 r = new Qube22();
        r.test(n);
    }
}
