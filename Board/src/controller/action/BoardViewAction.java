package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import model.Board;

public class BoardViewAction implements Action{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/board/boardView.jsp";
		
		String num = req.getParameter("num");
		
		BoardDao dao = BoardDao.getInstance();
		
		dao.updateReadCount(num);
		
		Board board = dao.SelectOneBoardByNum(num);
		
		req.setAttribute("board", board);
		
		req.getRequestDispatcher(url).forward(req, resp);
	}

}
