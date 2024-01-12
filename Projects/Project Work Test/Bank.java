import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

class Admin implements Serializable {
    private static final long SerialVersionUID = 11l;
    Scanner sc = new Scanner(System.in);
    private String e = "\u001B[4m", r = "\u001B[0m";
    File f = new File("C:/Users/rajth/OneDrive/Desktop/Admin.txt");
    File fu = new File("C:/Users/rajth/OneDrive/Desktop/User.txt");

    public void ViewAC() {
        try {
            File fu = new File("C:/Users/rajth/OneDrive/Desktop/User.txt");
            FileInputStream fis = new FileInputStream(fu);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Raj obj = (Raj) ois.readObject();
            System.out.println(
                    "\n|******************************************************************************************|");
            System.out.printf("|\t\t\tName              :     %-42s |\n", obj.getName());
            System.out.printf("|\t\t\tPassword          :     %-42s |\n", obj.getPass());
            System.out.printf("|\t\t\tMobile Number     :     %-42s |\n", obj.getMobile());
            System.out.printf("|\t\t\tAddress           :     %-42s |\n", obj.getAdd());
            System.out.printf("|\t\t\tAmount            :     %-42s |\n", obj.getAmount());
            System.out.printf("|\t\t\tAcount Number     :     %-42s |\n", obj.getNumber());
            System.out.printf("|\t\t\tDate of barth     :     %-42s |\n", obj.getDob());
            System.out.println(
                    "|******************************************************************************************|\n");
            System.out.println(e + "\n\t\t\t\tsuccessful read data\n" + r);
        } catch (Exception eee) {
            System.out.println(e + "\n\t\t\t\tSomthing want wrong\n" + r);
        }

    }

    public void RemoveAC() {

    }

    public void ViewallAC() {
        try {
            File fu = new File("C:/Users/rajth/OneDrive/Desktop/User.txt");
            FileInputStream fis = new FileInputStream(fu);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Raj obj = (Raj) ois.readObject();
            System.out.println(
                    "\n|******************************************************************************************|");
            System.out.printf("|\t\t\tName              :     %-42s |\n", obj.getName());
            System.out.printf("|\t\t\tPassword          :     %-42s |\n", obj.getPass());
            System.out.printf("|\t\t\tMobile Number     :     %-42s |\n", obj.getMobile());
            System.out.printf("|\t\t\tAddress           :     %-42s |\n", obj.getAdd());
            System.out.printf("|\t\t\tAmount            :     %-42s |\n", obj.getAmount());
            System.out.printf("|\t\t\tAcount Number     :     %-42s |\n", obj.getNumber());
            System.out.printf("|\t\t\tDate of barth     :     %-42s |\n", obj.getDob());
            System.out.println(
                    "|******************************************************************************************|\n");
            System.out.println(e + "\n\t\t\t\tsuccessful read data\n" + r);
        } catch (Exception eee) {
            System.out.println(e + "\n\t\t\t\tSomthing want wrong\n" + r);
        }
    }
}

class CreatAcount implements Serializable {
    private static final long SerialVersionUID = 11l;
    private String e = "\u001B[4m", r = "\u001B[0m";
    private String name;
    private String password;
    private String dob;
    private String mobile;
    private String add;
    private int amount;
    private long ACnum;

    CreatAcount(String name, String password, String dob, String mobile, String add, int amount, long ACnum) {
        System.out.println(e + "\t\t\t\tAccount creat successfull\n" + r);
        this.name = name;
        this.password = password;
        this.dob = dob;
        this.mobile = mobile;
        this.add = add;
        this.amount = amount;
        this.ACnum = ACnum;
    }

    public static long getSerialversionuid() {
        return SerialVersionUID;
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getACnum() {
        return ACnum;
    }

    public void setACnum(long aCnum) {
        ACnum = aCnum;
    }

}

class User implements Serializable {
    private static final long SerialVersionUID = 11l;
    Scanner sc = new Scanner(System.in);
    File f = new File("C:/Users/rajth/OneDrive/Desktop/User.txt");
    private String e = "\u001B[4m", r = "\u001B[0m";

    public void Update() {

    }

    public void ApplyLoan() {

    }

