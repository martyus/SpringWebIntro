package com.version1.SpringWebDB.controller;

import com.version1.SpringWebDB.domain.Employee;
import com.version1.SpringWebDB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empService;

    @PutMapping("/employee/{id}")
    public void changeEmployeeName(@PathVariable int id, @RequestBody Employee employee){
        System.out.println(employee.getFirst_name());
        empService.updateEmployeeFirstName(employee.getFirst_name(), id);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return empService.findAllEmployees();
    }

    @GetMapping("/employee/dept/{id}")
    public List<Employee> getEmployeesForDept(@PathVariable int id){
        return empService.getEmployeesByDept(id);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return empService.findEmployeeById(id);
    }
}
