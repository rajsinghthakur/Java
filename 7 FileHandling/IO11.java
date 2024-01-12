import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable {
    private static final long SerialVersionUID = 20l;
    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class IO11 {
    public static void main(String[] args) {
        try {
            File f = new File("C:/Users/rajth/OneDrive/Desktop/ABC.txt");
            FileOutputStream fis = new FileOutputStream(f);
            ObjectOutputStream ois = new ObjectOutputStream(fis);

            Test obj = new Test("raj", 21);

            ois.writeObject(obj);
            ois.close();

            System.out.println("Successfull write");
        } catch (Exception e) {

            System.out.println(e);
        }

    }
}
