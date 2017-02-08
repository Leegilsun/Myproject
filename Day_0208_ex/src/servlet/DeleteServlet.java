package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StockDao;
import model.Stock;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = req.getParameter("code");	
		StockDao dao = StockDao.getInstance();
		Stock stock = dao.selectCode(code);
		System.out.println(stock.getCode());
		if(stock != null) {
			if(stock.getCode().equals(code)) {
				dao.deleteStock(stock);
				String msg = "삭제가 완료되었습니다.";
				req.setAttribute("msg", msg);
				req.getRequestDispatcher("/delete/delete_complete.jsp").forward(req, resp);
			} else {
				String msg = "존재하지 않는 상품 코드 입니다.";
				req.setAttribute("msg", msg);
				req.getRequestDispatcher("/delete/delete_false.jsp").forward(req, resp);
			}
		} else {
			String msg = "존재하지 않는 상품 코드 입니다.";
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("/delete/delete_false.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProc(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProc(req, resp);
	}

}
