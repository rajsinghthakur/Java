import java.util.Scanner;

class Squre {
    public void test(int n) {
        for (int i = 0; i < n * 2; i += 2) {
            System.out.print(i * i * i + " ");
        }
    }
}

public class Method26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        Squre obj = new Squre();
        obj.test(n);

    }
}
