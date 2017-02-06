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
		
		
		req.setAttribute("result", result);
		req.getRequestDispatcher("addResult.jsp").forward(req, resp);
//		PrintWriter pw = resp.getWriter();//HTML코드 출력을 위한 객체
//		pw.println("<HTML>");
//		pw.println("<head>");
//		pw.println("<title>");
//		pw.println("제목이야ㅠㅠ");
//		pw.println("</title>");
//		pw.println("</head>");
//		pw.println("<body>");
//		pw.println(result);
//		pw.println("</body>");
//		pw.println("</HTML>");
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
//		super.doPost(req, resp);
		doProc(req, resp);
	}
	
}
