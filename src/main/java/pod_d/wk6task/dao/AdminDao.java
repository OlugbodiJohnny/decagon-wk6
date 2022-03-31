package pod_d.wk6task.dao;

import pod_d.wk6task.dto.AdminDto;
import pod_d.wk6task.models.Customer;
import pod_d.wk6task.models.Staff;
import pod_d.wk6task.utils.GenderFilter;
import pod_d.wk6task.utils.RoleFilter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static pod_d.wk6task.config.DbConnection.getConnection;
import static pod_d.wk6task.config.DbConnection.getResultFromSqlQuery;

public class AdminDao {
    Connection baseConnection = getConnection();
    public Staff saveStaff (AdminDto adminDto) throws SQLException {
        int result;
        Staff staff = new Staff();
        try (Connection connection = baseConnection;
             PreparedStatement preparedStatement = connection.prepareStatement("insert into staff (name, gender, email, password, staff_id, role, qualification)\n"
                     + "values (?, ?, ?, ?, ?, ?, ?, ?)")) {
            preparedStatement.setString(1,adminDto.getName());
            preparedStatement.setString(2,adminDto.getGender().toString());
            preparedStatement.setString(3,adminDto.getEmail());
            preparedStatement.setString(4,adminDto.getPassword());
            preparedStatement.setString(5,adminDto.getStaffId());
            preparedStatement.setString(6,adminDto.getRole().toString());
            preparedStatement.setString(7,adminDto.getQualification());
            result = preparedStatement.getResultSetType();
            if (result<=0) {
                throw new SQLException("Query failed");
            }
            ResultSet resultSet =  getResultFromSqlQuery("select * from customer where email ='"+adminDto.getEmail()+"'");
            staff = fetchCustomerFromDb(resultSet);
        }
        return null;
    }

    private Staff fetchCustomerFromDb(ResultSet resultSet) throws SQLException {
        Staff staff = new Staff();
        if(resultSet.next()){
            staff.setId(Integer.parseInt(resultSet.getString("id")));
            staff.setName(resultSet.getString("name"));
            staff.setGender(GenderFilter.getGender(resultSet.getString("gender")));
            staff.setPassword(resultSet.getString("password"));
//            staff.setPassword(resultSet.getString("password"));
            staff.setStaffId(resultSet.getString("staffid"));
            staff.setRole(RoleFilter.getRole(resultSet.getString("role")));
            staff.setQualification(resultSet.getString("qualification"));
        }
        return staff;
    }
}
