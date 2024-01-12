import java.util.Scanner;

class Even {
    public void evennumber(int n) {
        System.out.print("Even Number is : ");
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}

public class Method9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n  : ");
        int n = sc.nextInt();
        Even obj = new Even();
        obj.evennumber(n);
    }

}