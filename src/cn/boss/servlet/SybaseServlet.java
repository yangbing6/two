package cn.boss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.boss.service.impl.SybaseServerImpl;
import cn.boss.util.Page;


public class SybaseServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		SybaseServerImpl ssi = new SybaseServerImpl();
		String pindex = request.getParameter("index");
		int index = 1;
		if(pindex != null && pindex != ""){
			index = Integer.parseInt(pindex);
		}
		Page page = ssi.getPage(index, 3,1);
		request.setAttribute("pagelist", page);
		request.getRequestDispatcher("personalinfo.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
