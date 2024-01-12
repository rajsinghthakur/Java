
import java.util.Scanner;

class Bank {
    private String name;
    private String accountype;
    private int accountno;
    private int balance;
    private String branch;

    public Bank(String name, String accountype, int accountno, int balance, String branch) {
        this.name = name;
        this.accountype = accountype;
        this.accountno = accountno;
        this.balance = balance;
        this.branch = branch;

    }

    public void SavingAccount() {
        // print the detals Saving Account
        System.out.println(
                "\n--------------------------------------\n\tDetail\t\n--------------------------------------");
        System.out.println("Name           : " + name);
        System.out.println("Account Type   : " + accountype);
        System.out.println("Account Number : XYZ " + accountno);
        System.out.println("Baalance       : " + balance);
        System.out.println("Branch         : " + branch);
        System.out.println();
    }

    public void CurrentAccount() {
        // print the detals Current Account
        System.out.println(
                "\n--------------------------------------\n\tDetail\t\n--------------------------------------");
        System.out.println("Name           : " + name);
        System.out.println("Account Type   : " + accountype);
        System.out.println("Account Number : XYZ " + accountno);
        System.out.println("Baalance       : " + balance);
        System.out.println("Branch         : " + branch);
        System.out.println();
    }

    public void Continue(int accountnoNew, int amount) {
        // Continue
        if (accountnoNew == accountno) {
            System.out.println(
                    "\n--------------------------------------\n\tDetail\t\n--------------------------------------");
            System.out.println("Name           : " + name);
            System.out.println("Account Type   : " + accountype);
            System.out.println("Account Number : XYZ " + accountno);
            System.out.println("Baalance       : " + (balance + amount));
            this.balance = (balance + amount);
            System.out.println("Branch         : " + branch);
            System.out.println();
        }
    }
}

 class Inh16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bank Of India");
        System.out.println("Enter number of Accounts to open : ");
        byte num = sc.nextByte();
        int accountno = 10000;
        int balance = 0;
        String name = "";
        String branch = "";
        String accountype = "";
        Bank data[] = new Bank[num];
        for (int i = 0; i < num; i++) {
            System.out.println("\n-------------------------------------------\nEnter the Information of Holder number "
                    + (i + 1) + " :\n-------------------------------------------");
            System.out.println("Which account do you want to open :");
            System.out.println("you can open savings account click 1 :  you can open current account click 2 :");
            byte chek = sc.nextByte();
            if (1 <= chek && chek <= 2) {
                switch (chek) {
                    case 1:
                        System.out.println("Welcome to Saving Account");
                        System.out.println("Plese Enter your Name  : ");
                        sc.nextLine();
                        name = sc.nextLine();
                        accountno++;
                        accountype = "Saving Account";
                        branch = "Main Branch";
                        System.out.println("Plese Enter 5000Rs for opening Saving Account : ");
                        balance = sc.nextInt();
                        if (balance >= 5000) {
                            System.out.println("Account created successfully.");
                        } else {
                            while (balance < 5000) {
                                System.out.println("Plese Enter at least 5000Rs");
                                balance = sc.nextInt();
                            }
                            System.out.println("Account created successfully.");
                        }
                        data[i] = new Bank(name, accountype, accountno, balance, branch);
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Welcome to Current Account");
                        System.out.println("Plese Enter your Name : ");
                        sc.nextLine();
                        name = sc.nextLine();
                        accountno++;
                        accountype = "Current Account";
                        branch = "Kiosak Branch";
                        System.out.println("Plese Enter 1000Rs for opening Current Account : ");
                        balance = sc.nextInt();
                        if (balance >= 1000) {
                            System.out.println("Account created successfully.");
                        } else {
                            while (balance < 1000) {
                                System.out.println("Plese Enter at least 1000Rs");
                                balance = sc.nextInt();
                            }
                            System.out.println("Account created successfully.");
                        }
                        data[i] = new Bank(name, accountype, accountno, balance, branch);
                        System.out.println();
                        break;
                }
            } else {
                System.out.println("Invalid input");
            }
        }
        for (int j = 0; j < data.length; j++) {
            if (accountype == "Saving Account")
                data[j].SavingAccount();
            else
                data[j].CurrentAccount();
        }
        System.out.println("Do you want to continue yes or no");
        String Continue = sc.next();
        for (int a = 0; (Continue.equals("yes")); a++) {
            int accountnoNew = 0;
            int amount = 0;
            if (Continue.equals("yes")) {
                System.out.println("Enter your account number : ");
                accountnoNew = sc.nextInt();

                System.out.println("Press 1 for Deposition");
                System.out.println("Press 2 for Withdrawing");
                byte press = sc.nextByte();
                switch (press) {
                    case 1:
                        System.out.println("Enter Deposit Amount : ");
                        amount = sc.nextInt();
                        data[a].Continue(accountnoNew, (amount));
                        break;

                    case 2:
                        System.out.println("Enter Withdraw Amount : ");
                        amount = sc.nextInt();
                        data[a].Continue(accountnoNew, (-amount));
                        break;
                }
                System.out.println("Do you want to continue yes or no ");
                Continue = sc.next();
            } else {
                System.out.println(
                        "\n-------------------------------------------\n\tTHANKYOU FOR VISITING\t\n-------------------------------------------\n");
            }
        }
    }
}