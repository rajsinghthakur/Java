import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

class CreateAccount {
    private String name;
    private String password;
    private String address;
    private String dob;
    private String mobile;
    private int amount;
    private long account;

    public CreateAccount(String name, String password, String address, String dob, String mobile, int amount,
            long account) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.dob = dob;
        this.mobile = mobile;
        this.amount = amount;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

}

public class BankingApp {
    public static void main(String[] args) {
        boolean flag1 = true;
        while (flag1)
            try {
                Scanner in = new Scanner(System.in);
                String e = "\u001B[4m", r = "\u001B[0m";

                System.out.println(e + "\t\t\t\tWELCOME TO BANKING APPLICATION\n" + r);
                System.out.println(" _________ " + "\t\t\t\t" + " ________ " + "\t\t\t\t" + " ________ ");
                System.out.println("|  Admin  |" + "\t\t\t\t" + "|  User  |" + "\t\t\t\t" + "|  Exit  |");
                System.out.println("|____1____|" + "\t\t\t\t" + "|____2___|" + "\t\t\t\t" + "|____0___|\n");

                int b1 = in.nextInt();
                if (b1 == 1 || b1 == 2 || b1 == 0) {
                    switch (b1) {
                        case 1:

                            break;

                        case 2:

                            break;

                        case 0:
                            flag1 = false;
                            break;

                        default:
                            break;
                    }
                } else {
                    System.out.println("Invelid Input plese re Enter");
                }
            } catch (Exception e) {
                System.out.println("Somthing want rong-1");
            }
    }
}