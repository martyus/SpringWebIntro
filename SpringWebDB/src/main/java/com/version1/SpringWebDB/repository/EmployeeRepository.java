package com.version1.SpringWebDB.repository;

import com.version1.SpringWebDB.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> findAllEmployees(){
        return jdbcTemplate.query("select * from employee", new EmployeeRowMapper());
    }

    public Employee findOneEmployee(int id){
        String mySql = "select * from employee  where employee_id = ?";
        Employee e =  jdbcTemplate.queryForObject(mySql, new EmployeeRowMapper(), id );
        return e;
    }

    public List<Employee> getEmployeesByDept(int id){
        String mySql = "select * from employee  where dept = ?";
        List<Employee> emps =  jdbcTemplate.query(mySql, new EmployeeRowMapper(), id );
        return emps;
    }

    public void updateEmployeeFirstName(String first_name, int id){
        String mySql = "update employee set first_name = ? where employee_id = ?";
        jdbcTemplate.update(mySql, first_name, id);
    }

    private class EmployeeRowMapper implements RowMapper<Employee>
    {
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee emp = new Employee();
            emp.setEmployee_id(rs.getInt("employee_id"));
            emp.setFirst_name(rs.getString("first_name"));
            emp.setLast_name(rs.getString("last_name"));
            emp.setAge(rs.getInt("age"));
            emp.setDept(rs.getInt("dept"));
            return emp;
        }
    }
}
