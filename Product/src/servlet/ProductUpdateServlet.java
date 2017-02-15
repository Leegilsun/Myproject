package servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.ProductDao;
import model.Product;

@WebServlet("/productUpdate.do")
public class ProductUpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = req.getParameter("code");
		
		ProductDao dao = ProductDao.getInstance();
		Product product = dao.SelectProductByCode(code);
		
		req.setAttribute("product", product);
		
		req.getRequestDispatcher("product/productUpdate.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("upload");
		String encType = "utf-8";
		int sizeLimit = 20 *1024*1024;
		
		MultipartRequest multi  = new MultipartRequest(req, path, sizeLimit, encType, new DefaultFileRenamePolicy());
		
		String code = multi.getParameter("code");
		String name = multi.getParameter("name");
		int price = Integer.parseInt(multi.getParameter("price"));
		String description = multi.getParameter("description");
		String pictureUrl = multi.getFilesystemName("pictureUrl");
		if(pictureUrl==null){
			pictureUrl=multi.getParameter("nonmakeImg");
		}
		
		Product product = new Product();
		product.setCode(Integer.parseInt(code));
		product.setName(name);
		product.setPrice(price);
		product.setDescription(description);
		product.setPictureUrl(pictureUrl);
		
		ProductDao dao = ProductDao.getInstance();
		dao.updateProduct(product);
		
		resp.sendRedirect("productList.do");
	}

}
