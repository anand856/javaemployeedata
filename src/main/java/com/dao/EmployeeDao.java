package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;
import com.conn.DBConnect;
public class EmployeeDao {

	private Connection conn;

	public EmployeeDao(Connection conn) {
		super();
		this.conn = conn;
	}
	public boolean addEmployee(Employee emp) 
	{
	
		boolean f = false;
		
		try {
			
			String sql ="INSERT INTO employee(name,mobile,dob,address)VALUES(?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getMobile());
			ps.setString(3, emp.getDob());
			ps.setString(4, emp.getAddress());
			
			int i = ps.executeUpdate();
			
			if(i==1) {
				f=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		Employee emp = null;
		try {
			String sql = "select * from employee";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setMobile(rs.getString(3));
				emp.setDob(rs.getString(4));
				emp.setAddress(rs.getString(5));
				list.add(emp);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return list;
	}
	
	
	public Employee getEmployeeById(int id) {
		Employee emp = null;
		try {
			String sql = "select * from employee where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setMobile(rs.getString(3));
				emp.setDob(rs.getString(4));
				emp.setAddress(rs.getString(5));
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	
		return emp;
	}
	public boolean updateEmployee(Employee emp) 
	{
	
		boolean f = false;
		
		try {
			
			String sql ="update employee set name=?,mobile=?,dob=?,address=? where id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getMobile());
			ps.setString(3, emp.getDob());
			ps.setString(4, emp.getAddress());
			ps.setInt(5,emp.getId());
			int i = ps.executeUpdate();
			
			if(i==1) {
				f=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public boolean deleteEmployee(int id) {
		boolean f = false;
		try {
			String sql = "delete from employee where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
