import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="CorrectServlet", urlPatterns = "/correct")
public class CorrectServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("number"));
        request.setAttribute("number", num);
        request.setAttribute("message", "You win!");
        request.getRequestDispatcher("/outcome.jsp").forward(request, response);

    }
}
