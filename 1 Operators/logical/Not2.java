public class Not2 {
    public static void main(String[] args) {
        boolean not, x, y;
        int a = 3;
        int b = 4;
        int c = 8;
        y = a < b && b < c;
        x = a > b || b > c;
        not = !(y && x);
        System.out.println("not :" + not);
    }
}
