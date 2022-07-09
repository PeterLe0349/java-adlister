import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

    static String url = "jdbc:mysql://localhost:3306/codeup_test_db";
    static String username = "root";
    static String password = "codeup";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Statement statement = con.createStatement();
        statement.executeUpdate("INSERT INTO albums (artist, album_name, release_date, genre, sales) VALUES('Nelly Furadftado', 'Lasdfoose', 2006, 'Danceadf-pop, hiasdfp hop, R&adsfB', 12.5)");
    }

}
