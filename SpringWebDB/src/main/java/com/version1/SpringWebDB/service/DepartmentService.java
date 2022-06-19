package com.version1.SpringWebDB.service;

import com.version1.SpringWebDB.domain.Department;
import com.version1.SpringWebDB.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository deptRepository;

    public List<Department> getAllDepartments(){
        return deptRepository.findAllDepartments();
    }

    public void createDepartment(Department dept){
        deptRepository.saveNewDepartment(dept);
    }

    public Department getDeptById(int id){
        return deptRepository.getOneById(id);
    }
}
