package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String admin = req.getParameter("admin");
		
		if(admin.equals("1")) {
			String msg = "사용자 로그인 화면";
			req.setAttribute("msg", msg);
		}
		else {
			String msg = "관리자 로그인 화면";
			req.setAttribute("msg", msg);
		}
		
		req.getRequestDispatcher("login_result.jsp").forward(req, resp);

	}
}
