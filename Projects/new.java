class JavaColorCodes {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j==i-2)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
