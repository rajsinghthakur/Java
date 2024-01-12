import java.util.Scanner;

class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number  : ");
        int f = sc.nextInt();
        System.out.print("Enter The Second Number : ");
        int s = sc.nextInt();
        System.out.print("Enter The Third Number  : ");
        int t = sc.nextInt();
        System.out.print("Enter The Forth Number  : ");
        int fo = sc.nextInt();
        System.out.print("Enter The Fifth Number  : ");
        int fi = sc.nextInt();
        int sum = f + s + t + fo + fi;
        int average = sum / 5;
        System.out.println("average : " + average);
    }
}
