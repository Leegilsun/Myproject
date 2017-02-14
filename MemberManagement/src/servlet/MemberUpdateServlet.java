package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.Member;

@WebServlet("/memberUpdate.do")
public class MemberUpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid = req.getParameter("userid");
		MemberDao dao = MemberDao.getInstance();
		
		Member member = dao.getMember(userid);
		req.setAttribute("member", member);
		
		req.getRequestDispatcher("member/memberUpdate.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		
		String userid= req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		int admin = Integer.parseInt(req.getParameter("admin"));
		
		Member member = new Member();
		member.setUserid(userid);
		member.setPwd(pwd);
		member.setEmail(email);
		member.setPhone(phone);
		member.setAdmin(admin);
		
		MemberDao dao = MemberDao.getInstance();
		dao.updateMember(member);
		resp.sendRedirect("login.do");
	}
	
	

}
