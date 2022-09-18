package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalServlet", value = "/CalServlet")
public class CalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operator = request.getParameter("operator");
        double first = Double.parseDouble(request.getParameter("first"));
        double second = Double.parseDouble(request.getParameter("second"));
        double result = 0;

        switch (operator){
            case "+":
                result= first+second;
                break;
            case "-":
                result= first-second;
                break;
            case "*":
                result= first*second;
                break;
            case "/":
                result= first/second;
                break;
        }

        request.setAttribute("result","Result is "+result);
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
