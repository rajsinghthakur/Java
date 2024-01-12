import java.util.Scanner;

class Unit {
    void test(int a) {
        int x = 10;
        if (a >= 1 && a < 100) {
            x = x * a;
            System.out.println("Total bill is : " + x);
        } else if (a >= 100 && a < 200) {
            x = x * a;
            System.out.println("Total bill is : " + x);
        } else if (a >= 200 && a < 300) {
            x = x * a;
            System.out.println("Total bill is : " + x);
        } else if (a >= 300) {
            x = x * a;
            System.out.println("Total bill is : " + x);
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit : ");
        int u = sc.nextInt();
        Unit obj = new Unit();
        obj.test(u);

    }
}
