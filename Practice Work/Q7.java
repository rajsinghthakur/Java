import java.util.Scanner;

class Armstrong {
    public void test(int n) {
        int x = n;
        int p = x;
        int rem;
        int rev = 0;
        while (x > 0) {
            rem = x % 10;
            x = x / 10;
            rev = rev + rem * rem * rem;
        }
        if (rev == p) {
            System.out.println("Number is armstrong ");
        } else
            System.out.println("Number is not armstrong ");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any number : ");
        int n = sc.nextInt();
        Armstrong obj = new Armstrong();
        obj.test(n);
    }
}
