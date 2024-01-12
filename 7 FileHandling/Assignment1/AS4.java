import java.io.File;
import java.io.FileReader;

public class AS4 {
    public static void main(String[] args) {
        try {
            File obj = new File("C:/Users/rajth/OneDrive/Desktop/FileHandling.txt");
            FileReader fr = new FileReader(obj);
            String data = "";
            while (true) {
                int x = fr.read();
                if (x == -1)
                    break;
                data = data + (char) x;
            }
            System.out.println(data);
            char c[] = data.toCharArray();
            int count = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 't' || c[i] == 'T') {
                    count++;
                }
            }
            System.out.println("Count of T : " + count);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
