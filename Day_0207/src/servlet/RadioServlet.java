package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		
		String gender = req.getParameter("gender");
		String chk_mail = req.getParameter("chk_mail");
		String content = req.getParameter("content");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("당신이 입력한 정보 입니다. <br>");
		out.println("성별 : "+gender);
		out.println("<br>메일 정보 수신 여부 : "+chk_mail);
		out.println("<br>가입 인사 : "+content);
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.println("</body><html>");
		out.close();
	}

}
