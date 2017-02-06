package servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/layout.do")
public class LayoutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String type = req.getParameter("type");
		String url = "";
		if(type != null)
		{
			if(type.equals("loan"))
				url += "../loan/loan_input.jsp";
			else if(type.equals("hello"))
				url += "../hello.jsp";
			else if(type.equals("whatTime"))
				url += "../time/whatTime.jsp";
			else if(type.equals("elect"))
				url += "../elect/elect_input.jsp";
			else if(type.equals("calculator"))
				url += "../calculator/cal_input.jsp";
			else if(type.equals("loanResult"))
				url += "../loan/loan_result.jsp";
			else if(type.equals("whatTimeResult"))
				url +="../time/whatTime_result.jsp";
			else if(type.equals("electResult"))
				url +="../elect/elect_result.jsp";
			else if(type.equals("calculatorResult"))
				url += "../calculator/cal_result.jsp";
		}
		req.setAttribute("url", url);
		req.getRequestDispatcher("main/layout.jsp").forward(req, resp);
	}
	
}
