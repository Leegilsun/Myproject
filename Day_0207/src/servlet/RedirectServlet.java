package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/goHttp")
public class RedirectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(req.getParameter("num"));
		
		if(num <10)
			resp.sendRedirect("http://www.daum.net/");
		else
			resp.sendRedirect("http://www.naver.com/");
		//이 응답을 받으면 url로 리퀘스트를 날려라 라는 명령
	}

}
