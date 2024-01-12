package patternprinting;

public class P41 {
    public static void main(String[] args) {
        int i, j;
        char a = 'A';
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 9; j++) {
                if (i == 5 || i == 4 && j <= 7 || i == 3 && j <= 5 || i == 2 && j <= 3 || i == 1 && j == 1) {
                    System.out.print(a);
                    a++;
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
