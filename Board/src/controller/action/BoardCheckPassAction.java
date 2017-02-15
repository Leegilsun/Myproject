package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import model.Board;

public class BoardCheckPassAction implements Action{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url=null;
		
		String num = req.getParameter("num");
		String pass = req.getParameter("pass");
		
		BoardDao dao = BoardDao.getInstance();
		Board board = dao.SelectOneBoardByNum(num);
		
		if(board.getPass().equals(pass)){
			url="/board/boardCheckSuccess.jsp";
		}
		else {
			url="/board/boardCheckPass.jsp";
			req.setAttribute("message", "비밀번호가 틀렷습니다.");
		}
		
		req.getRequestDispatcher(url).forward(req, resp);
	}
	

}
