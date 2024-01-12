import java.util.Scanner;

class prog17 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number  : ");
        a = sc.nextInt();
        if (a > 0)
            System.out.print("sign : + ");
        else
            System.out.print("sign : - ");
    }
}