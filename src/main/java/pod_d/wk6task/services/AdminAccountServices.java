package pod_d.wk6task.services;

import pod_d.wk6task.models.Customer;
import pod_d.wk6task.models.Staff;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AdminAccountServices {
    String signUp(HttpServletRequest req, HttpServletResponse resp);
    Staff logIn(HttpServletRequest req, HttpServletResponse resp);
    void viewProfile();
    void updateProfile();
    void logOut();
}
