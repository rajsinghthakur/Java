import java.util.Scanner;

class QubeOdd {
    public void test(int n) {
        for (int i = 1; i < n * 2; i += 2) {
            System.out.print(i * i * i + " ");
        }
    }
}

public class Method25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        QubeOdd obj = new QubeOdd();
        obj.test(n);

    }
}
