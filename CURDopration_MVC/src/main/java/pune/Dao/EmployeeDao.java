package pune.Dao;

import java.sql.ResultSet;


import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import pune.beans.Employee;

public class EmployeeDao {

    private JdbcTemplate t1;

    public JdbcTemplate getT1() {
        return t1;
    }

    public void setT1(JdbcTemplate t1) {
        this.t1 = t1;
    }

    public int registerinfo(Employee e1) {
        String sql = "INSERT INTO emp (eid, ename, eemail, epass, ecpass) VALUES (?, ?, ?, ?, ?)";
        return t1.update(sql, UUID.randomUUID().toString(), e1.getEname(), e1.getEemail(), e1.getEpass(), e1.getEcpass());
    }

    public List<Employee> displayall() {
        String sql = "SELECT * FROM emp";
        return t1.query(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee ex = new Employee();
                ex.setEid(rs.getString("eid"));
                ex.setEname(rs.getString("ename"));
                ex.setEemail(rs.getString("eemail"));
                ex.setEpass(rs.getString("epass"));
                ex.setEcpass(rs.getString("ecpass"));
                return ex;
            }
        });
    }

    public int del(String id) {
        String sql = "DELETE FROM emp WHERE eid = ?";
        return t1.update(sql, id);
    }

    public List<Employee> editemp(String id) {
        String query = "SELECT * FROM emp WHERE eid = ?";
        return t1.query(query, new Object[]{id}, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee ex = new Employee();
                ex.setEid(rs.getString("eid"));
                ex.setEname(rs.getString("ename"));
                ex.setEemail(rs.getString("eemail"));
                ex.setEpass(rs.getString("epass"));
                ex.setEcpass(rs.getString("ecpass"));
                return ex;
            }
        });
        
      
    }

	public void updatemployeeinfo(Employee e1) {
	
		t1.update("update employee set ename");
		
	}

}
