import java.util.Scanner;

class tabel {
    public void tabel(int n) {
        for (int i = 1; i <= 10; i++) {
            int tabel = n * i;
            System.out.println(tabel);
        }
    }
}

public class Method4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tabel number : ");
        int x = sc.nextInt();
        tabel obj = new tabel();
        obj.tabel(x);
    }

}
