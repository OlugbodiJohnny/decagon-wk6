//package pod_d.wk6task.dao;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import pod_d.wk6task.dto.CustomerDto;
//import pod_d.wk6task.models.Customer;
//
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//import static pod_d.wk6task.config.DbConnection.getConnection;
//@ExtendWith(MockitoExtension.class)
//class CustomerDaoTest {
//    Connection baseConnection;
//    @Mock CustomerDao customerDao;
//    CustomerDto customerDto;
//    @BeforeEach
//    void setUp() {
//        baseConnection = getConnection();
//        HttpServlet request = mock(HttpServletRequest.class);
//        HttpServlet response = mock(HttpServletResponse.class);
//        customerDto = new CustomerDto();
//        Customer dbCustomer = customerDao.findCustomerByEmail(customerDto.getEmail());
//    }
//
//    @Test
//    void saveCustomer() throws SQLException {
//        when(customerDao.saveCustomer(customerDto)).thenReturn();
//    }
//
//    @Test
//    void updateCustomer() {
//    }
//
//    @Test
//    void deleteCustomer() {
//    }
//
//    @Test
//    void findCustomerById() {
//    }
//
//    @Test
//    void findCustomerByUserName() {
//    }
//}