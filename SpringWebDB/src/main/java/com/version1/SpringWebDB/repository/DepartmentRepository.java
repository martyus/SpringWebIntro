package com.version1.SpringWebDB.repository;

import com.version1.SpringWebDB.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DepartmentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Department> findAllDepartments(){
        return jdbcTemplate.query("select * from department", new DepartmentRowMapper());
    }

    public Department getOneById(int id){
        String mySql = "select * from department  where dep_id = ?";
        Department d =  jdbcTemplate.queryForObject(mySql, new DepartmentRowMapper(), id );
        return d;
    }

    public void saveNewDepartment(Department dept){
        String mySql = "insert into department(dep_name, team_id) values (?,?)";
        int num = jdbcTemplate.update(mySql, dept.getDep_name(), dept.getTeam_id());
        System.out.println(num);
    }

    private class DepartmentRowMapper implements RowMapper<Department>
    {
        public Department mapRow(ResultSet rs, int rowNum) throws SQLException{
            Department dept = new Department();
            dept.setDep_id(rs.getInt("dep_id"));
            dept.setDep_name(rs.getString("dep_name"));
            dept.setTeam_id(rs.getInt("team_id"));
            return dept;
        }

    }
}
