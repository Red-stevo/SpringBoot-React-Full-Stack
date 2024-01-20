package com.red.stevo.employee_management_system.EmployeeRepository;

import com.red.stevo.employee_management_system.ControllerAdvice.UserNotFoundException;
import com.red.stevo.employee_management_system.EmployeeDao.SelectEmployeeDAO;
import com.red.stevo.employee_management_system.EmployeeModels.EmployeeDisplayModel;
import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.management.BadAttributeValueExpException;
import java.util.HashMap;
import java.util.Map;

@Repository
@Data
public class GetEmployeeData {

    SelectEmployeeDAO selectEmployeeDAO;

    public Map<String, String> getEmployeeById(String EmployeeId) throws UserNotFoundException
    {
        final String criteria = "employee_names";
        Map<String, String> employeeMap = new HashMap<>();

        EmployeeDisplayModel employeeDisplayModel = selectEmployeeDAO.
                getEmployee(criteria,EmployeeId);

        employeeMap.put("employee_id", employeeDisplayModel.getEmployeeId());
        employeeMap.put("employee_name", employeeDisplayModel.getEmployeeName());
        employeeMap.put("employee_email", employeeDisplayModel.getEmployeeEmail());

        return employeeMap;
    }
}
