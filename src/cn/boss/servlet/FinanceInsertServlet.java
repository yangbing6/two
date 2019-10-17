package cn.boss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.boss.service.impl.FinanceServiceImpl;

public class FinanceInsertServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF=8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String income = request.getParameter("income");
		String expend = request.getParameter("expend");
		String netincome = request.getParameter("netincome");
		String direction = request.getParameter("direction");
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		FinanceServiceImpl fsi = new FinanceServiceImpl();
		String ia = fsi.insertFinance(id, income, expend, netincome, direction, startdate, enddate);
		request.setAttribute("rs", ia);
		request.getRequestDispatcher("").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
