package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Member;

@WebServlet("/MemberSerlvet")
public class MemberServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("이길선","본치킨8호점"));
		list.add(new Member("전현준","로네펠트너"));
		list.add(new Member("고석현","정은지가터벨트"));
		req.setAttribute("list",list);
		req.getRequestDispatcher("09_el.jsp").forward(req, resp);
	}

	
	
}
