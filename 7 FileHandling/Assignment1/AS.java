import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AS {
    public static void main(String[] args) {
        try {
            File f = new File("C:/Users/rajth/OneDrive/Desktop/FileHandl.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Test obj[] = new Test[2];
            for (int i = 0; i < obj.length; i++) {
                obj[i] = (Test) ois.readObject();
                System.out.println(obj[i].getS() + "\t" + obj[i].getA());
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
