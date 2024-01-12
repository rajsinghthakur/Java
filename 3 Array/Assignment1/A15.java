package Array.Assignment1;

/* Write a Java program to print the following grid. Expected Output: - - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - - */
import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows no.");
        int row = sc.nextInt();
        System.out.println("enter the column no.");
        int col = sc.nextInt();
        String a[][] = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = "-";
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}