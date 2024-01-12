import java.util.Scanner;

class Alpha {
    public void test(char n) {
        for (char i = 'A'; i <= n; i++) {
            if (i >= 'A' && i <= 'Z')
                System.out.print((char) i + " ");
        }
    }
}

public class Method32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Capital latter : ");
        char n = sc.next().charAt(0);

        Alpha r = new Alpha();
        if (n >= 'A' && n <= 'Z')
            r.test(n);
        else
            System.out.print("Invelid input !");
    }
}