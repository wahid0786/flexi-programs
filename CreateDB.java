
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/s22";
        String user = "root";
        String password = "786786";  // your mysql password

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection using try-with-resources
            try (Connection con = DriverManager.getConnection(url, user, password); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM s2")) {

                System.out.println("Connected to MySQL Database!");

                // Display Data
                while (rs.next()) {
                    int prn = rs.getInt("prn");
                    String name = rs.getString("name");

                    System.out.println(prn + " " + name + " ");
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found: " + e);
        } catch (SQLException e) {
            System.out.println("Database error: " + e);
        }
    }

}
