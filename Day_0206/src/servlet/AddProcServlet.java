package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addProc.do")
public class AddProcServlet extends HttpServlet{
	
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int result = num1 + num2;
//		resp.setContentType("text/html;charset=utf-8");
//		PrintWriter pw = resp.getWriter();
//		pw.println("<HTML>");
//		pw.println("<head>");
//		pw.println("<title>");
//		pw.println("두 수 합 구하는 화면이에요");
//		pw.println("</title>");
//		pw.println("</head>");
//		pw.println("<body>");
//		pw.println("두 수 합은"+result);
//		pw.println("</body>");
//		pw.println("</HTML>");
		req.setAttribute("result", result);
		req.getRequestDispatcher("addResult.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		doProc(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
