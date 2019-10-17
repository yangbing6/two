package cn.boss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.boss.pojo.Employee_Info;
import cn.boss.service.impl.EmployeeServiceImpl;

public class InsterEmployeeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF=8");
		request.setCharacterEncoding("UTF-8");
		
		Employee_Info ei = new Employee_Info();
		ei.setEy_id(0);
		ei.setEy_name(request.getParameter("username"));
		ei.setEy_age(Integer.parseInt(request.getParameter("age")));
		ei.setEa_sex(request.getParameter("sex"));
		ei.setEy_address(request.getParameter("address"));
		ei.setC_compile(request.getParameter("position"));
		ei.setEy_idcard(request.getParameter("idcard"));
		ei.setEy_tel(request.getParameter("tel"));
		ei.setSd_department(request.getParameter("bm"));
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		int count = esi.saveEmployee(ei);
		System.out.println(count);
		if (count > 0) {
			request.setAttribute("position", ei.getC_compile());
			request.getRequestDispatcher("EmployeeServlet1").forward(request, response);
		}else {
			System.out.println("Ê§°Ü");
		}
//		request.getRequestDispatcher("personalinfo.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
