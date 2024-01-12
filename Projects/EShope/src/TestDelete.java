import java.util.Scanner;

public class TestDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Id to delete the data :");
        int id = sc.nextInt();

        Product p = new Product(id);

        if (ProductDAO.insert(p) != -1)
            System.out.println("Record Deleted.....");
        else
            System.out.println("Record not Deleted.....");

    }
}
