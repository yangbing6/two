package cn.boss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.boss.pojo.FinanceAppendix;
import cn.boss.service.impl.FinanceServiceImpl;

public class ListFinanceDepartment extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF=8");
		request.setCharacterEncoding("UTF-8");
		String department = request.getParameter("department");
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		FinanceServiceImpl fsi = new FinanceServiceImpl();
		List<FinanceAppendix> lf = fsi.listFinanceDepartment(department, startdate, enddate);
		request.setAttribute("rs", lf);
		request.getRequestDispatcher("").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
