package cn.boss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.boss.service.impl.LoginServiceImpl;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String loginUsername = request.getParameter("loginUsername");
		System.out.println(loginUsername);
		String loginPassword = request.getParameter("loginPassword");
		LoginServiceImpl lsi = new LoginServiceImpl();
		String loginUname = lsi.login(loginUsername, loginPassword);
		if (loginUname != null) {
			request.getSession().setAttribute("loginUname", loginUname);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
