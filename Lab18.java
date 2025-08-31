import java.sql.*;

public class Lab18 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
String user = "prabesh";
String password = "1234";


        try {
            // Load driver (optional in newer versions of JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            // a) Insert 3 records
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO MOVIE VALUES(1, 'Jatra', 'Drama')");
            stmt.executeUpdate("INSERT INTO MOVIE VALUES(2, 'Interstellar', 'Sci-Fi')");
            stmt.executeUpdate("INSERT INTO MOVIE VALUES(3, 'Kabbadi', 'Romance')");
            System.out.println("✅ 3 records inserted successfully.");

            // b) Update genre of movie with title 'Jatra' to Comedy using PreparedStatement
            String updateQuery = "UPDATE MOVIE SET genre=? WHERE title=?";
            PreparedStatement pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, "Comedy");
            pstmt.setString(2, "Jatra");

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Genre updated to Comedy for title Jatra.");
            }

            // Close resources
            pstmt.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
