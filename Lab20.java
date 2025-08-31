import java.sql.*;

public class Lab20 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "prabesh";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            // Create updatable ResultSet
            Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );

            ResultSet rs = stmt.executeQuery("SELECT * FROM MOVIE");

            while (rs.next()) {
                if (rs.getString("title").equalsIgnoreCase("interstellar")) {
                    rs.updateString("genre", "Fiction");
                    rs.updateRow();
                    System.out.println("✅ Updated genre of 'Interstellar' to Fiction.");
                }
            }

            // Display all rows
            rs.beforeFirst();
            System.out.println("\nUpdated MOVIE Table:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                                   rs.getString("title") + " " +
                                   rs.getString("genre"));
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
