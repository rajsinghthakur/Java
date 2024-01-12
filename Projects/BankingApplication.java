import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.jar.Attributes.Name;

import javax.print.event.PrintJobAdapter;

class Customer implements Serializable {
        String name;
        String password;
        String address;
        String dob;
        String mobile;
        int amount;
        long account;

        public Customer(String name, String password, String address, String dob, String mobile, int amount, long account) {
          this.name = name;
          this.password = password;
          this.address = address;
          this.dob = dob;
          this.mobile = mobile;
          this.amount = amount;
          this.account = account;
        }

        public String toString() {
                return "\n\t\t\t\tName            : " + name + "\n\n\t\t\t\tPassword        : " + "***********" + "\n\n\t\t\t\tAddress         : " + address + "\n\n\t\t\t\tDate Of Birth   : " + dob + "\n\n\t\t\t\tMobile Number   : " + mobile + "\n\n\t\t\t\tAccount Balance : " + amount + "\n\n\t\t\t\tAccount Number  : " + account + "\n";
        }
}

class History implements Serializable {
        String date;
        long name;
        long account;
        int amount;
        int total;

        public History(String date, long name, long account, int amount, int total) {
          this.date = date;
          this.name = name;
          this.account = account;
          this.amount = amount;
          this.total = total;
        }

        public String toString() {
                return "\n" + date + "         " + name + "             " + account + "              " + amount+ "                " + total + "\n";
        }
}

class Loan implements Serializable {
        String name;
        int balance;
        String date;
        int loan;
        long account;
        String dob;
        String aadhar;
        String pain;

        public Loan(String name, int balance, String date, int loan, long account, String dob, String aadhar, String pain) {
          this.name = name;
          this.balance = balance;
          this.date = date;
          this.loan = loan;
          this.account = account;
          this.dob = dob;
          this.aadhar = aadhar;
          this.pain = pain;
        }

        public String toString() {
                return "\n" + "\t\t\t\tName           : " + name + "\n\n" + "\t\t\t\tBalance        : " + balance + "\n\n" + "\t\t\t\tApplied on     : " + date + "\n\n" + "\t\t\t\tLoan ammount   : " + loan + "\n\n" + "\t\t\t\tAccount Number : " + account + "\n\n" + "\t\t\t\tDate Of Birth  : " + dob + "\n\n" + "\t\t\t\tAadhar Number  : " + aadhar + "\n\n" + "\t\t\t\tPain Number    : " + pain + "\n";
        }
}

