import java.sql.*;

public class LoginDao {

    static Connection con;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            makeCon();
        String selectQuery = "SELECT * FROM ads";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(selectQuery);

        while (rs.next()) {
            System.out.println("Here's an ad:");
            System.out.println("  id: " + rs.getLong("user_id"));
            System.out.println("  title: " + rs.getString("title"));
            System.out.println("  description: " + rs.getString("description"));
        }
    }

    public static Connection makeCon() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Config config = new Config();
        String url = config.getUrl();
        String username = config.getUser();
        String password = config.getPassword();
        con = DriverManager.getConnection(url,username,password);
//        Statement statement = con.createStatement();
//        statement.executeUpdate("INSERT INTO albums (artist, album_name, release_date, genre, sales) VALUES('54332Ace12321qw3 of Base', '542Pyqwra212323mid', 2001, '2P123223op', 14.5)");
        return con;
    }

}
