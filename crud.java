
import java.sql.*;

public class crud {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/s22";
        String user = "root";
        String password = "786786";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM s22");
            while (rs.next()) {
                int prn = rs.getInt("prn");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println(prn + " " + name + " " + marks);
            }

            // INSERT
            String insertQuery = "INSERT INTO s22 (prn, name, marks) VALUES (?,?,?)";
            PreparedStatement ps1 = con.prepareStatement(insertQuery);
            ps1.setInt(1, 102);
            ps1.setString(2, "Amit");
            ps1.setInt(3, 88);
            ps1.executeUpdate();

            CallableStatement cs = con.prepareCall("{CALL inserts2(?, ?, ?)}");

            cs.setInt(1, 102);
            cs.setString(2, "Amit");
            cs.setInt(3, 88);
            cs.execute();

            System.out.println("Updated Table after INSERT query:");
            rs = stmt.executeQuery("SELECT * FROM s22");
            while (rs.next()) {
                int prn = rs.getInt("prn");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println(prn + " " + name + " " + marks);
            }

            // UPDATE
            String updateQuery = "UPDATE s22 SET marks=? WHERE prn=?";
            PreparedStatement ps2 = con.prepareStatement(updateQuery);
            ps2.setInt(1, 95);
            ps2.setInt(2, 102);
            ps2.executeUpdate();

            System.out.println("Updated Table aftre UPDATE query:");
            rs = stmt.executeQuery("SELECT * FROM s22");
            while (rs.next()) {
                int prn = rs.getInt("prn");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println(prn + " " + name + " " + marks);
            }

            // DELETE
            String deleteQuery = "DELETE FROM s22 WHERE prn=?";
            PreparedStatement ps3 = con.prepareStatement(deleteQuery);
            ps3.setInt(1, 102);
            ps3.executeUpdate();
            System.out.println("Updated Table aftre DELETE query:");
            rs = stmt.executeQuery("SELECT * FROM s22");
            while (rs.next()) {
                int prn = rs.getInt("prn");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println(prn + " " + name + " " + marks);
            }

            con.close();
            System.out.println("CRUD operations done!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
