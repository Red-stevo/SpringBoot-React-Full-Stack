package com.red.stevo.employee_management_system.EmployeeService;

import com.red.stevo.employee_management_system.ControllerAdvice.EmptyDatasourceException;
import com.red.stevo.employee_management_system.EmployeeModels.EmployeeDisplayModel;
import com.red.stevo.employee_management_system.EmployeeRepository.GetEmployeeData;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class GetEmployeeService {

    GetEmployeeData getEmployeeData;

    @Autowired
    public void setGetEmployeeData(GetEmployeeData getEmployeeData) {
        this.getEmployeeData = getEmployeeData;
    }

    public EmployeeDisplayModel getEmployee(String value)
    {

        return null;
    }

    public List<Map<String, String>> getEmployees() throws EmptyDatasourceException
    {
        {
            log.info("Forwarding the query for processing");
        }

        List<Map<String, String>> employees;

        employees = getEmployeeData.getAllEmployees();

        return employees;
    }
}
