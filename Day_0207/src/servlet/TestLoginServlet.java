package servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testLogin")
public class TestLoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = "pinkGil";
		String pwd = "1234";
		String name = "이길선";
		req.setCharacterEncoding("utf-8");
		if(id.equals(req.getParameter("id")) && pwd.equals(req.getParameter("pwd")) ) {
			resp.sendRedirect("main.jsp?name=" + URLEncoder.encode(name, "utf-8"));
		}
		else{
			resp.sendRedirect("loginForm.jsp");
		}
	}

}
