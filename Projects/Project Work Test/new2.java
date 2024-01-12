import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

class CreatAcount implements Serializable {
    private static final long SerialVersionUID = 11l;
    private String e = "\u001B[4m", r = "\u001B[0m";
    private String name;
    private String password;
    private String dob;
    private String mobile;
    private String address;
    private int depositamount;
    private long AccountNum;

    public CreatAcount(String name, String password, String dob, String mobile, String address,
            int depositamount, long AccountNum) {
        this.name = name;
        this.password = password;
        this.dob = dob;
        this.mobile = mobile;
        this.address = address;
        this.depositamount = depositamount;
        this.AccountNum = AccountNum;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDepositamount() {
        return depositamount;
    }

    public void setDepositamount(int depositamount) {
        this.depositamount = depositamount;
    }

    public long getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(long AccountNum) {
        this.AccountNum = AccountNum;
    }

    public String toString() {
        return name + " " + password + " " + dob + " " + mobile + " " + address + " " + depositamount + " "
                + AccountNum;
    }

}

public class new2 {
    public static void main(String[] args) {
        try {
            int choice = -1;
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);
            File file = new File("C:/Users/rajth/OneDrive/Desktop/FileHandl.txt");
            ArrayList<CreateAccount> al = new ArrayList<CreateAccount>();
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            ListIterator li = null;

            if (file.isFile()) {
                ois = new ObjectInputStream(new FileInputStream(file));
                al = (ArrayList<CreateAccount>) ois.readObject();
                ois.close();
            }

            do {
                System.out.println("1.INSERT");
                System.out.println("2.DISPLAY");
                System.out.println("3.SEARCH");
                System.out.println("4.DELETE");
                System.out.println("5.UPDATE");
                System.out.println("0.EXIT");
                System.out.println("Enter your choice : ");
                choice = s.nextInt();

                switch (choice) {
                    case 1:
                        for (int i = 0; i < 1; i++) {

                            System.out.print("Enter Name : ");
                            String name = s1.nextLine();

                            System.out.print("Enter PassWord : ");
                            String pass = s1.nextLine();

                            System.out.print("Enter Date Of Barth : ");
                            String dob = s1.nextLine();

                            System.out.print("Enter Mobile Number : ");
                            String mobile = s1.nextLine();

                            System.out.print("Enter Address : ");
                            String Address = s1.nextLine();

                            System.out.print("Enter Deposit Amount : ");
                            int depositamount = s.nextInt();

                            System.out.print("Enter Account Number : ");
                            int AccountNum = s.nextInt();

                            al.add(new CreateAccount(name, pass, dob, mobile, Address, depositamount, AccountNum));
                        }
                        oos = new ObjectOutputStream(new FileOutputStream(file));
                        oos.writeObject(al);
                        oos.close();
                        break;

                    // case 2:
                    // if (file.isFile()) {
                    // ois = new ObjectInputStream(new FileInputStream(file));
                    // al = (ArrayList<CreateAccount>) ois.readObject();
                    // ois.close();

                    // System.out.println("--------------------------------");
                    // li = al.listIterator();
                    // while (li.hasNext())
                    // System.out.println(li.next());
                    // System.out.println("--------------------------------");
                    // } else {
                    // System.out.println("File not Exists...... ..!");
                    // }
                    // break;

                    // case 3:
                    // if (file.isFile()) {
                    // ois = new ObjectInputStream(new FileInputStream(file));
                    // al = (ArrayList<CreateAccount>) ois.readObject();
                    // ois.close();

                    // boolean found = false;
                    // System.out.println("Enter empno to search : ");
                    // int empno = s.nextInt();
                    // System.out.println("--------------------------------");
                    // li = al.listIterator();
                    // while (li.hasNext()) {
                    // CreateAccount e = (CreateAccount) li.next();
                    // if (e.empno == empno) {
                    // System.out.println(e);
                    // found = true;
                    // }
                    // }
                    // if (!found)
                    // System.out.println("Record not found.........!");
                    // System.out.println("--------------------------------");
                    // } else {
                    // System.out.println("File not Exists...... ..!");
                    // }
                    // break;
                    // case 4:
                    // if (file.isFile()) {
                    // ois = new ObjectInputStream(new FileInputStream(file));
                    // al = (ArrayList<CreateAccount>) ois.readObject();
                    // ois.close();

                    // boolean found = false;
                    // System.out.print("Enter empno to Delete : ");
                    // int empno = s.nextInt();
                    // System.out.println("--------------------------------");
                    // li = al.listIterator();
                    // while (li.hasNext()) {
                    // CreateAccount e = (CreateAccount) li.next();
                    // if (e. == empno) {
                    // li.remove();
                    // found = true;
                    // }
                    // }
                    // if (found) {
                    // oos = new ObjectOutputStream(new FileOutputStream(file));
                    // oos.writeObject(al);
                    // oos.close();
                    // System.out.println("Record Deleted Successfully.....!");
                    // } else {
                    // System.out.println("Record not found.........!");
                    // }

                    // System.out.println("--------------------------------");
                    // } else {
                    // System.out.println("File not Exists...... ..!");
                    // }
                    // break;
                    // case 5:
                    // if (file.isFile()) {
                    // ois = new ObjectInputStream(new FileInputStream(file));
                    // al = (ArrayList<CreateAccount>) ois.readObject();
                    // ois.close();

                    // boolean found = false;
                    // System.out.print("Enter empno to Update : ");
                    // int empno = s.nextInt();
                    // System.out.println("--------------------------------");
                    // li = al.listIterator();
                    // while (li.hasNext()) {
                    // CreateAccount e = (CreateAccount) li.next();
                    // if (e.empno == empno) {
                    // System.out.print("Enter New EmpName");
                    // String ename = s1.nextLine();

                    // System.out.print("Enter New Salary");
                    // int sal = s.nextInt();

                    // li.set(new CreateAccount(empno, ename, sal));
                    // found = true;
                    // }
                    // }
                    // if (found) {
                    // oos = new ObjectOutputStream(new FileOutputStream(file));
                    // oos.writeObject(al);
                    // oos.close();
                    // System.out.println("Record Updated Successfully.....!");
                    // } else {
                    // System.out.println("Record not found.........!");
                    // }

                    // System.out.println("--------------------------------");
                    // } else {
                    // System.out.println("File not Exists...... ..!");
                    // }
                    // break;

                    default:
                        break;
                }
            } while (choice != 0);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

}