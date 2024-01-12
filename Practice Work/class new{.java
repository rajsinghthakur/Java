import java.io.*;
import java.util.*;

class main implements Serializable {
    String name;
    String age;
    String mobile;

    public main(String name, String age, String mobile) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public String toString() {
        return name + "\t" + age + "\t" + mobile;
    }
}

class n12 {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);

            File file = new File("C:/Users/rajth/OneDrive/Desktop/Raj.txt");
            ArrayList<main> al = new ArrayList<main>();
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            ListIterator li = null;

            if (file.isFile()) {
                    ois = new ObjectInputStream(new FileInputStream(file));
                    al = (ArrayList<main>) ois.readObject();
                    ois.close();
            }

            System.out.println("name");
            String name = sc.nextLine();

            System.out.println("age");
            String age = sc.nextLine();

            System.out.println("mobile");
            String mobile = sc.nextLine();

            al.add(new main(name, age, mobile));
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(al);
            oos.close();
            System.out.println("read data");

            li = al.listIterator();
            while (li.hasNext()) {
                System.out.println(li.next());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}