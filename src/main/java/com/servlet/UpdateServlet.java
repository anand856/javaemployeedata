package com.servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import com.conn.DBConnect;
import com.dao.EmployeeDao;
import com.entity.Employee;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		int id = Integer.parseInt(req.getParameter("id"));
		Employee emp = new Employee(id,name,mobile,dob,address);
		
		EmployeeDao dao = new EmployeeDao(DBConnect.getConn());
		boolean f = dao.updateEmployee(emp);
		if(f) {
			
			//session.setAttribute("succMsg", "Employee Details update successfully");
			resp.sendRedirect("viewdata.jsp");
			//System.out.println("Student details Submit successfully..");
		}else {
			//session.setAttribute("errorMsg", "Something wrong on server");
			resp.sendRedirect("viewdata.jsp");
		}
	}

}
