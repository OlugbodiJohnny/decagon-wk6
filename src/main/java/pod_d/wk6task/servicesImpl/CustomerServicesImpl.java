package pod_d.wk6task.servicesImpl;



import pod_d.wk6task.dao.CustomerDao;
import pod_d.wk6task.dto.CustomerDto;
import pod_d.wk6task.models.Customer;
import pod_d.wk6task.services.CustomerAccountServices;
import pod_d.wk6task.services.CustomerTransactionServices;
import pod_d.wk6task.utils.GenderFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class CustomerServicesImpl implements CustomerAccountServices, CustomerTransactionServices {
    private final CustomerDao customerDao = new CustomerDao();
    private String status;
    @Override
    public String signUp(HttpServletRequest req, HttpServletResponse resp) {
        CustomerDto customerDto = new CustomerDto();
        System.out.println(req.getParameter("name"));
        customerDto.setName(req.getParameter("name"));
        customerDto.setGender(GenderFilter.getGender(req.getParameter("gender")));
        customerDto.setEmail(req.getParameter("email"));
        customerDto.setWallet(0.00);
        customerDto.setPassword(req.getParameter("password"));

        try {
            Customer customer = customerDao.saveCustomer(customerDto);
            if (customer != null) {
                status = "Account created successfully";
                System.out.println(customer);
                req.setAttribute("customer",customer);
            }else{
                status = "Account creation unsuccessful. Please check your entries and try again";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  status;
    }

    @Override
    public Customer logIn(HttpServletRequest req, HttpServletResponse resp) {
        return customerDao.findCustomerByEmailAndPassword(req.getParameter("email"),req.getParameter("password"));
    }

    @Override
    public void viewProfile() {

    }

    @Override
    public void updateProfile() {

    }

    @Override
    public void logOut() {

    }

    @Override
    public void addProductsToCart() {

    }

    @Override
    public void removeProductsFromCart() {

    }

    @Override
    public void checkOut() {

    }

    @Override
    public void cancelCheckOut() {

    }
}
