import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data[][] = new String[100][8];
        int accountno = 1275638000;
        System.out.println("\n-----------Welcome to 'BANK OF INDIYA'-----------");

        for (int i = 0; i < 1; i++) {
            accountno++;
            System.out.println("\nYou have allrady Account in 'BANK OF INDIYA'");
            System.out.println("YES OR NO");
            String s = sc.nextLine();
            if (s.equals("yes") || s.equals("y") || s.equals("Y") || s.equals("YES") || s.equals("Yes")
                    || s.equals("1")) {
                System.out.print("\nEnter your Account Number : ");
                System.out.print("\nEnter your pin : ");
            } else {
                System.out.println("\nDo you want to open Account");
                System.out.println("YES OR NO");
                String s1 = sc.nextLine();
                if (s1.equals("yes") || s1.equals("y") || s1.equals("Y") || s1.equals("YES") || s1.equals("Yes")
                        || s1.equals("1")) {
                    for (int j = 0; j < data[i].length; j++) {
                        if (j == 0) {
                            // name :
                            System.out.print("\nName          : ");
                            data[i][j] = sc.nextLine();
                        }
                        if (j == 1) {
                            // father name :
                            System.out.print("\nFather Name   : ");
                            data[i][j] = sc.nextLine();
                        }
                        if (j == 2) {
                            // Date of Birth
                            System.out.print("\nDate of Birth : ");
                            data[i][j] = sc.nextLine();
                        }
                        if (j == 3) {
                            // Address
                            System.out.print("\nAddress       : ");
                            data[i][j] = sc.nextLine();
                        }
                        if (j == 4) {
                            // Occupation
                            System.out.print("\nOccupation    : ");
                            data[i][j] = sc.nextLine();
                        }
                        if (j == 5) {
                            // Nomination
                            System.out.print("\nNomination    : ");
                            data[i][j] = sc.nextLine();
                        }
                        if (j == 6) {
                            // Account no
                            data[i][j] = String.valueOf(accountno);
                        }
                        if (j == 7) {
                            System.out.println("\n-----------Account create Successfully-----------");

                            // Pin
                            System.out.println("\nCreate your pin");
                            data[i][j] = sc.next();
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);
            }
        }
    }
}
