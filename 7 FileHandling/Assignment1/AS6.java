import java.io.File;

public class AS6 {
    public static void main(String[] args) {
        try {
            File f = new File("C:/Users/rajth/OneDrive/Desktop/Image.docx");
            long lon = f.length();
            System.out.println("File Size: " + lon + " bytes");
            double uploadSpeedBps = 256.0;
            double fileSizeBits = lon * 8.0;
            double uploadTimeSeconds = fileSizeBits / uploadSpeedBps;
            System.out.println("internet speed : " + uploadTimeSeconds + " seconds");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
