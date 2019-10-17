package cn.boss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.boss.service.impl.ChangeServiceImpl;
import cn.boss.service.impl.MemberServiceImpl;

public class ChangeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String changeUsername = request.getParameter("changeUsername");
		String changePassword = request.getParameter("changePassword");
		ChangeServiceImpl msi = new ChangeServiceImpl();
		int changePwd = msi.changePwd(changeUsername, changePassword);
		if(changePwd == 0){
			request.getRequestDispatcher("").forward(request, response);
		}else{
			response.sendRedirect("");
		}
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
