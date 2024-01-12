import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Employee implements Serializable {
    int empno;
    String ename;
    int salary;

    public Employee(int empno, String ename, int salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return empno + " " + ename + " " + salary;
    }
}

class new1 {
    public static void main(String[] args) {
        try {
            int choice = -1;
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);
            File file = new File("C:/Users/rajth/OneDrive/Desktop/FileHandl.txt");
            ArrayList<Employee> al = new ArrayList<Employee>();
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            ListIterator li = null;

            if (file.isFile()) {
                ois = new ObjectInputStream(new FileInputStream(file));
                al = (ArrayList<Employee>) ois.readObject();
                ois.close();
            }

            do {
                System.out.println("Press-1 Create new customer account" + "\n"
                        + "Press-2 View all account list" + "\n"
                        + "Press-3 View particular account information" + "\n"
                        + "Press-4 Remove/Block account" + "\n"
                        + "Press-5 Manage customer account" + "\n"
                        + "Press-0 Exit");
                choice = s.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter how many employees you want : ");
                        int n = s.nextInt();

                        for (int i = 0; i < n; i++) {

                            System.out.print("Enter Employee No : ");
                            int empno = s.nextInt();

                            System.out.print("Enter Employee Name : ");
                            String ename = s1.nextLine();

                            System.out.print("Enter Employee Salary : ");
                            int salary = s.nextInt();

                            al.add(new Employee(empno, ename, salary));
                        }
                        oos = new ObjectOutputStream(new FileOutputStream(file));
                        oos.writeObject(al);
                        oos.close();
                        break;

                    case 2:
                        if (file.isFile()) {
                            ois = new ObjectInputStream(new FileInputStream(file));
                            al = (ArrayList<Employee>) ois.readObject();
                            ois.close();

                            System.out.println("--------------------------------");
                            li = al.listIterator();
                            while (li.hasNext())
                                System.out.println(li.next());
                            System.out.println("--------------------------------");
                        } else {
                            System.out.println("File not Exists...... ..!");
                        }
                        break;

                    case 3:
                        if (file.isFile()) {
                            ois = new ObjectInputStream(new FileInputStream(file));
                            al = (ArrayList<Employee>) ois.readObject();
                            ois.close();

                            boolean found = false;
                            System.out.println("Enter empno to search : ");
                            int empno = s.nextInt();
                            System.out.println("--------------------------------");
                            li = al.listIterator();
                            while (li.hasNext()) {
                                Employee e = (Employee) li.next();
                                if (e.empno == empno) {
                                    System.out.println(e);
                                    found = true;
                                }
                            }
                            if (!found)
                                System.out.println("Record not found.........!");
                            System.out.println("--------------------------------");
                        } else {
                            System.out.println("File not Exists...... ..!");
                        }
                        break;
                    case 4:
                        if (file.isFile()) {
                            ois = new ObjectInputStream(new FileInputStream(file));
                            al = (ArrayList<Employee>) ois.readObject();
                            ois.close();

                            boolean found = false;
                            System.out.print("Enter empno to Delete : ");
                            int empno = s.nextInt();
                            System.out.println("--------------------------------");
                            li = al.listIterator();
                            while (li.hasNext()) {
                                Employee e = (Employee) li.next();
                                if (e.empno == empno) {
                                    li.remove();
                                    found = true;
                                }
                            }
                            if (found) {
                                oos = new ObjectOutputStream(new FileOutputStream(file));
                                oos.writeObject(al);
                                oos.close();
                                System.out.println("Record Deleted Successfully.....!");
                            } else {
                                System.out.println("Record not found.........!");
                            }

                            System.out.println("--------------------------------");
                        } else {
                            System.out.println("File not Exists...... ..!");
                        }
                        break;
                    case 5:
                        if (file.isFile()) {
                            ois = new ObjectInputStream(new FileInputStream(file));
                            al = (ArrayList<Employee>) ois.readObject();
                            ois.close();

                            boolean found = false;
                            System.out.print("Enter empno to Update : ");
                            int empno = s.nextInt();
                            System.out.println("--------------------------------");
                            li = al.listIterator();
                            while (li.hasNext()) {
                                Employee e = (Employee) li.next();
                                if (e.empno == empno) {
                                    System.out.print("Enter New EmpName");
                                    String ename = s1.nextLine();

                                    System.out.print("Enter New Salary");
                                    int sal = s.nextInt();

                                    li.set(new Employee(empno, ename, sal));
                                    found = true;
                                }
                            }
                            if (found) {
                                oos = new ObjectOutputStream(new FileOutputStream(file));
                                oos.writeObject(al);
                                oos.close();
                                System.out.println("Record Updated Successfully.....!");
                            } else {
                                System.out.println("Record not found.........!");
                            }

                            System.out.println("--------------------------------");
                        } else {
                            System.out.println("File not Exists...... ..!");
                        }
                        break;
                    default:
                        break;
                }
            } while (choice != 0);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

}