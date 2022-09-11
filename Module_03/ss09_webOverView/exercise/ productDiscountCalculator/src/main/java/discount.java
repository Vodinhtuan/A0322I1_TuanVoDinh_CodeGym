import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "discount", value = "/discount")
public class discount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("des");
        double price = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("discount"));

        double discountAmount = price * percent * 0.01;
        double discountPrice = price * discountAmount;

        request.setAttribute("discountAmount", "Discount Amount: "+discountAmount);
        request.setAttribute("discountPrice", "Discount Price: "+discountPrice);
        request.setAttribute("descreption", "Name product: "+product);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
