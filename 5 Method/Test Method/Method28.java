import java.util.Scanner;

class Hello {
    public void test(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0)
                System.out.print("Hello ");
            else
                System.out.print(i + " ");
        }

    }
}

public class Method28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        Hello obj = new Hello();
        obj.test(n);
    }
}
