import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println("Enter delet element");
        int c = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (c == a[i]) {
                    a[j] = a[j + 1];
                    a[j + 1] = a[j + 1 + 1];
                }
            }
        }
        for (int i = 0; i < a.length - 1; i++);
            System.out.print(a[i] + " ");
    }
}
