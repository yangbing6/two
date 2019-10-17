package cn.boss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.boss.service.impl.FinanceServiceImpl;

public class InsertFinance extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF=8");
		request.setCharacterEncoding("UTF-8");
		String nid = request.getParameter("id");
		String nincome = request.getParameter("income");
		String nexpend = request.getParameter("expend");
		String nnetincome = request.getParameter("netincome");
		String direction = request.getParameter("direction");
		String nstartdate = request.getParameter("startdate");
		String nenddate = request.getParameter("enddate");
		FinanceServiceImpl fsi = new FinanceServiceImpl();
		String ia = fsi.insertFinance(nid, nincome, nexpend, nnetincome, direction, nstartdate, nenddate);
		request.setAttribute("rs", ia);
		request.getRequestDispatcher("").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
