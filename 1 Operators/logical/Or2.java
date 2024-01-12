class Or2 {
    public static void main(String[] args) {
        boolean or, x, y;
        int a = 3;
        int b = 4;
        int c = 8;
        x = a>b || b<c;
        y = a<c || c>b;
        or = x || y;
        System.out.println("or :" + or);
    }
}
