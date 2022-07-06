import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;


@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.getWriter().println("<h1>Hello, World!</h1>");
        //
        response.sendRedirect("/pizza.jsp");
//        request.getRequestDispatcher("/pizza.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Postprocess request: gather and validate submitted data and display the result in the same JSP.
        String crust = request.getParameter("crust");
        String size = request.getParameter("size");
        String sauce = request.getParameter("sauce");
        String address = request.getParameter("address");
        String[] topping = request.getParameterValues("topping");
        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(size);
        response.getWriter().println(crust);
        response.getWriter().println(size);
        response.getWriter().println(sauce);
        response.getWriter().println(address);
        response.getWriter().println(Arrays.toString(topping));
//        request.getRequestDispatcher("/pizza.jsp").forward(request, response);
    }
}