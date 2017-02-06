package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculatorProc.do")
public class CalculatorProcServlet extends HttpServlet{
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int type = Integer.parseInt(req.getParameter("type"));
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int result = 0;
		int cal = 0;
		
		if(type == 1) {
			result = num1+num2;
			cal = 1;
		}
		else if(type == 2) {
			result = num1-num2;
			cal = 2;
		}
		else if(type ==3) {
			result = num1*num2;
			cal = 3;
		}
		req.setAttribute("cal", cal);
		req.setAttribute("result", result);
		req.getRequestDispatcher("layout.do?type=calculatorResult").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}
	
}
