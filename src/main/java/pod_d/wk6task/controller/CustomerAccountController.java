package pod_d.wk6task.controller;

import lombok.RequiredArgsConstructor;
import pod_d.wk6task.dao.CustomerDao;
import pod_d.wk6task.dto.CustomerDto;
import pod_d.wk6task.enums.Gender;
import pod_d.wk6task.models.Customer;
import pod_d.wk6task.services.CustomerAccountServices;
import pod_d.wk6task.servicesImpl.CustomerServicesImpl;
import pod_d.wk6task.utils.GenderFilter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "/customer", value = "/customer")
//@RequiredArgsConstructor
public class CustomerAccountController extends HttpServlet {
    private final CustomerServicesImpl customerServices = new CustomerServicesImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Customer customer = customerServices.logIn(req,resp);
        if (customer != null) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String status = customerServices.signUp(req,resp);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
