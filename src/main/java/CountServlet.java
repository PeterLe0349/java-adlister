import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    int counter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        counter++;
        String count = request.getParameter("count");
        PrintWriter out = response.getWriter();
        if(count == null || count.equals("")){
            out.printf("Page view count: %d", counter);
        }else if(count.equals("0")){
            counter = 0;
            out.printf("Page view count: %d", counter);
        }else {
            out.printf("Page view count: %d", counter);
        }
    }

}