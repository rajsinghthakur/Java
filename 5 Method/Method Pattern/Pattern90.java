import java.util.Scanner;

class P90 {
    public void test(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i == j || i + j == (a + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Pattern90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int a = sc.nextInt();
        P90 obj = new P90();
        obj.test(a);
    }

}
