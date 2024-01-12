import java.util.Scanner;

class Reverse {
    public void test() {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        System.out.println("Enter the value of Array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Reverse array is");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        Reverse obj = new Reverse();
        obj.test();
    }
}
