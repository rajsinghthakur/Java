import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

class Raj implements Serializable {
    private static final long SerialVersionUID = 10l;
    private String name;
    private String pass;
    private String dob;
    private String mobile;
    private String add;
    private int amount;
    private long number;

    public Raj(String name, String pass, String dob, String mobile, String add, int amount, long number) {
        this.name = name;
        this.pass = pass;
        this.dob = dob;
        this.mobile = mobile;
        this.add = add;
        this.amount = amount;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public void display() {
        System.out.println(name);
        System.out.println(pass);
        System.out.println(dob);
        System.out.println(mobile);
        System.out.println(add);
        System.out.println(amount);
    }

}

public class testcode {
    public static void main(String[] args) {
        boolean flag = true;
        int count = 0;
        while (flag) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Press-1 write");
                System.out.println("Press-2 Read");
                System.out.println("Press-3 Exit");
                System.out.println("Press-4 Update");
                byte b = sc.nextByte();
                if (b == 1 || b == 2 || b == 3 || b == 4) {
                    switch (b) {
                        case 1:
                            Raj n[] = new Raj[5];
                            for (int i = 0; i < n.length; i++) {
                                sc = new Scanner(System.in);
                                System.out.println("Enter user ID name");
                                String name = sc.nextLine();
                                System.out.println("Enter user password");
                                String pass = sc.nextLine();
                                System.out.println("Enter date of barth");
                                String dob = sc.nextLine();
                                System.out.println("Enter mobile number");
                                String mobile = sc.nextLine();
                                System.out.println("Enter Address");
                                String add = sc.nextLine();
                                System.out.println("Enter deposit amount");
                                int amount = sc.nextInt();
                                if (amount < 1000) {
                                    while (amount < 1000) {
                                        System.out.println("Enter atlest 1000 rs");
                                        amount = sc.nextInt();
                                    }
                                }
                                Random r = new Random();
                                long number = r.nextLong(999999999999999l);
                                System.out.println("\nSuccessful write data in the file\n");
                                sc.nextLine();
                                n[i] = new Raj(name, pass, dob, mobile, add, amount, number);
                            }
                            try {
                                File f = new File("C:/Users/rajth/OneDrive/Desktop/User.txt");
                                FileOutputStream fos = new FileOutputStream(f,true);
                                ObjectOutputStream oos = new ObjectOutputStream(fos);
                                for (int i = 0; i < n.length; i++) {
                                    oos.writeObject(n[i]);
                                }
                                oos.close();
                                System.out.println("success");
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            break;

                        case 2:
                            try {
                                File f = new File("C:/Users/rajth/OneDrive/Desktop/User.txt");
                                FileInputStream fis = new FileInputStream(f);
                                ObjectInputStream ois = new ObjectInputStream(fis);

                                for (int i = 0; i < 5; i++) {
                                    new1 n1 = (new1) ois.readObject();
                                    System.out.println(n1);
                                }
                            } catch (Exception e) {
                                System.out.println("error");
                            }
                            break;

                        case 3:
                            flag = false;
                            break;
                        case 4:
                            // Raj obj2[] = new Raj[3];
                            // for (int i = 0; i < obj.length; i++) {
                            // File fu = new File("C:/Users/rajth/OneDrive/Desktop/User.txt");
                            // FileInputStream fis = new FileInputStream(fu);
                            // ObjectInputStream ois = new ObjectInputStream(fis);
                            // obj[i] = (Raj) ois.readObject();
                            // System.out.println("Enter updated name");
                            // String name = sc.nextLine();
                            // obj[i].setName(name);
                            // FileOutputStream fos = new FileOutputStream(fu);
                            // ObjectOutputStream oos = new ObjectOutputStream(fos);
                            // oos.writeObject(obj[i]);
                            // }

                            break;

                        default:
                            break;
                    }
                }

            } catch (Exception e) {
                System.out.println("somthing wnant wrong 3");
            }
        }
    }
}