package com.version1.SpringWebDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebDB {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebDB.class, args);
	}

//	public void run(String ...arg0){
//
//		List<Employee> empList = empRep.findAllEmployees();
//		for (Employee e : empList){
//			System.out.println(e);
//		}
//		System.out.println("***********************");
//		Employee emp = empRep.findOneEmployee(1001);
//		System.out.println(emp);
//		Department dept = deptRep.getOneById(emp.getDept());
//		System.out.println(dept);
//
//		System.out.println("*****See all employees from a department*********");
//		Department dept1 = deptRep.getOneById(3);
//		List<Employee> emps = empRep.getEmployeesByDept(dept1.getDep_id());
//		for (Employee e : emps){
//			System.out.println(e);
//		}
//
//		System.out.println("*****Create new department*********");
//		dept1 = new Department();
//		dept1.setTeam_id(3);
//		dept1.setDep_name("OPS");
//		deptRep.saveNewDepartment(dept1);
//
//		System.out.println("*****Update employee name*********");
//		empRep.updateEmployeeFirstName("Martina", 1001);
//	}
}
