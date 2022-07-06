import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/guess.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int num = Integer.parseInt(request.getParameter("number"));
        request.setAttribute("number", num);
        System.out.println(num);
        if(num==3){
            request.getRequestDispatcher("/correct").forward(request, response);
        }else {
            request.getRequestDispatcher("/incorrect").forward(request, response);
        }
    }
}
