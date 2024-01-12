import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User name      : ");
        String name = sc.nextLine();

        System.out.print("Age            : ");
        int age = sc.nextInt();

        System.out.print("Sex : m or f   : ");
        char sex = sc.next().charAt(0);

        System.out.print("Marital status : ");
        char marit = sc.next().charAt(0);

        if (sex == 'f')
            System.out.print("Work in Urban Area .");

        else {
            if ((sex == 'm') && ((age >= 20) && (age <= 40)))
                System.out.print("Work in anywhere .");
            else {
                if ((sex == 'm') && ((age >= 40) && (age <= 60)))
                    System.out.print("Work in Urban Area .");

                else
                    System.out.print("ERROR .");

            }

        }
    }
}
