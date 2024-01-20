package com.red.stevo.employee_management_system.EmployeeModels;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmployeeDisplayModel {
    private String employeeName;

    private String employeeId;

    private String employeeEmail;

}
