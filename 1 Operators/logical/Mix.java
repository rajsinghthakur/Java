class Mix {
    public static void main(String[] args) {
        boolean and, or, not;
        int a = 3;
        int b = 4;
        int c = 8;
        and = a < b && b < c;
        or = a > b || b > c;
        not = !(and && or);
        System.out.println("not :" + not);
    }
}
