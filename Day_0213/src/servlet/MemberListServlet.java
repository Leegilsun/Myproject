package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.Member;

public class MemberListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Member>list = new ArrayList<Member>();
		MemberDao dao = MemberDao.getInstance();
		list = dao.selectAll();
		req.setAttribute("list", list);
		req.getRequestDispatcher("memberList.jsp").forward(req, resp);
	}

}
