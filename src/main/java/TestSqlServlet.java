import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



@WebServlet(name="TestSqlServlet", urlPatterns = "/test")
public class TestSqlServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            Connection con = LoginDao.makeCon();

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
