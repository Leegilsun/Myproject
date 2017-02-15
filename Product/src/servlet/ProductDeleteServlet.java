package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

@WebServlet("/productDelete.do")
public class ProductDeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = req.getParameter("code");
		
		ProductDao dao = ProductDao.getInstance();
		Product product = dao.SelectProductByCode(code);
		
		req.setAttribute("product", product);
		req.getRequestDispatcher("product/productDelete.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = req.getParameter("code");
		
		ProductDao dao = ProductDao.getInstance();
		dao.deleteProduct(code);
		
		resp.sendRedirect("productList.do");
	}
	
	

}
