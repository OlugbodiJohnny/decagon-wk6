package pod_d.wk6task.dao;

import pod_d.wk6task.dto.CustomerDto;
import pod_d.wk6task.models.Customer;
import pod_d.wk6task.utils.GenderFilter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static pod_d.wk6task.config.DbConnection.*;

public class CustomerDao {
//    DbConnection dbConnection = new DbConnection();
    Connection baseConnection = getConnection();

    public Customer saveCustomer (CustomerDto customerDto) throws SQLException {
        int result;
        Customer customer = new Customer();
        try (Connection connection = baseConnection;

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement("insert into customer (name, gender, email, wallet, password)\n" +
                     "values (?, ?, ?, ?, ?)")) {
            preparedStatement.setString(1, customerDto.getName());
            preparedStatement.setString(2, customerDto.getGender().toString());
            preparedStatement.setString(3, customerDto.getEmail());
            preparedStatement.setDouble(4, customerDto.getWallet());
            preparedStatement.setString(5,customerDto.getPassword());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();// will return 0 OR 1
            System.out.println(result);
            if (result <=0) {
                throw new SQLException("Query failed");
            }
            //select * from customer where email ='olugbodijohnny@live.com'
            ResultSet resultSet =  getResultFromSqlQuery("select * from customer where email ='"+customerDto.getEmail()+"'");
            customer = fetchCustomerFromDb(resultSet);

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return customer;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    public Customer updateCustomer () {return null;}
    public Customer deleteCustomer () {return null;}
    public Customer findCustomerById () {return null;}
    public Customer findCustomerByEmail(String email) {
        Customer customer = new Customer();
        try {
            //select * from customer where email ='olugbodijohnny@live.com'
            ResultSet resultSet =  getResultFromSqlQuery("select * from customer where email ='"+email+"'");
            customer = fetchCustomerFromDb(resultSet);

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return customer;
    }
    public Customer findCustomerByEmailAndPassword(String email,String password) {
        Customer customer = new Customer();
        try {
            //select * from customer where email ='olugbodijohnny@live.com'
            ResultSet resultSet =  getResultFromSqlQuery("select * from customer where email ='"+email+"' and password='"+password+"'");
            customer = fetchCustomerFromDb(resultSet);

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return customer;
    }

    private Customer fetchCustomerFromDb(ResultSet resultSet) throws SQLException {
        Customer customer = new Customer();
        if(resultSet.next()){
            customer.setId(Integer.parseInt(resultSet.getString("id")));
            customer.setName(resultSet.getString("name"));
            customer.setGender(GenderFilter.getGender(resultSet.getString("gender")));
            customer.setWallet(resultSet.getDouble("wallet"));
            customer.setPassword(resultSet.getString("password"));
        }
        return customer;
    }


}
