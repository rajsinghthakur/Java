import java.util.Scanner;

public class Leapyear10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; // Divisible by 400, so it's a leap year
                } else {
                    return false; // Divisible by 100 but not by 400, so not a leap year
                }
            } else {
                return true; // Divisible by 4 but not by 100, so it's a leap year
            }
        } else {
            return false; // Not divisible by 4, so not a leap year
        }
    }
}
