package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

@WebServlet("*.do")
public class CustomerServlet extends HttpServlet{
	private CustomerService service = new CustomerServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=utf-8");
		req.setCharacterEncoding("utf-8");
		String contextPath = req.getContextPath() + "/";
		if( req.getRequestURI().equals( contextPath + "idCheck.do") ){
			//컨트롤러는 그냥 1.파라미터 받을거 있음 받고 2.서비스에게 연산부탁하고 3.연산결과를 응답할 뿐
			String id = req.getParameter("id");
			boolean isDuplicated = service.idCheck(id);
			String result = "{\"result\" : " +isDuplicated+ "}";
			resp.getWriter().println(result);
			return;
		} else if( req.getRequestURI().equals( contextPath + "join.do") ){
			String id = req.getParameter("id");
			String name = req.getParameter("name");
			String age =  req.getParameter("age");
			String tel = req.getParameter("tel");
			String addr = req.getParameter("addr");
			
			boolean flag = service.join(id, name, Integer.parseInt(age), tel, addr);
			String result = "{\"result\" : " +flag+ "}";
			resp.getWriter().println(result);
			return;
			
		} else if( req.getRequestURI().equals( contextPath + "list.do") ){
			List<Customer> list = service.getAllCustomer();
			String result = new Gson().toJson(list);
			resp.getWriter().println(result);
			return;
		} else if( req.getRequestURI().equals( contextPath + "delete.do") ){
			String id = req.getParameter("id");
			boolean flag = service.delete(id);
			String result = "{\"result\" : " +flag+ "}";
			resp.getWriter().println(result);
			return;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=utf-8");
		req.setCharacterEncoding("utf-8");
		doGet(req,resp);
	}

}
