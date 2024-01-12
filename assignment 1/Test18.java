import java.util.Scanner;

class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();
        int months = days / 30;
        int remainingDays = days % 30;
        int weeks = remainingDays / 7;
        remainingDays = remainingDays % 7;

        System.out.println("Months : " + months);
        System.out.println("Weeks  : " + weeks);
        System.out.println("Days   : " + remainingDays);
    }
}
