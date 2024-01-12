import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Test implements Serializable {
    private static final long SerialVersionUID = 15l;

    private String s;
    private int a;

    public Test(String s, int a) {

    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

public class AS2 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {

            try {
                File f = new File("C:/Users/rajth/OneDrive/Desktop/FileHandl.txt");
                Scanner sc = new Scanner(System.in);
                System.out.println("Press-1 to write data in the file ");
                System.out.println("Press-2 to read data in the file");
                System.out.println("Press-3 exit");
                byte b = sc.nextByte();
                switch (b) {
                    case 1:
                        Test obj[] = new Test[2];
                        for (int i = 0; i < obj.length; i++) {
                            System.out.println("Enter name : ");
                            sc.nextLine();
                            String name = sc.nextLine();
                            System.out.println("Enter age : ");
                            int age = sc.nextInt();
                            obj[i] = new Test(name, age);

                            FileOutputStream fo = new FileOutputStream(f);
                            ObjectOutputStream os = new ObjectOutputStream(fo);
                            os.writeObject(obj[i]);
                            System.out.println("Success full write in the file");
                        }
                        break;

                    case 2:
                        FileInputStream fis = new FileInputStream(f);
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        Test obj1[] = new Test[2];
                        for (int i = 0; i < obj1.length; i++) {
                            obj1[i] = (Test) ois.readObject();
                            System.out.println(obj1[i].getS() + "\t" + obj1[i].getA());
                        }
                        break;

                    case 3:
                        flag = false;
                        break;

                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }
    }
}
