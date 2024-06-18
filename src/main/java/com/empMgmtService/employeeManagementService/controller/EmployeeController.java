package com.empMgmtService.employeeManagementService.controller;

import com.empMgmtService.employeeManagementService.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.empMgmtService.employeeManagementService.service.EmployeeService;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public Employee getEmployeeDetails(@PathVariable long id) {
        return employeeService.getEmployee(id);
    }
    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable long id){
        return employeeService.deleteEmployee(id);
    }
}
