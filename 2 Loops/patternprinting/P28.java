package patternprinting;

public class P28 {
    public static void main(String[] arga) {
        int i, j;
        for (i = 1; i <= 9; i+=2) {
            for (j = 1; j <= i; j++) {
               // if (i == 5 || i == 4 && j <= 7 || i == 3 && j <= 5 || i == 2 && j <= 3 || i == 1 && j == 1)
                    System.out.print(j);
                //else
                  //  System.out.print(" ");
            }
            System.out.println();
        }
    }
}
