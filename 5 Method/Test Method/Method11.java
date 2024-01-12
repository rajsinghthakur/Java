import java.util.Scanner;

class Odd {
    public void oddnumber(int n) {
        System.out.print("Odd number is : ");
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}

public class Method11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n  : ");
        int n = sc.nextInt();
        Odd obj = new Odd();
        obj.oddnumber(n);
    }

}