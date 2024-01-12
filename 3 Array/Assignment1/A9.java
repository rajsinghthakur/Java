package Array.Assignment1;

/*Initialize and print all elements of a 2D array. */
import java.util.Scanner;
/*public class A9 {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
} */

public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * System.out.println("Enter the no of rows");
         * int row = sc.nextInt();
         * System.out.println("Enter the no of column");
         * int column = sc.nextInt();
         */
        int a[][] = new int[3][3];
        System.out.println("Enter the values for the Array..");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
