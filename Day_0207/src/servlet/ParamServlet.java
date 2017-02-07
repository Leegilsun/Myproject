package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=utf-8");
		
		String id = req.getParameter("id");
		int age = Integer.parseInt(req.getParameter("age"));
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("당신이 입력한 정보 입니다. <br>");
		out.println("아이디 : "+id);
		out.println("<br>나이 : "+age);
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.println("</body><html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		doGet(req, resp);
	}
	
	
}
