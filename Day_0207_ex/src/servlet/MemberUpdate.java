package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.Member;

@WebServlet("/memberUpdate")
public class MemberUpdate extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Member member = new Member();
		MemberDao dao = MemberDao.getInstance();
		
			String id = req.getParameter("id");
			String name = req.getParameter("name");
			
			member.setId(id);
			dao.updateMember(name, member);
			String msg = "수정 완료 ";
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("memberServlet?type=updateResult").forward(req, resp);
	}

}
