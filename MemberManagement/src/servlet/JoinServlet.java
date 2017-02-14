package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import model.Member;

@WebServlet("/join.do")
public class JoinServlet extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("member/join.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		String userid = req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		int admin = Integer.parseInt(req.getParameter("admin"));
		
		Member member = new Member();
		member.setName(name);
		member.setUserid(userid);
		member.setPwd(pwd);
		member.setEmail(email);
		member.setPhone(phone);
		member.setAdmin(admin);
		
		MemberDao dao = MemberDao.getInstance();
		int result = dao.insertMember(member);
		
		HttpSession session = req.getSession();
		
		if(result == 1) {
			session.setAttribute("userid", member.getUserid());
			req.setAttribute("msg", "회원 가입에 성공했습니다.");
		} else {
			req.setAttribute("msg", "회원 가입에 실패했습니다.");
		}
		
		req.getRequestDispatcher("member/login.jsp").forward(req, resp);
	}
	

}
