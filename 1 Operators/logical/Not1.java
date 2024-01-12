public class Not1 {
    public static void main(String[] args) {
        boolean not,x,y,z;
        int a = 3;
        int b = 4;
        int c = 8;
        x = a<b&&c<b;
        y = b>c||c>a;
        not= !(x && y);
        System.out.println("not :" + not);
    }
}
