
import java.util.Scanner;

class Reverse {
    public void test(int n) {
        System.out.print("Reverse integer number is : ");
        for (int i = 0-1; i >= -n; i--) {
            System.out.print(i + " ");
        }

    }
}

public class Method13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value of N : ");
        int n = sc.nextInt();
        Reverse obj = new Reverse();
        obj.test(n);
    }
}
