public class modulus {
    public static void main(String[] args) {
        int x, y;
        x = 3;
        y = 80;
        System.out.println("x%y :" + x % y);
        System.out.println("y%x :" + y % x);
        System.out.println("-x%y :" + -x % y);
        System.out.println("-y%x :" + -y % x);
        System.out.println("x%-y :" + x % -y);
        System.out.println("y%-x :" + y % -x);
        System.out.println("-x%-y :" + -x % -y);
        System.out.println("-y%-x :" + y % x);
    }
}
