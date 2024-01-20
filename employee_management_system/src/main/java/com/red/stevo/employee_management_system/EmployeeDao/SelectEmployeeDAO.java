package com.red.stevo.employee_management_system.EmployeeDao;

import com.red.stevo.employee_management_system.ControllerAdvice.UserNotFoundException;
import com.red.stevo.employee_management_system.EmployeeModels.EmployeeDisplayModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

        final String SELECTSQL = "SELECT employee_id as employeeId," +
                " employee_names as employeeNames, " +
                "employee_email as employeeEmail, " +
                "employee_password as employeePassword " +
                "from employee_details WHERE ? = ?";

        EmployeeDisplayModel employeeDisplayModel = (EmployeeDisplayModel) jdbcTemplate.query(SELECTSQL,
                new BeanPropertyRowMapper<>(EmployeeDisplayModel.class),
                criteria,value);

        if(null == employeeDisplayModel)
        {
            throw new UserNotFoundException("User Does Not Exit in the Database");
        }

        return employeeDisplayModel;
    }

}
