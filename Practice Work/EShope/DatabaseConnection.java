import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopdb?useSSL=false", "root", "Raj@882714");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}