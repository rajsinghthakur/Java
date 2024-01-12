import java.util.Scanner;

class Nine {
    public void test(int n) {
        int a = 9;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a * 10;
            a = a + 9;
        }
    }
}

public class Method31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        Nine obj = new Nine();
        obj.test(n);

    }
}
