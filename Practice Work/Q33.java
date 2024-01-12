import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b[] = { 7, 3, 4, 11, 6, 2, 1, 8 };
        System.out.println("Enter search element");
        int search = sc.nextInt();
        boolean chek = false;
        for (int i = 0; i < b.length; i++) {
            if (search == b[i]) {
                chek = true;
            }
        }
        if (chek)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
