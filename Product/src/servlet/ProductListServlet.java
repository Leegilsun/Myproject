package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

@WebServlet("/productList.do")
public class ProductListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProductDao dao = ProductDao.getInstance();
		
		List<Product> productList = dao.selectAllProducts();
		req.setAttribute("productList", productList);
		
		req.getRequestDispatcher("product/productList.jsp").forward(req, resp);
	}

}
