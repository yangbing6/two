package cn.boss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.boss.pojo.Storage;
import cn.boss.service.impl.ProcurementServiceImpl;

public class ProcurementServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		Storage s = new Storage(); 
		List<Storage> info = new ArrayList<Storage>();
		s.setEs_id(null);
		s.setEs_name(request.getParameter(""));
		s.setEs_number(Integer.parseInt(request.getParameter("")));
		s.setEs_price(Double.parseDouble(request.getParameter("")));
		s.setEs_state(Integer.parseInt(request.getParameter("")));
		s.setEs_time( java.sql.Date.valueOf(request.getParameter("")));
		s.setEs_department(Integer.parseInt(request.getParameter("")));
		s.setEs_type(Integer.parseInt(request.getParameter("")));
		info.add(s);
		ProcurementServiceImpl psi = new ProcurementServiceImpl();
		String buy = psi.saveBuy(info);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
