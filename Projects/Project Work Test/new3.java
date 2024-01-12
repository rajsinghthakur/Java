import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class new3 {
    public static void main(String[] args) {
        try {
            File f = new File("C:/Users/rajth/OneDrive/Desktop/User.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            for (int i = 0; i < 8; i++) {
                new1 n = (new1) ois.readObject();
                System.out.println(n);
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}