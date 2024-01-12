import java.util.Scanner;

class EvenN {
    public void evennumber(int n) {
        System.out.print("EvenN Number is : ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}

public class Method10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n  : ");
        int n = sc.nextInt();
        EvenN obj = new EvenN();
        obj.evennumber(n);
    }

}