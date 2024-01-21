package com.red.stevo.employee_management_system.EmployeeDao;

import com.red.stevo.employee_management_system.ControllerAdvice.EmptyDatasourceException;
import com.red.stevo.employee_management_system.ControllerAdvice.UserNotFoundException;
import com.red.stevo.employee_management_system.EmployeeModels.EmployeeDisplayModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class SelectEmployeeDAO {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public EmployeeDisplayModel getEmployee(String criteria, String value) throws UserNotFoundException
    {

        {
            log.info("Retrieving employee data.");
        }

        final String SELECT = "SELECT employee_id as employeeId," +
                " employee_names as employeeNames, " +
                "employee_email as employeeEmail, " +
                "employee_password as employeePassword " +
                "from employee_details WHERE ? = ?";

        EmployeeDisplayModel employeeDisplayModel =  jdbcTemplate.queryForObject(SELECT,
                new BeanPropertyRowMapper<>(EmployeeDisplayModel.class),
                criteria,value);

        if(null == employeeDisplayModel)
        {
            throw new UserNotFoundException("User Does Not Exit in the Database");
        }

        return employeeDisplayModel;
    }

    public List<EmployeeDisplayModel> getEmployeeList()
    {
        return null;
    }

    public List<EmployeeDisplayModel> getAllEmployees() throws EmptyDatasourceException
    {
        {
            log.info("Getting All employees");
        }


        List<EmployeeDisplayModel> employeeDisplayModels;

        final String SELECT  = "SELECT employee_id as employeeId," +
                " employee_names as employeeName, " +
                "employee_email as employeeEmail " +
                "from employee_details";


        employeeDisplayModels = jdbcTemplate.query(SELECT,
                new BeanPropertyRowMapper<>(EmployeeDisplayModel.class));


        if (employeeDisplayModels.isEmpty())
        {
            log.error("Database is empty");
            throw new EmptyDatasourceException("The Database has no data");
        }

       return employeeDisplayModels;
    }

}
