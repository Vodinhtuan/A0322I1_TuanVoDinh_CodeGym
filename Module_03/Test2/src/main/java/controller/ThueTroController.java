package controller;

import model.ThanhToan;
import model.ThueTro;
import service.ThueTroService;
import service.impl.ThueTroServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@WebServlet(name = "ThueTroController", urlPatterns = "/ThueTro")
public class ThueTroController extends HttpServlet {
    private ThueTroService service = new ThueTroServiceImpl();
    private ThueTroServiceImpl thueTroService = new ThueTroServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null || action.trim().equals("")) {
            action = "list";
        }
        switch (action) {
            case "create":
                showThanhToanList(request,response);
                request.getRequestDispatcher("/exam/thuetro/create.jsp").forward(request, response);
                break;
            case "update":

                break;
            case "delete":
                break;
            default:
                showList(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null || action.trim().equals("")) {
            doGet(request, response);
            return;
        }
        switch (action) {
            case "create":

                break;
            case "update":

                break;
            default:
                doGet(request, response);
        }
    }
    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ThueTro> thueTros = null;
        try {
            thueTros = service.findAll();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.setAttribute("thueTros", thueTros);
        request.getRequestDispatcher("/exam/thuetro/list.jsp").forward(request, response);
    }

    private void showThanhToanList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ThanhToan> thanhToans = null;
        thanhToans = thueTroService.displayThanhToan();
        request.setAttribute("thanhToans", thanhToans);
    }
    private void createThueTro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int phone = Integer.parseInt(request.getParameter("phone"));
        Date ngayThue = Date.from(Instant.parse(request.getParameter("ngayThue")));
        String ghiChu = request.getParameter("ghiChu");
        int maThanhToan = Integer.parseInt(request.getParameter("maThanhToan"));

        String error = null;

        if (error == null) {
            try {
                service.create(new ThueTro(name,phone,ngayThue,ghiChu,maThanhToan));
            } catch (Exception e) {
                error = e.getMessage();
            }
        }

        if (error == null) {
            response.sendRedirect("/product");
        } else {
            request.setAttribute("error", error);
            request.getRequestDispatcher("/exam/product/create.jsp").forward(request, response);
        }
    }
}
