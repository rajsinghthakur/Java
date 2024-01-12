class And1 {
    public static void main(String[] args) {
        boolean and;
        int a = 3;
        int b = 4;
        int c = 8;
        and = a < b && b < c || c < a;
        System.out.println("and :" + and);
    }
}
