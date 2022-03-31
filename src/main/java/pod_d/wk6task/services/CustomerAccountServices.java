package pod_d.wk6task.services;

import pod_d.wk6task.models.Customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CustomerAccountServices {
    String signUp(HttpServletRequest req, HttpServletResponse resp);
    Customer logIn(HttpServletRequest req, HttpServletResponse resp);
    void viewProfile();
    void updateProfile();
    void logOut();
}
