import java.util.Scanner;

public class Weekday13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of week : ");
        int week = sc.nextInt();
        if ((week >= 1) && (week <= 7)) {
            if (week == 1)
                System.out.print("Expected Output : Monday");
            else if (week == 2)
                System.out.print("Expected Output : Tuesday");
            else if (week == 3)
                System.out.print("Expected Output : Wednesday");
            else if (week == 4)
                System.out.print("Expected Output : Thursday");
            else if (week == 5)
                System.out.print("Expected Output : Friday");
            else if (week == 6)
                System.out.print("Expected Output : Saturday");
            else if (week == 7)
                System.out.print("Expected Output : Sunday");
        } else
            System.out.print("Invaled Week number :");

    }
}