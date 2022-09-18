package controller;

import model.Product;
import service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String error = null;
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String producer = request.getParameter("producer");
        double price = Double.parseDouble(request.getParameter("price"));

        try {
            ProductService.
        } catch (Exception e) {
            error = e.getMessage();
        }
        if(error == null){
            response.sendRedirect("/product");
        }else{
            request.setAttribute("error",error);
            request.getRequestDispatcher("WEB-INF/views/products/update.jsp").forward(request,response);
        };
    }
    private void createNewProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String error = null;
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String producer = request.getParameter("producer");
        double price = Double.parseDouble(request.getParameter("price"));

        try {
            ProductService.(new Product(id,name,price,description,producer));
        } catch (Exception e) {
            error = e.getMessage();
        }

        if(error == null){
            response.sendRedirect("/product");
        }else{
            request.setAttribute("error",error);
            request.getRequestDispatcher("WEB-INF/views/products/create.jsp").forward(request,response);
        }
    }

}