    public void LoanStatement() {

    }

    public void TranserMoney() {

    }

    public void TransactionHistory() {

    }

    public void Withdrow() {

    }

    public void Diposit() {

    }

    public void ViewAccount() {

    }
}

class Bank {
    public static void main(String[] args) {
        File f1 = new File("C:/Users/rajth/OneDrive/Desktop/Admin.txt");
        File f2 = new File("C:/Users/rajth/OneDrive/Desktop/User.txt");
        String e = "\u001B[4m", r = "\u001B[0m";
        boolean flag = true;
        while (flag) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(e + "\t\t\t\tWELCOME TO BANKING APPLICATION\n" + r);
                System.out.println(" _________ " + "\t\t\t\t" + " ________ " + "\t\t\t\t" + " ________ ");
                System.out.println("|  Admin  |" + "\t\t\t\t" + "|  User  |" + "\t\t\t\t" + "|  Exit  |");
                System.out.println("|____1____|" + "\t\t\t\t" + "|____2___|" + "\t\t\t\t" + "|____3___|\n");

                byte b1 = sc.nextByte();
                if (b1 == 1 || b1 == 2 || b1 == 3) {
                    switch (b1) {
                        case 1:
                            FileReader fr = new FileReader(f1);
                            Scanner ss = new Scanner(fr);
                            String data = "";
                            while (ss.hasNextLine()) {
                                data = data + ss.nextLine();
                            }
                            System.out.println("Enter Admin Login ID");
                            sc.nextLine();
                            String id = sc.nextLine();
                            System.out.println("Enter Login password");
                            String password = sc.nextLine();
                            if (data.contains(id) && data.contains(password)) {
                                System.out.println(e + "\t\t\t\tLOGIN SUCCESSFUL\n" + r);
                                Admin obj1 = new Admin();
                                boolean flag1 = true;
                                while (flag1) {
                                    try {
                                        System.out.println("Press-1 Create new customer account" + "\n"
                                                + "Press-2 Manage customer account" + "\n"
                                                + "Press-3 View particular account information" + "\n"
                                                + "Press-4 Remove/Block account" + "\n"
                                                + "Press-5 View all account list" + "\n"
                                                + "Press-6 Exit");
                                        byte b2 = sc.nextByte();
                                        if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5 || b2 == 6) {
                                            switch (b2) {
                                                case 1:
                                                    File fu = new File("C:/Users/rajth/OneDrive/Desktop/User.txt");
                                                    FileOutputStream fos = new FileOutputStream(fu);
                                                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                                                    sc = new Scanner(System.in);
                                                    System.out.println("\nEnter user ID name");
                                                    String name = sc.nextLine();
                                                    System.out.println("\nEnter user password");
                                                    String pass = sc.nextLine();
                                                    System.out.println("\nEnter date of barth");
                                                    String dob = sc.nextLine();
                                                    System.out.println("\nEnter mobile number");
                                                    String mobile = sc.nextLine();
                                                    System.out.println("\nEnter Address");
                                                    String add = sc.nextLine();
                                                    System.out.println("\nEnter deposit amount");
                                                    int amount = sc.nextInt();
                                                    if (amount < 1000) {
                                                        while (amount < 1000) {
                                                            System.out.println("\nPlese Enter atlest 1000rs");
                                                            amount = sc.nextInt();
                                                        }
                                                    }
                                                    Random randum = new Random();
                                                    long number = randum.nextLong(999999999999999l);
                                                    Raj obj = new Raj(name, pass, dob, mobile, add, amount, number);
                                                    oos.writeObject(obj);
                                                    oos.writeObject("\n");
                                                    System.out.println(
                                                            e + "\n\t\t\t\tSuccessful write data in the file\n"
                                                                    + r);

                                                    break;

                                                case 2:
                                                    boolean flag3 = true;
                                                    while (flag1) {
                                                        try {
                                                            System.out.println("Press-1 Enter Updated Name" + "\n"
                                                                    + "Press-2 Enter Updated Password" + "\n"
                                                                    + "Press-3 Enter Updated Date Of Barth" + "\n"
                                                                    + "Press-4 Enter Updated Mobile Number" + "\n"
                                                                    + "Press-5 Enter Updated Address" + "\n"
                                                                    + "Press-6 Exit ");
                                                            byte b3 = sc.nextByte();
                                                            if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5
                                                                    || b2 == 6) {
                                                                switch (b3) {
                                                                    case 1:

                                                                        break;
                                                                    case 2:

                                                                        break;
                                                                    case 3:

                                                                        break;
                                                                    case 4:

                                                                        break;
                                                                    case 5:

                                                                        break;
                                                                    case 6:
                                                                        flag3 = false;
                                                                        break;

                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                        } catch (Exception ex) {

                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    obj1.ViewAC();
                                                    break;

                                                case 4:
                                                    obj1.RemoveAC();
                                                    break;

                                                case 5:
                                                    obj1.ViewallAC();
                                                    break;

                                                case 6:
                                                    flag1 = false;
                                                    break;

                                                default:
                                                    break;
                                            }

                                        } else {
                                            System.out.println(e + "\t\t\t\tInvelid input plese re tray\n" + r);
                                        }
                                    } catch (Exception e1) {
                                        System.out.println(e + "\t\t\t\tSomthing want wrong\n" + r);
                                        sc.nextLine();
                                    }
                                }
                            } else {
                                System.out.println(e + "\t\t\t\tInvelid login information\n" + r);
                            }

                            break;
                        case 2:

                            FileReader fr2 = new FileReader(f2);
                            Scanner ss2 = new Scanner(fr2);
                            String data2 = "";
                            while (ss2.hasNextLine()) {
                                data = data2 + ss2.nextLine();
                            }
                            System.out.println("Enter User Login ID");
                            sc.nextLine();
                            String id2 = sc.nextLine();
                            System.out.println("Enter Login password");
                            String password2 = sc.nextLine();
                            if (data2.contains(id2) && data2.contains(password2)) {
                                System.out.println(e + "\t\t\t\tLOGIN SUCCESSFUL\n" + r);
                                User obj2 = new User();
                                boolean flag2 = true;
                                while (flag2) {
                                    try {
                                        System.out.println("Press-1  View account Details" + "\n" +
                                                "Press-2  Withdrow amount" + "\n" +
                                                "Press-3 Diposit amount" + "\n" +
                                                "Press-4 Transer Money" + "\n" +
                                                "Press-5 Transaction History" + "\n" +
                                                "Press-6 Update" + "\n" +
                                                "Press-7 Apply for loan" + "\n" +
                                                "Press-8 View loan statement" + "\n" +
                                                "Press-9 Exit");
                                        byte b2 = sc.nextByte();
                                        if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5 || b2 == 6 || b2 == 7
                                                || b2 == 8 || b2 == 9) {
                                            switch (b2) {
                                                case 1:
                                                    obj2.ViewAccount();
                                                    break;

                                                case 2:
                                                    obj2.Withdrow();
                                                    break;

                                                case 3:
                                                    obj2.Diposit();
                                                    break;

                                                case 4:
                                                    obj2.TranserMoney();
                                                    break;

                                                case 5:
                                                    obj2.TransactionHistory();
                                                    break;

                                                case 6:
                                                    obj2.Update();
                                                    break;
                                                case 7:
                                                    obj2.ApplyLoan();
                                                    break;
                                                case 8:
                                                    obj2.LoanStatement();
                                                    break;
                                                case 9:
                                                    flag2 = false;
                                                    break;

                                                default:
                                                    break;
                                            }
                                        } else {
                                            System.out.println(e + "\t\t\t\tInvelid input plese re tray\n" + r);
                                        }
                                    } catch (Exception e2) {
                                        System.out.println(e + "\t\t\t\tSomthing want wrong\n" + r);
                                        sc.nextLine();
                                    }
                                }
                            } else {
                                System.out.println(e + "\t\t\t\tInvelid login information\n" + r);
                            }
                            break;
                        case 3:
                            flag = false;
                            break;

                        default:
                            break;
                    }
                } else {
                    System.out.println(e + "\t\t\t\tInvelid input plese re tray\n" + r);
                }
            } catch (Exception e2) {
                System.out.println(e + "\t\t\t\tSomthing want wrong\n" + r);
            }
        }
    }
}