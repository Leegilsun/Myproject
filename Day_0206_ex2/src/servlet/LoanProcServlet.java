package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Loan;

@WebServlet("/loanProc.do")
public class LoanProcServlet extends HttpServlet{
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int amount = Integer.parseInt(req.getParameter("amount"));
		int rateInt = Integer.parseInt(req.getParameter("rate"));
		int period = Integer.parseInt(req.getParameter("period"));
		int type = Integer.parseInt(req.getParameter("type"));
		
		
		
		double rateYear = (double)rateInt / 100;//입력받은 이율이 %이므로 실수로 변환
		double rateMonth = rateYear / 12;//연이율을 월이율로 변환
		int repayMonth;
		repayMonth = (int) ((amount * rateMonth * Math.pow((1 + rateMonth), period))
				/ (Math.pow((1 + rateMonth), period) - 1));
		List<Loan> list = new ArrayList<Loan>();
		for(int i = 0; i < period; i++)
		{
			Loan loan = new Loan();
			int thisMonthRate = (int)(amount * rateMonth);//이번달 이자
			int thisMonthRepayOrigin = (repayMonth - thisMonthRate);
			amount = amount - thisMonthRepayOrigin;
			loan.idx = i + 1;
			loan.thisMonthOrigin = thisMonthRepayOrigin;
			loan.thisMonthRate = thisMonthRate;
			loan.amount = amount;
			loan.repayMonth = repayMonth;
			list.add(loan);
		}
		
		req.setAttribute("result", list);
		req.getRequestDispatcher("layout.do?type=loanResult")
		.forward(req, resp);
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