public class BankingApplication {
   public static void main(String[] args) {
    try {
            String re = "\u001B[0m", bl = "\u001B[30m", r = "\u001B[31m", g = "\u001B[32m",y = "\u001B[33m",b = "\u001B[34m", p = "\u001B[35m", c = "\u001B[36m", R = "\u001B[41m",G = "\u001B[42m",C = "\u001B[46m", W = "\u001B[47m";
            int choice = -1;
            Scanner s1 = new Scanner(System.in);
            Scanner s2 = new Scanner(System.in);
            File file = new File("C:/Users/rajth/OneDrive/Documents/Application.txt");
            ArrayList<Customer> al = new ArrayList<Customer>();
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            ListIterator li = null;
            
            File file2 = new File("C:/Users/rajth/OneDrive/Documents/History.txt");
            ArrayList<History> al2 = new ArrayList<History>();
            ObjectOutputStream oos2 = null;
            ObjectInputStream ois2 = null;
            ListIterator li2 = null;
            
            File file3 = new File("C:/Users/rajth/OneDrive/Documents/Loan.txt");
            ArrayList<Loan> al3 = new ArrayList<Loan>();
            ObjectOutputStream oos3 = null;
            ObjectInputStream ois3 = null;
            ListIterator li3 = null;
            
            if (file.isFile()) {
                    ois = new ObjectInputStream(new FileInputStream(file));
                    al = (ArrayList<Customer>) ois.readObject();
                    ois.close();
            }
            
            if (file2.isFile()) {
                    ois2 = new ObjectInputStream(new FileInputStream(file2));
                    al2 = (ArrayList<History>) ois2.readObject();
                    ois2.close();
            }
                                    
            if (file3.isFile()) {
                    ois3 = new ObjectInputStream(new FileInputStream(file3));
                    al3 = (ArrayList<Loan>) ois3.readObject();
                    ois3.close();
            }
            
            System.out.println("\n\t\t" + y + "**--------------| WELCOME TO BANKING APPLICATION |--------------**"+ re + "\n");
            boolean flag2 = true;
            while (flag2) {
    try {
            System.out.println(W + bl + "   Admin   " + re + "\t\t\t\t" + W + bl+ "   User   " + re+ "\t\t\t\t" + W + bl + "   Exit   " + re);
            System.out.println(W + bl + "     1     " + re + "\t\t\t\t" + W + bl+ "     2    " + re+ "\t\t\t\t" + W + bl + "     3    " + re + "\n");
            int n2 = s1.nextInt();
            if (n2 == 1 || n2 == 2 || n2 == 3) {
            switch (n2) {
               case 1:
                System.out.println("\n\t" + y+ "**-------------| Welcome Admin Plese Enter your Login Information |-------------**"+ re + "\n");
                System.out.print("\n\t\t\t\tEnter Admin Login ID : ");
                String AdminID = s2.nextLine();
                System.out.print("\n\t\t\t\tEnter Login Password : ");
                String AdminPassword = s2.nextLine();
                if (AdminID.equals("raj")&& AdminPassword.equals("raj123")) {
                        System.out.println("\n\n\t\t\t" + y + "*-----------| Login SuccessFully |-----------*" + re + "\n\n");
                do {
                try {
                  System.out.println("\t" + W + bl + "       Create account      " + re + "    \t\t\t" + W + bl + "  Delete / Block account   " + re);
                  System.out.println("\t" + W + bl + "             1             " + re + "    \t\t\t" + W + bl + "            4              " + re + "\n");
                  System.out.println("\t" + W + bl + "      View all account     " + re + "    \t\t\t" + W + bl + "      Update account       " + re);
                  System.out.println("\t" + W + bl + "             2             " + re + "    \t\t\t" + W + bl + "            5              " + re + "\n");
                  System.out.println("\t" + W + bl + "  View particular account  " + re + "    \t\t\t" + W + bl + "          LogOut           " + re);
                  System.out.println("\t" + W + bl + "             3             " + re + "    \t\t\t" + W + bl + "            6              " + re + "\n");
                  choice = s1.nextInt();
                  if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6) {
                  switch (choice) {
                  case 1:
                  System.out.println("\n\t\t\t" + g+ "---------| Create New Customer Account |----------"+ re+ "\n");
                  for (int i = 0; i < 1; i++) {
                          System.out.print("\n\t\t\t\tEnter Name            : ");
                          String name = s2.nextLine();
                          System.out.print("\n\t\t\t\tEnter Password        : ");
                          String password = s2.nextLine();
                          System.out.print("\n\t\t\t\tEnter Address         : ");
                          String address = s2.nextLine();
                          System.out.print("\n\t\t\t\tEnter Date Of Birth   : ");
                          String dob = s2.nextLine();
                          System.out.print("\n\t\t\t\tEnter Mobile Number   : ");
                          String mobile = s2.nextLine();
                          boolean flag1 = true;
                          int amount = 0;
                          do {
                          try {
                               System.out.print("\n\t\t\t\tEnter Deposit Amount  : ");
                               amount = s1.nextInt();
                               if (amount < 1000) {
                                       while (amount < 1000) {
                                               System.out.print(r+ "\n\t\t\t\tEnter atleast 1000 Rs : "+ re);
                                               amount = s1.nextInt();
                                       }
                               }
                               flag1 = false;
                          } catch (Exception e) {
                                  System.out.println("\n\t\t" + r+ "~~~~~~~~~~~~~~~~~| Invalid Input Please Reenter |~~~~~~~~~~~~~~~~~"+ re+ "\n");
                                  s1.nextLine();
                                  flag1 = true;
                          }
                          } while (flag1);
                          Random randum = new Random();
                          long account = randum.nextLong(99999999l);
                          al.add(new Customer(name,password,address,dob,mobile,amount,account));
                  }
                  oos = new ObjectOutputStream(new FileOutputStream(file));
                  oos.writeObject(al);
                  oos.close();
                  System.out.println("\n\t\t" + y+ "*----------------Account Create Successfully----------------*"+ re+ "\n\n");
                  break;

                  case 2:
                      if (file.isFile()) {
                          ois = new ObjectInputStream(new FileInputStream(file));
                          al = (ArrayList<Customer>) ois.readObject();
                          ois.close();
                          li = al.listIterator();
                          System.out.println("\n\t\t\t" + y+ "            All Account Details                  "+ re);
                          while (li.hasNext()) {
                             System.out.println("\n\t\t\t" + y+ "================================================="+ re);
                             System.out.println(li.next());
                             System.out.println("\t\t\t" + y+ "================================================="+ re);
                          }
                          System.out.println("\n");
                      }
                      break;

                  case 3:
                     if (file.isFile()) {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Customer>) ois.readObject();
                        ois.close();
                        boolean found = false;
                        System.out.print("\n\t\t\t    Enter Customer Account Number : ");
                        long account = s1.nextLong();
                        li = al.listIterator();
                        while (li.hasNext()) {
                          Customer e = (Customer) li.next();
                          if (e.account == account) {
                            System.out.println("\n\t\t\t" + y+ "================================================="+ re);
                            System.out.println(e);
                            System.out.println("\t\t\t" + y+ "================================================="+ re);
                            found = true;
                          }
                        }
                        System.out.println("\n");
                        if (!found)
                            System.out.println("\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Record Not Found |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                     }
                     break;

                  case 4:
                   if (file.isFile()) {
                      ois = new ObjectInputStream(new FileInputStream(file));
                      al = (ArrayList<Customer>) ois.readObject();
                      ois.close();
                      boolean found = false;
                      System.out.print("\n\t\t\tEnter Account Number to Delete Account : ");
                      long account = s1.nextLong();
                      li = al.listIterator();
                      while (li.hasNext()) {
                           Customer e = (Customer) li.next();
                           if (e.account == account) {
                                   li.remove();
                                   found = true;
                           }
                      }
                      if (found) {
                           oos = new ObjectOutputStream(new FileOutputStream(file));
                           oos.writeObject(al);
                           oos.close();
                           System.out.println("\n\n\t\t" + y+ "*-----------| Record Blocked & Deleted Successfully |-----------*"+ re+ "\n\n");
                      } else {
                          System.out.println("\n\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Record Not Found |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                      }
                   }
                   break;

                  case 5:
                    if (file.isFile()) {
                      ois = new ObjectInputStream(new FileInputStream(file));
                      al = (ArrayList<Customer>) ois.readObject();
                      ois.close();
                      boolean found = false;
                      System.out.print("\n\t\tEnter Customer Account Number to Update Details : ");
                      long account = s1.nextLong();
                      li = al.listIterator();
                      while (li.hasNext()) {
                        Customer e = (Customer) li.next();
                        if (e.account == account) {
                          System.out.println("\n\n\t  " + W + bl+ "     Update Name       "+ re+ "    \t\t\t"+ W+ bl+ "  Update Date Of Birth  "+ re);
                          System.out.println("\t  " + W + bl+ "           1           "+ re+ "    \t\t\t"+ W+ bl+ "            3           "+ re+ "\n");
                          System.out.println("\t  " + W + bl + "    Update Address     "+ re+ "    \t\t\t"+ W+ bl+ "  Update Mobile Number  "+ re);
                          System.out.println("\t  " + W + bl+ "           2           "+ re+ "    \t\t\t"+ W+ bl+ "            4           "+ re+ "\n");
                          int n1 = s1.nextInt();
                          if (n1 == 1 || n1 == 2|| n1 == 3|| n1 == 4) {
                            switch (n1) {
                              case 1:
                                  System.out.print("\n\t\t\t\tEnter new Name : ");
                                  String name = s2.nextLine();
                                  li.set(new Customer(name, e.password, e.address, e.dob, e.mobile, e.amount, account));
                                  break;

                              case 2:
                                  System.out.print("\n\t\t\t\tEnter new Address : ");
                                  String address = s2.nextLine();
                                  li.set(new Customer(e.name, e.password, address, e.dob, e.mobile, e.amount, account));
                                  break;

                              case 3:
                                  System.out.print("\n\t\t\t\tEnter new Date Of Birth : ");
                                  String dob = s2.nextLine();
                                  li.set(new Customer(e.name,e.password,e.address,dob,e.mobile,e.amount,account));
                                  break;

                              case 4:
                                  System.out.print("\n\t\t\t\tEnter new Mobile Number : ");
                                  String mobile = s2.nextLine();
                                  li.set(new Customer(e.name,e.password,e.address,e.dob,mobile,e.amount,account));
                                  break;

                              default:
                                  break;

                            }
                            System.out.println("\n\n\t\t   " + y+ "*-----------| Record Updated Successfully |-----------*"+ re+ "\n\n");
                          } else {
                                  System.out.println("\n\t    " + r+ "~~~~~~~~~~~~~~~~~| Invalid Input Please Reenter |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                          }
                          found = true;
                        }
                      }
                      if (found) {
                              oos = new ObjectOutputStream(new FileOutputStream(file));
                              oos.writeObject(al);
                              oos.close();
                      } else {
                              System.out.println("\n\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Record Not Found |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                      }
                    }
                    break;

                  case 6:
                          System.out.println("\n\n\t\t\t" + y+ "*-----------| LogOut SuccessFully |-----------*"+ re+ "\n\n");
                          choice = 0;
                          break;

                  default:
                          break;

                  }
                  } else {
                          System.out.println("\n\t\t" + r+ "~~~~~~~~~~~~~~~~~| Invalid Input Please Reenter |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                  }
                } catch (Exception e) {
                        System.out.println("\n\t\t" + r+ "~~~~~~~~~~~~~~~~~| Something Went Wrong 4 |~~~~~~~~~~~~~~~~~"+ re + "\n\n");
                        s1.nextLine();
                }
                } while (choice != 0);
                } else {
                        System.out.println("\n\n" + r+ "\t\t~~~~~~~~~~~~~~~~| Invelid Login Information |~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                }
                break;

               case 2:
                System.out.println("\n\t" + y+ "**-------------Welcome User Plese Enter your Login Information-------------**"+ re + "\n");
                long ac1 = 0;
                String hn = "";
                int tm = 0;
                String dob2 = "";
                if (file.isFile()) {
                  ois = new ObjectInputStream(new FileInputStream(file));
                  al = (ArrayList<Customer>) ois.readObject();
                  ois.close();
                  boolean found = false;
                  System.out.print("\n\t\t\t\tEnter User Login ID : ");
                  String name = s2.nextLine();
                  System.out.print("\n\t\t\t\tEnter Login password : ");
                  String Password = s2.nextLine();
                  li = al.listIterator();
                  while (li.hasNext()) {
                    Customer e = (Customer) li.next();
                    if (e.name.equals(name) && e.password.equals(Password)) {
                      System.out.println("\n\t\t\t"+ y+ "*-----------Login SuccessFully-----------*"+ re + "\n");
                      ac1 = e.account;
                      hn = e.name;
                      dob2 = e.dob;
                      boolean flag3 = true;
                      while (flag3) {
                        try {
                          if (file.isFile()) {
                            ois = new ObjectInputStream(new FileInputStream(file));
                            al = (ArrayList<Customer>) ois.readObject();
                            ois.close();
                            boolean found1 = false;
                            li = al.listIterator();
                            while (li.hasNext()) {
                              e = (Customer) li.next();
                              if (e.name.equals(name)&& e.password.equals(Password)) {
                                tm = e.amount;
                                System.out.println("\n\t" + W + bl + "   View Account Details    " + re + "    \t\t\t" + W + bl + "         Update            " + re);
                                System.out.println("\t" + W + bl + "             1             " + re + "    \t\t\t" + W + bl + "            5              " + re + "\n");
                                System.out.println("\t" + W + bl + "      Deposit Amount       " + re + "    \t\t\t" + W + bl + "      Apply for loan       " + re);
                                System.out.println("\t" + W + bl + "             2             " + re + "    \t\t\t" + W + bl + "            6              " + re+ "\n");
                                System.out.println("\t" + W + bl + "      Transfer Money       " + re + "    \t\t\t" + W + bl + "    View loan Statement    " + re);
                                System.out.println("\t" + W + bl + "             3             " + re + "    \t\t\t" + W + bl + "            7              " + re+ "\n");
                                System.out.println("\t" + W + bl + "    Transaction History    " + re + "    \t\t\t" + W + bl + "          LogOut           " + re);
                                System.out.println("\t" + W + bl + "             4             " + re + "    \t\t\t" + W + bl + "            8              " + re+ "\n");
                                int n1 = s1.nextInt();
                                if (n1 == 1 || n1 == 2|| n1 == 3|| n1 == 4|| n1 == 5|| n1 == 6|| n1 == 7|| n1 == 8) {
                                  switch (n1) {
                                    case 1:
                                      System.out.println("\t\t\t" + y+ "              Account Details                    "+ re);
                                      System.out.println("\t\t\t" + y+ "================================================="+ re);
                                      System.out.println(e);
                                      System.out.println("\t\t\t" + y+ "================================================="+ re);
                                      break;

                                    case 2:
                                      System.out.print("\n\t\t\t\tEnter Deposit Amount : ");
                                      int addamount = s1.nextInt();
                                      int amount = e.amount+ addamount;
                                      li.set(new Customer(e.name,e.password,e.address,e.dob,e.mobile,amount,e.account));
                                      System.out.println("\n\n\t\t\t" + y+ "*-----------| Deposit Successfully |-----------*"+ re+ "\n\n");
                                      break;

                                    case 3:
                                      long haccount = 0;
                                      int hamount = 0;
                                      int total = 0;
                                      int am = 0;
                                      boolean his = false;
                                      if (file.isFile()) {
                                        ois = new ObjectInputStream(new FileInputStream(file));
                                        al = (ArrayList<Customer>) ois.readObject();
                                        ois.close();
                                        boolean found2 = false;
                                        System.out.print("\n\t\tEnter Customer Account Number to Transfer Money : ");
                                        long account2 = s1.nextLong();
                                        haccount = account2;
                                        li = al.listIterator();
                                        while (li.hasNext()) {
                                          Customer e1 = (Customer) li.next();
                                          if (e1.account == account2) {
                                            System.out.print("\n\t\t\t\tEnter Amount : ");
                                            int amount2 = s1.nextInt();
                                            hamount = amount2;
                                            if (tm > amount2) {
                                              am = amount2;
                                              int amount3 = e1.amount+ amount2;
                                              li.set(new Customer(e1.name,e1.password,e1.address,e1.dob,e1.mobile,amount3,e1.account));
                                              his = true;
                                              System.out.println("\n\n\t\t\t" + y+ "*-----------| Transfer Successfully |-----------*"+ re+ "\n\n");
                                            } else {
                                              System.out.println("\n\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Insufficient Balance |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                                            }
                                            found2 = true;
                                          }
                                        }
                                        if (found2) {
                                           oos = new ObjectOutputStream(new FileOutputStream(file));
                                           oos.writeObject(al);
                                           oos.close();
                                        } else {
                                           System.out.println("\n\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Record Not Found |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                                        }
                                      }
                                      if (file.isFile()) {
                                        ois = new ObjectInputStream(new FileInputStream(file));
                                        al = (ArrayList<Customer>) ois.readObject();
                                        ois.close();
                                        boolean found3 = false;
                                        long account3 = ac1;
                                        li = al.listIterator();
                                        while (li.hasNext()) {
                                          Customer e2 = (Customer) li.next();
                                          if (e2.account == account3) {
                                            int amount4 = am;
                                            if (tm > amount4) {
                                               int amount5 = tm - amount4;
                                               total = amount5;
                                               li.set(new Customer(e2.name,e2.password,e2.address,e2.dob,e2.mobile,amount5,e2.account));
                                               found3 = true;
                                            }
                                          }
                                        }
                                        if (found3) {
                                          oos = new ObjectOutputStream(new FileOutputStream(file));
                                          oos.writeObject(al);
                                          oos.close();
                                        }
                                      }
                                      if (his) {
                                        Date currentDate = new Date();
                                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
                                        String date = dateFormat.format(currentDate);
                                        al2.add(new History(date,ac1,haccount,hamount,total));
                                        oos2 = new ObjectOutputStream(new FileOutputStream(file2));
                                        oos2.writeObject(al2);
                                        oos2.close();
                                      }
                                      break;

                                    case 4:
                                      if (file2.isFile()) {
                                        ois2 = new ObjectInputStream(new FileInputStream(file2));
                                        al2 = (ArrayList<History>) ois2.readObject();
                                        ois2.close();
                                        boolean found4 = false;
                                        li2 = al2.listIterator();
                                        System.out.println("\n" + y+ "                                       Transaction History                                        "+ re);
                                        System.out.println("\n" + y+ "============================================================================================================="+ re);
                                        System.out.println(b+ "       Date               Transferred by       Transferred To       Deposit/Creadit       Total"+ re);
                                        System.out.println("\n" + y+ "============================================================================================================="+ re);
                                        while (li2.hasNext()) {
                                          History e3 = (History) li2.next();
                                          if (e3.name == ac1) {
                                                  System.out.println(e3);
                                                  found4 = true;
                                          }
                                        }
                                        System.out.println("" + y+ "============================================================================================================="+ re);
                                        System.out.println("\n");
                                        if (!found4)
                                           System.out.println("\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Record Not Found |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                                      } else {
                                          System.out.println("\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Record Not Found |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                                      }
                                      break;

                                    case 5:
                                        System.out.println("\n\t\t\t\t" + r+ "Admin can Update your Details\n\n"+ re);
                                        flag3 = false;
                                        break;

                                    case 6:
                                        Date currentDate2 = new Date();
                                        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
                                        String date2 = dateFormat2.format(currentDate2);
                                        System.out.print("\n\t\t\tEnter Aadhar Card Number            : ");
                                        String aadhar = s2.nextLine();
                                        System.out.print("\n\t\t\tEnter Pain Card Number              : ");
                                        String pain = s2.nextLine();
                                        System.out.print("\n\t\t\tEnter Loan Amount                   : ");
                                        int loan = s1.nextInt();
                                        al3.add(new Loan(hn,tm+loan,date2,loan,ac1,dob2,aadhar,pain));
                                        oos3 = new ObjectOutputStream(new FileOutputStream(file3));
                                        oos3.writeObject(al3);
                                        oos3.close();
                                        int addamount6 = loan;
                                        int amount6 = e.amount+ addamount6;
                                        li.set(new Customer(e.name,e.password,e.address,e.dob,e.mobile,amount6,e.account));
                                        System.out.println( "\n\t\t" + y + "*----------------| Loan Approved Successfully |----------------*" + re + "\n\n");
                                      break;

                                    case 7:
                                        if (file3.isFile()) {
                                          ois3 = new ObjectInputStream(new FileInputStream(file3));
                                          al3 = (ArrayList<Loan>) ois3.readObject();
                                          ois3.close();
                                          boolean found5 = false;
                                          long account5 = 0;
                                          account5 = ac1;
                                          li3 = al3.listIterator();
                                          System.out.println("\n\t\t\t" + y + "              Loan Statement" + re);
                                          while (li3.hasNext()) {
                                            Loan e5 = (Loan) li3.next();
                                            if (e5.account == account5) {
                                               System.out.println("\n\t\t\t" + y + "=================================================" + re);
                                               System.out.println(e5);
                                               System.out.println("\t\t\t" + y + "================================================="+ re);
                                               found5 = true;
                                            }
                                          }
                                          System.out.println("\n");
                                          if (!found5)
                                                System.out.println("\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Record Not Found |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                                        } else {
                                                System.out.println("\n\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Record Not Found |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                                        }
                                        break;

                                    case 8:
                                        System.out.println("\n\n\t\t\t" + y+ "*-----------| LogOut SuccessFully |-----------*"+ re+ "\n\n");
                                        flag3 = false;
                                        break;

                                    default:
                                        break;

                                  }
                                } else {
                                        System.out.println("\n\t    " + r+ "~~~~~~~~~~~~~~~~~| Invalid Input Please Reenter |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                                }
                                found1 = true;
                              }
                            }
                            if (found1) {
                                    oos = new ObjectOutputStream(new FileOutputStream(file));
                                    oos.writeObject(al);
                                    oos.close();
                            } else {
                                    System.out.println("\n\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Record Not Found |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                            }
                          }
                        } catch (Exception err) {
                                System.out.println("\n\t    " + r+ "~~~~~~~~~~~~~~~~~| Something Went Wrong 3 |~~~~~~~~~~~~~~~~~"+ re+ "\n\n");
                                s1.nextLine();
                        }
                      }
                      found = true;
                    }
                  }
                  if (!found)
                          System.out.println("\n" + r+ "\t\t~~~~~~~~~~~~~~~~| Invelid Login Information |~~~~~~~~~~~~~~~~"+ re + "\n\n");
                } else {
                        System.out.println("\n\n\t\t  " + r+ "~~~~~~~~~~~~~~~~~| Record Not Found |~~~~~~~~~~~~~~~~~"+ re + "\n\n");
                }
                break;

               case 3:
                       flag2 = false;
                       break;

               default:
                       break;

            }
            } else {
                    System.out.println("\n\t\t" + r+ "~~~~~~~~~~~~~~~~~| Invalid Input Please Reenter |~~~~~~~~~~~~~~~~~"+ re + "\n\n");
            }
    } catch (Exception e) {
            System.out.println("\n\t\t" + r+ "~~~~~~~~~~~~~~~~~| Something Went Wrong 2 |~~~~~~~~~~~~~~~~~"+ re + "\n\n");
            s1.nextLine();
    }
            }
            System.out.println("\n\t" + y+ "**-------------------THANKYOU FOR USING BANKING APPLICATION-------------------**"+ re + "\n");
    } catch (Exception e) {
            String re = "\u001B[0m", r = "\u001B[31m";
            System.out.println("\n\t\t" + r+ "~~~~~~~~~~~~~~~~~| Something Went Wrong 1 |~~~~~~~~~~~~~~~~~"+ re + "\n\n");
    }
  }
}