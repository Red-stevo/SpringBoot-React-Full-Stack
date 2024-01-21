package com.red.stevo.employee_management_system.EmployeeRepository;

import com.red.stevo.employee_management_system.ControllerAdvice.EmptyDatasourceException;
import com.red.stevo.employee_management_system.ControllerAdvice.UserNotFoundException;
import com.red.stevo.employee_management_system.EmployeeDao.SelectEmployeeDAO;
import com.red.stevo.employee_management_system.EmployeeModels.EmployeeDisplayModel;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.*;


@Repository
@Slf4j
public class GetEmployeeData {


    SelectEmployeeDAO selectEmployeeDAO;

    @Autowired
    public void setSelectEmployeeDAO(SelectEmployeeDAO selectEmployeeDAO) {
        this.selectEmployeeDAO = selectEmployeeDAO;
    }

    public Map<String, String> getEmployeeById(String EmployeeId) throws UserNotFoundException
    {
        {
            log.info("extracting employee data");
        }


        final String criteria = "employee_names";
        Map<String, String> employeeMap = new HashMap<>();

        EmployeeDisplayModel employeeDisplayModel = selectEmployeeDAO.
                getEmployee(criteria,EmployeeId);

        employeeMap.put("employee_id", employeeDisplayModel.getEmployeeId());
        employeeMap.put("employee_name", employeeDisplayModel.getEmployeeName());
        employeeMap.put("employee_email", employeeDisplayModel.getEmployeeEmail());

        return employeeMap;
    }

    public List<Map<String, String>> getAllEmployees() throws EmptyDatasourceException
    {
        List<EmployeeDisplayModel> employeeDisplayModelList ;
        List<Map<String, String>> employeeMapList = new ArrayList<>();

        employeeDisplayModelList = selectEmployeeDAO.getAllEmployees();

        Iterator<EmployeeDisplayModel> employeeIterator = employeeDisplayModelList.iterator();

        while (employeeIterator.hasNext())
        {
            Map<String, String> employeeMap = new HashMap<>();

            EmployeeDisplayModel employeeDisplayModel = employeeIterator.next();

            employeeMap.put("EmployeeName",employeeDisplayModel.getEmployeeName());
            employeeMap.put("EmployeeId", employeeDisplayModel.getEmployeeId());
            employeeMap.put("EmployeeEmail", employeeDisplayModel.getEmployeeEmail());


            employeeMapList.add(employeeMap);
        }

        return employeeMapList;
    }
}
