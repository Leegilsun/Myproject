package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.action.Action;

@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet{
	
	public BoardServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String command = req.getParameter("command");
		System.out.println("BoardServlet에서 요청을 받음을 확인 : "+command);
		
		ActionFactory af = ActionFactory.getInstance();
		Action action=af.getAction(command);
		
		if(action != null) {
			action.execute(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		doGet(req, resp);
	}

}
