package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import model.Member;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="member/login.jsp";
		
		String userid = req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		
		MemberDao dao = MemberDao.getInstance();
		int result = dao.userCheck(userid, pwd);
		
		if(result == 1) {
			Member member = dao.getMember(userid);
			HttpSession session = req.getSession();
			session.setAttribute("loginUser", member);
			req.setAttribute("msg", "회원가입에 성공했습니다.");
			url = "main.jsp";
		} else if(result == 0) {
			req.setAttribute("msg", "비번 틀렸다 이놈아");
		} else if(result == -1) {
			req.setAttribute("msg", "가입한적 없다 이놈아");
		}
		req.getRequestDispatcher(url).forward(req, resp);
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("member/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProc(req, resp);
	}
	
}
