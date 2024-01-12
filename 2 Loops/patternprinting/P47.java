package patternprinting;

class P47 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1 || i == 5)
                    System.out.print("1");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}