package com.springcrud.dao;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.springcrud.beans.Employee;

public class EmployeeDao {

	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template){
		this.template=template;
	}
	public int insert(Employee emp){
		String sql="insert into emp99(id,name,designation,salary)values(?,?,?,?)";
		int ans=template.update(sql,emp.getid(),emp.getName(),emp.getDesignation(),emp.getSalary());
		return ans;
	}

	public int update(Employee emp){
		String sql="update emp99 set name=?, designation=?, salary=? where id=?";
		int ans=template.update(sql,emp.getName(),emp.getDesignation(),emp.getSalary(),emp.getid());
		return ans;
	}
	public int delete(int id){
		String sql="delete from emp99 where id=?";
		return template.update(sql,id);
	}
	public Employee getEmpId(int id){
		String sql="select * from emp99 where id=?";
		@SuppressWarnings("deprecation")
		Employee emp=template.queryForObject(sql,new Object[]{id},new EmployeeMapper());
		
		
		return emp;
	}
	
	public List<Employee> getEmployeesDetails(){
		String sql="select * from emp99";
		List<Employee>empList=template.query(sql,new EmployeeMapper());
		return empList;
	}
}