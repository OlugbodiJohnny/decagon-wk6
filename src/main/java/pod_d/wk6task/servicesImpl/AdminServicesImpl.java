package pod_d.wk6task.servicesImpl;

import pod_d.wk6task.dao.AdminDao;
import pod_d.wk6task.dto.AdminDto;
import pod_d.wk6task.models.Customer;
import pod_d.wk6task.models.Staff;
import pod_d.wk6task.services.AdminAccountServices;
import pod_d.wk6task.services.AdminProductServices;
import pod_d.wk6task.services.CustomerAccountServices;
import pod_d.wk6task.services.CustomerTransactionServices;
import pod_d.wk6task.utils.GenderFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminServicesImpl implements AdminAccountServices, AdminProductServices{
    private final AdminDao adminDao = new AdminDao();
    private String status;

    @Override
    public String signUp(HttpServletRequest req, HttpServletResponse resp) {
        AdminDto adminDto = new AdminDto();
        System.out.println(req.getParameter("name"));
        adminDto.setName(req.getParameter("name"));
        adminDto.setGender(GenderFilter.getGender(req.getParameter("gender")));
        adminDto.setEmail(req.getParameter("email"));
//        adminDto.setWallet(0.00);
        adminDto.setPassword(req.getParameter("password"));
        return null;
    }

    @Override
    public Staff logIn(HttpServletRequest req, HttpServletResponse resp) {
        return null;
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
    public void addProducts() {

    }

    @Override
    public void removeProducts() {

    }

    @Override
    public void updateProducts() {

    }

    @Override
    public void approvePurchase() {

    }
}
