package com.version1.SpringWebDB.controller;

import com.version1.SpringWebDB.domain.Department;
import com.version1.SpringWebDB.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService deptService;

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return deptService.getAllDepartments();
    }

    @PostMapping("departments")
    public ResponseEntity<?> createDepartment(@RequestBody Department department){
        deptService.createDepartment(department);
        return ResponseEntity.status(HttpStatus.CREATED).body(department);
    }

    @GetMapping("/departments/{id}")
    Department findDeptByID(@PathVariable int id) {
        return deptService.getDeptById(id);
    }
}
