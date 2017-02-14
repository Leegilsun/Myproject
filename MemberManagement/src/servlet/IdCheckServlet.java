package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;

@WebServlet("/idCheck.do")
public class IdCheckServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid=req.getParameter("userid");
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.confirmID(userid);
		
		req.setAttribute("userid", userid);
		req.setAttribute("result", result);
		req.getRequestDispatcher("member/idcheck.jsp").forward(req, resp);
	}

}
