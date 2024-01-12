import java.io.File;

public class IO {
    public static void main(String[] args) {
        File obj = new File("C:/Users/rajth/OneDrive/Desktop/kuchbhi.txt");
        if (obj.exists()) {
            System.out.println(obj.getName());
            System.out.println(obj.getAbsolutePath());
            System.out.println(obj.length());
        } else {
            System.out.println("file does note exsist");
        }
    }
}
