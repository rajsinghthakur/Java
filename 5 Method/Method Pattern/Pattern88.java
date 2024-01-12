public class Pattern88 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 5) {
                    if (j <= 5)
                        System.out.print(j);
                    else
                        System.out.print(10 - j);
                }
            }
            System.out.println();
        }
    }
}
