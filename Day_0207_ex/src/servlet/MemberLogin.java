package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;

@WebServlet("/memberLogin")
public class MemberLogin extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDao dao = MemberDao.getInstance();
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String url = "";
		if(id.equals(dao.selectOne(id).getId()) && pwd.equals(dao.selectOne(id).getPwd())) {
			resp.sendRedirect("login_result.jsp");
		}
		else {
			req.getRequestDispatcher("memberServlet?type=loginfalse").forward(req, resp);
		}
		
		
	}

}
