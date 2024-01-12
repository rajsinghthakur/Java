import java.util.Scanner;

class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int b = sc.nextInt();
        int T, r, u, e,z;
        T = 84;
        r = 114;
        u = 117;
        e = 101;
        z=(char) T + (char) r + (char) u + (char) e;
        System.out.println("T : " + (char) T + (char) r + (char) u + (char) e);
        boolean x = (a == b);
        int y = (x) ? (z) : (a > b) ? a : b;
        System.out.print("Result : " + y);
    }
}