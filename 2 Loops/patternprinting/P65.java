class p65 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i <= 4; i++) {
            for (int k = 4; k >= i; k--)
                for (j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}