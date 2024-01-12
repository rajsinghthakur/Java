import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AS8 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/rajth/OneDrive/Desktop/Shopping.dat");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Shopping obj = (Shopping) ois.readObject();

            System.out.println(obj.getId() + "  " + obj.getItemName() + " " + obj.getPrice() + " " + obj.getQuntity());
            int totalamount = obj.getPrice() * obj.getQuntity();
            System.out.println("Total money    : " + totalamount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}