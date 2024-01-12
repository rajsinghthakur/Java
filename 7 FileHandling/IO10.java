import java.util.Scanner;

class IO10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                int ch = col + 1 + 'A' - 1;
                System.out.print((char) ch + " ");
            }
            for (int col = row - 1; col >= 0; col--) {
                int ch = col + 'A';
                System.out.print((char) ch + " ");
            }
            System.out.println();
        }
    }
}