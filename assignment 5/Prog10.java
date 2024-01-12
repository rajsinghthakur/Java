import java.util.Scanner;

class Prog10 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number under 1 to 5 : ");
        a = sc.nextInt();
        if (a == 1)
            System.out.print("one : ");
        else if (a == 2)
            System.out.print("two : ");
        else if (a == 3)
            System.out.print("three : ");
        else if (a == 4)
            System.out.print("four : ");
        else if (a == 5)
            System.out.print("five : ");

    }
}