import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.isNew()){
            session.setAttribute("user", false);
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }else{
            if(session.getAttribute("user") == null){
                session.setAttribute("user", false);
                request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }else{
                if((boolean)session.getAttribute("user") == true){
                    request.getRequestDispatcher("/profile").forward(request, response);
                }else{
                    request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
                }

            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");
        HttpSession session = request.getSession();
        if (validAttempt) {
            session.setAttribute("user", true);
            request.getRequestDispatcher("/profile").forward(request, response);
//            response.sendRedirect("/profile");
        } else {
            session.setAttribute("user", false);
            response.sendRedirect("/login");
        }
    }
}
