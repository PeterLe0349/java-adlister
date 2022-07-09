import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


@WebServlet(name="TestSqlServlet", urlPatterns = "/testsql")
public class TestSqlServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        try {

             String url = "jdbc:mysql://localhost:3306/codeup_test_db";
             String username = "root";
             String password = "codeup";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement statement = con.createStatement();
            statement.executeUpdate("INSERT INTO albums (artist, album_name, release_date, genre, sales) VALUES('Ne123lly adfFurtado', 'Lasdf123oose', 2006, 'Daad123fnce-pop, hi213dp hop, R&a123dfB', 12.5)");





        }catch(Exception e){
            e.printStackTrace();
        }
    }



}
