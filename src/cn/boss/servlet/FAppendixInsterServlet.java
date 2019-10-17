package cn.boss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.boss.service.impl.FinanceServiceImpl;

public class FAppendixInsterServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String nid = request.getParameter("nid");
		String nname = request.getParameter("nname");
		String ndate = request.getParameter("ndate");
		String ntype = request.getParameter("ntype");
		String nmoney = request.getParameter("nmoney");
		String number = request.getParameter("number");		
		FinanceServiceImpl fsi = new FinanceServiceImpl();
		String ia = fsi.insertFinanceAppendix(nid, nname, ndate, ntype, nmoney, number);
		request.setAttribute("rs", ia);
		request.getRequestDispatcher("").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
