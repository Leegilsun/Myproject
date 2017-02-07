package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.Member;

@WebServlet("/memberSelectAll")
public class MemberSelectAll extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDao dao = MemberDao.getInstance();
		
		List<Member> list = dao.selectAll();
		
		req.setAttribute("msg", list);
		req.getRequestDispatcher("memberServlet?type=selectAllResult").forward(req, resp);
	}
}
