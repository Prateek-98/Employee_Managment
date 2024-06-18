package com.empMgmtService.employeeManagementService.service;

import com.empMgmtService.employeeManagementService.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.empMgmtService.employeeManagementService.repositories.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee getEmployee(long id) {
        return employeeRepo.findById(id).get();
    }
    public String addEmployee(Employee employee){
        if(employee != null){
            employeeRepo.save(employee);
            return "OK";
        }
        return "Empty Entity" ;
    }
public String updateEmployee(Employee employee){
//        if(employee.getEmpId()){
//
//        }
    Employee employee1 = employeeRepo.findById(employee.getEmpId()).get();
    employeeRepo.save(employee);
    return "ok";
}
public String deleteEmployee(Long id){
        employeeRepo.deleteById(id);
        return "Ok";
}

}
