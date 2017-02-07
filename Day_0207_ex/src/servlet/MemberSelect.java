package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.Member;

@WebServlet("/memberSelect")
public class MemberSelect extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDao dao = MemberDao.getInstance();
		
			String id = req.getParameter("id");
			
			Member member = dao.selectOne(id);
			String msg = member.toString();
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("/select/select_result.jsp").forward(req, resp);
	}
	
}
