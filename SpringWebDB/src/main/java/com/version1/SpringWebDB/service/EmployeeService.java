package com.version1.SpringWebDB.service;

import com.version1.SpringWebDB.domain.Department;
import com.version1.SpringWebDB.domain.Employee;
import com.version1.SpringWebDB.repository.DepartmentRepository;
import com.version1.SpringWebDB.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository empRepository;

    @Autowired
    DepartmentRepository deptRepository;

    public void updateEmployeeFirstName(String name, int id){
        empRepository.updateEmployeeFirstName(name, id);
    }

    public List<Employee> findAllEmployees(){
        return empRepository.findAllEmployees();
    }

    public List<Employee> getEmployeesByDept(int id){
        return empRepository.getEmployeesByDept(id);
    }

    public Employee findEmployeeById(int id){
        Employee e = empRepository.findOneEmployee(id);
        Department d = deptRepository.getOneById(e.getDept());
        e.setDepartment(d);
        System.out.println(e);
        return e;
    }
}
