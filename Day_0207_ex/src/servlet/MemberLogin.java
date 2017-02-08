package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.Member;

@WebServlet("/memberLogin")
public class MemberLogin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDao dao = MemberDao.getInstance();
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		Member member = MemberDao.getInstance().selectOne(id);

		if (member != null) {
			if (member.getId().equals(id) && member.getPwd().equals(pwd)) {
				Cookie c = new Cookie("id", dao.selectOne(id).getId());
				resp.addCookie(c);
				resp.sendRedirect("login_result.jsp");
			} else {
				req.getRequestDispatcher("memberServlet?type=loginfalse").forward(req, resp);
			}
		} else
			req.getRequestDispatcher("memberServlet?type=loginfalse").forward(req, resp);

	}

}
