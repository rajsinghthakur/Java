import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Shopping implements Serializable {
    private static final long SerialVersionUID = 11l;
    private int id;
    private String itemname;
    private int price;
    private int quantit;

    public Shopping(int id, String itemname, int price, int quantity) {
        this.id = id;
        this.itemname = itemname;
        this.price = price;
        this.quantit = quantity;
    }

    public Shopping() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemname;
    }

    public void setItemName(String itemname) {
        this.itemname = itemname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuntity() {
        return quantit;
    }

    public void setQuantity(int quantit) {
        this.quantit = quantit;
    }
}

public class AS7 {
    public static void main(String[] args) {
        try {
            File f = new File("C:/Users/rajth/OneDrive/Desktop/Shopping.dat");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Shopping c = new Shopping(3, "raj", 20000, 4);
            oos.writeObject(c);
            System.out.println("Operation success...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}