package Array.Assignment1;

/*There are two arrays object one containing 100 elements and another
containing 50 elements. Both are of same data type. Can we assign one Array to
another */
import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of 1st array : ");
        int f = sc.nextInt();
        int a1[] = new int[f];
        System.out.println("Enter the values of 1st array : ");
        for (int i = 0; i < f; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter the no. of 2nd array : ");
        int s = sc.nextInt();
        int a2[] = new int[s];
        System.out.println("Enter the values of 2nd array : ");
        for (int j = 0; j < s; j++) {
            a2[j] = sc.nextInt();
        }
        int add = f + s;
        int a3[][] = new int[f][s];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < s; j++) {
              //  a3[i][j];
                System.out.print("assign : "+ a3[i][j]);
            }
        }

    }
}
