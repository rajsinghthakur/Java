import java.io.File;
import java.io.FileInputStream;

public class AS5 {
    public static void main(String[] args) {
        String data = "";
        try {
            File obj = new File("C:/Users/rajth/OneDrive/Desktop/FileHandling.txt");
            FileInputStream fi = new FileInputStream(obj);
            int i;
            while ((i = fi.read()) != -1) {
                data = data + (char) i;
            }
            System.out.println(data);
            String s1[] = data.split(" ");
            System.out.println("Count words : " + s1.length);

        } catch (Exception e) {
            System.out.println("An error occurred. ");
            e.printStackTrace();
        }
    }
}
