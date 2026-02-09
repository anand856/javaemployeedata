package com.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.DBConnect;
import com.dao.EmployeeDao;
import com.entity.Employee;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String succMsg;
		String errorMsg;
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		
		Employee emp = new Employee(name,mobile,dob,address);
		
		EmployeeDao dao = new EmployeeDao(DBConnect.getConn());
		//HttpSession session = req.getSession();
		
		boolean f = dao.addEmployee(emp);
		
		if(f) {
			
			//session.setAttribute("succMsg", "Employee Details Submitted successfully");
			resp.sendRedirect("add_student.jsp");
			//System.out.println("Student details Submit successfully..");
		}else {
			//session.setAttribute("errorMsg", "Something wrong on server");
			resp.sendRedirect("add_student.jsp");
		}
	}

	
	

}
