package com.red.stevo.employee_management_system.EmployeeController;

import com.red.stevo.employee_management_system.EmployeeModels.EmployeeDisplayModel;
import com.red.stevo.employee_management_system.EmployeeService.GetEmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class EmployeeGetController {

    GetEmployeeService getEmployeeService;

    @Autowired
    public void setGetEmployeeService(GetEmployeeService getEmployeeService) {
        this.getEmployeeService = getEmployeeService;
    }

    @GetMapping("/employee")
    public ResponseEntity<EmployeeDisplayModel> getEmployeeData()
    {
        {
            log.info("Received a http request to find employee");
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Map<String, String>>> getEmployees()
    {
        {
            log.info("Received a http request to find employee");
        }
        List<Map<String, String>> employees;

        employees = getEmployeeService.getEmployees();

        return new ResponseEntity<>(employees,HttpStatus.OK);
    }
}
