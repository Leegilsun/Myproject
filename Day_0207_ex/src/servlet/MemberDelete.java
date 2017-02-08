package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.Member;

@WebServlet("/memberDelete")
public class MemberDelete extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Member member = new Member();
		MemberDao dao = MemberDao.getInstance();
		
			String type = req.getParameter("type");
		
			String id = req.getParameter("id");
			
			if(type == null) {
				member.setId(id);
				dao.deleteMember(member);
				
			}
			else if(id == null) {
				member.setId(type);
				dao.deleteMember(member);
			}
			String msg = "삭제 완료 ";
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("/delete/delete_result.jsp").forward(req, resp);
	}
	

}
