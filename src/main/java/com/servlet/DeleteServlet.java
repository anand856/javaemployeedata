package com.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.conn.*;
import com.dao.EmployeeDao;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		EmployeeDao dao = new EmployeeDao(DBConnect.getConn());
		boolean f =dao.deleteEmployee(id);
		 
		if(f) {			
			//session.setAttribute("succMsg", "Employee Details Deleted successfully");
			resp.sendRedirect("viewdata.jsp");
			//System.out.println("Student details Submit successfully..");
		}else {
			//session.setAttribute("errorMsg", "Something wrong on server");
			resp.sendRedirect("viewdata.jsp");
		}
	}

}
