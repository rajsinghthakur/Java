import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.sound.midi.Soundbank;

public class IO9 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/rajth/OneDrive/Desktop/ABC.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Customer obj = (Customer) ois.readObject();

            System.out.println(obj.getName());

            System.out.println(obj.getId() * obj.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}