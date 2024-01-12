package Method;

import java.util.Scanner;

class pass {
    public void test(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}

public class Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value of N : ");
        int n = sc.nextInt();
        pass obj = new pass();
        obj.test(n);
    }
}
