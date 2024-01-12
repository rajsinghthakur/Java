import java.util.Scanner;

class OddN {
    public void oddnumber(int n) {
        System.out.print("OddN number is : ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}

public class Method12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n  : ");
        int n = sc.nextInt();
        OddN obj = new OddN();
        obj.oddnumber(n);
    }

}