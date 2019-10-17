package cn.boss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import cn.boss.pojo.Employee_Info;
import cn.boss.service.impl.EmployeeServiceImpl;

public class EmployeeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF=8");
		request.setCharacterEncoding("UTF-8");
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		List<Employee_Info> formal = esi.listSomeEmployee("正式合同");
		List<Employee_Info> probation = esi.listSomeEmployee("临时合同");
		request.setAttribute("formal", formal);
		request.setAttribute("probation", probation);
		request.getRequestDispatcher("personalinfo.jsp").forward(request, response);
		
		
		
		
		
		
		
		
		
		
		
		
//		String str = request.getParameter("h4");
//		String s = (String) request.getAttribute("position");
//		System.out.println(s);
//		if (s == null) {
//			s = new String(str.getBytes("ISO-8859-1"),"UTF-8");
//			System.out.println(s);
//		}
//		
//		List<Employee_Info> list = esi.listSomeEmployee(s);
//		System.out.println(list.size());
//		request.setAttribute("loginResult", list);
//		System.out.println(request.getAttribute("loginResult"));
//		request.getRequestDispatcher("personalinfo.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
