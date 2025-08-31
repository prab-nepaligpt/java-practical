import java.sql.*;

public class Lab19 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "prabesh";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            // Create scrollable ResultSet
            Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            );

            ResultSet rs = stmt.executeQuery("SELECT * FROM MOVIE");

            // Navigate to last row
            if (rs.last()) {
                System.out.println("Last Row:");
                System.out.println(rs.getInt("id") + " " + rs.getString("title") + " " + rs.getString("genre"));
            }

            // Navigate to first row
            if (rs.first()) {
                System.out.println("\nFirst Row:");
                System.out.println(rs.getInt("id") + " " + rs.getString("title") + " " + rs.getString("genre"));
            }

            // Navigate to third row
            if (rs.absolute(3)) {
                System.out.println("\nThird Row:");
                System.out.println(rs.getInt("id") + " " + rs.getString("title") + " " + rs.getString("genre"));
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
