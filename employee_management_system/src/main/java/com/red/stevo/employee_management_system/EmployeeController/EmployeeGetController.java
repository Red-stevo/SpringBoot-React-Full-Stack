package com.red.stevo.employee_management_system.EmployeeController;

import com.red.stevo.employee_management_system.EmployeeModels.EmployeeDisplayModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeGetController {

    @GetMapping("/employee")
    public ResponseEntity<EmployeeDisplayModel> getEmployeeData()
    {


        return new ResponseEntity<>(HttpStatus.OK);
    }
}
