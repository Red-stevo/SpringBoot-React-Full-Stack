package com.red.stevo.employee_management_system.EmployeeService;

import com.red.stevo.employee_management_system.EmployeeModels.EmployeeDisplayModel;
import com.red.stevo.employee_management_system.EmployeeRepository.GetEmployeeData;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class GetEmployeeService {

    GetEmployeeData getEmployeeData;

    public EmployeeDisplayModel getEmployee(String value)
    {


        return null;
    }
}
