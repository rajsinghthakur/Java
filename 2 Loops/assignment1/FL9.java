import java.util.Scanner;

public class FL9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term : ");
        int n = sc.nextInt();
        int i, sum = 0;
        for (i = 0; i <= n; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("sum : " + sum);
    }

}
