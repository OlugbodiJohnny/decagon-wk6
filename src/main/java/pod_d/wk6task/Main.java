//package pod_d.wk6task;
//
//import pod_d.wk6task.dao.CustomerDao;
//import pod_d.wk6task.dto.CustomerDto;
//import pod_d.wk6task.enums.Gender;
//
//import java.sql.SQLException;
//
//public class Main {
//    public static void main(String[] args) throws SQLException {
//        CustomerDao customerDao = new CustomerDao();
//        CustomerDto customerDto = new CustomerDto();
//
//        customerDto.setName("ade");
//        customerDto.setEmail("ade@gmail.com");
//        customerDto.setGender(Gender.MALE);
//        customerDto.setWallet(200.00);
//
//        customerDao.saveCustomer( customerDto);
//    }
//}
