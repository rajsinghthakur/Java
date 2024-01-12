import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDAO {
    public static int insert(Product p) {
        Connection con = null;
        int x = -1;
        try {
            con = DatabaseConnector.getConnection();
            // 1,2,3
            String sql = "insert into product(product_name,price,brand) values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getName());
            ps.setInt(2, p.getPrice());
            ps.setString(3, p.getBrand());

            x = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return x;
    }

    public static void delete(int id) {
        Scanner sc = new Scanner(System.in);

        Connection con = DatabaseConnector.getConnection();

        System.out.println("Enter Id to delete the data :");
        id = sc.nextInt();

        String sql = "delete from product where id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void update(Product p) {

    }

    public static void getList() {

    }
}
