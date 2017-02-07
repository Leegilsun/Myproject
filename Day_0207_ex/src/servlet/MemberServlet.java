package servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Member;
import sun.security.jca.GetInstance;
import dao.MemberDao;

@WebServlet("/memberServlet")
public class MemberServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type = req.getParameter("type");
		String url = "";
		if(type.equals("create")) {
			url += "../create/create_input.jsp";
		}
		else if(type.equals("createResult")) {
			url += "../create/create_result.jsp";
		}
		else if(type.equals("update")) {
			url += "../update/update_input.jsp";
		}
		else if(type.equals("updateResult")) {
			url += "../update/update_result.jsp";
		}
		else if(type.equals("delete")) {
			url += "../delete/delete_input.jsp";
		}
		else if(type.equals("deleteResult")) {
			url += "../delete/delete_result.jsp";
		}
		else if(type.equals("select")) {
			url += "../select/select_input.jsp";
		}
		else if(type.equals("selectResult")) {
			url += "../select/select_result.jsp";
		}
		else if(type.equals("selectAll")) {
			url += "../select/selectAll_input.jsp";
		}
		else if(type.equals("selectAllResult")) {
			url += "../select/selectAll_result.jsp";
		}
		else if(type.equals("login")) {
			url += "../login.jsp";
		}
		else if(type.equals("loginfalse")) {
			url += "../login.jsp";
		}
		req.setAttribute("url", url);
		req.getRequestDispatcher("main/memberTest.jsp").forward(req, resp);
		
	}

}
