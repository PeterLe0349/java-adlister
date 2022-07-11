import com.mysql.jdbc.Driver;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


@WebServlet(name="TestSqlServlet", urlPatterns = "/test")
public class TestSqlServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            String selectQuery = "SELECT * FROM albums";

            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                System.out.println("Here's an album:");
                System.out.println("  id: " + rs.getLong("id"));
                System.out.println("  artist: " + rs.getString("artist"));
                System.out.println("  name: " + rs.getString("name"));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        try {
            Connection con = LoginDao.makeCon();
        }catch(Exception e){
            e.printStackTrace();
        }
    }



}
