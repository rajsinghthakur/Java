package patternprinting;

public class P40 {
    /*public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 11; i++) {
            for (j = 1; j <= 11; j++) {
                if (i == 5 || i == 4 && j <= 7 || i == 3 && j <= 4 || i == 2 && j <= 2 || i == 1 && j <= 1)
                    System.out.print("*");
            }
            System.out.println();
        }
    } */
        public static void main(String[] args) {
        int i, j,s=1;
        for (i = 1; i <= 5; i=i+1) {
            for (j = 1; j <= s; j=j+1) {
                    System.out.print("*");
            }
            System.out.println();
            s=s+i;
        }
    } 
}
