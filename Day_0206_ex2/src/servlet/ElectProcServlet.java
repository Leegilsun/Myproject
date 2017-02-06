package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/electProc.do")
public class ElectProcServlet extends HttpServlet{
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final double[] plus = { 60.7, 125.9, 187.9, 280.6, 417.7, 709.5 };
		final int[] start = { 410, 910, 1600, 3850, 7300, 12940 };
		int use = Integer.parseInt(req.getParameter("use"));
		
		int i= 0;
		double result = 0;
		
		while(true){
			if(use > 100 && i<5){
				result += plus[i] * 100;
				i++;
				use -= 100;
			}
			else{
				result += plus[i] * use +plus[i];
				break;
			}
		}
		req.setAttribute("fee", result);
		req.getRequestDispatcher("layout.do?type=electResult").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}
	
}