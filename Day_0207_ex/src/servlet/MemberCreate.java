package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.Member;

@WebServlet("/memberCreate")
public class MemberCreate extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//회원가입
		Member member = new Member();
		MemberDao dao = MemberDao.getInstance();
		
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String name = req.getParameter("name");
			
			member.setId(id);
			member.setPwd(pwd);
			member.setName(name);
			dao.insertMember(member);
			String msg = "회원가입완료";
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("memberServlet?type=createResult").forward(req, resp);
	}

}
