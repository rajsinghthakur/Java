import java.util.Scanner;

public class FL5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of nth term : ");
        int n = sc.nextInt();
        int a;
        for (a = 1; a < n * 2; a = a + 2) {
            System.out.println(a);

        }
    }
}
