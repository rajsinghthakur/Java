import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    private static final String url = "jdbc:mysql://localhost:3306/shope";
    private static final String username = "root";
    private static final String password = "Raj@882714";
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}