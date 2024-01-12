import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class IO12 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/rajth/OneDrive/Desktop/ABC.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Test obj = (Test) ois.readObject();

            System.out.println(obj.getName() + " " + obj.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
