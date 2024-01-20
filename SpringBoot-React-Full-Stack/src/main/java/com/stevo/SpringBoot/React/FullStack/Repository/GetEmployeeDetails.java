package com.stevo.SpringBoot.React.FullStack.Repository;

import com.stevo.SpringBoot.React.FullStack.Models.LoginModel;

import java.util.List;

public class GetEmployee implements EmployeeDAO{

    @Override
    public LoginModel findEmployeeById(String employeeId) {
        return null;
    }

    @Override
    public LoginModel findEmployeeByEmail(String employeeEmail) {
        return null;
    }

    @Override
    public List<LoginModel> findEmployeeByName(String employeeName) {
        return null;
    }
}
