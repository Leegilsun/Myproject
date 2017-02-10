package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdditionServlet")
public class AdditionServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 30;
		int add = num1 + num2;
		
		req.setAttribute("num1", num1);
		req.setAttribute("num2", num2);
		req.setAttribute("add", add);
		
		req.getRequestDispatcher("07_addition.jsp").forward(req, resp);
	}

}
