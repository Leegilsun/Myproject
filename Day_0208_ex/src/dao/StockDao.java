package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Stock;

public class StockDao {
	private static Connection connection;
	private static String URL = "jdbc:mysql://127.0.0.1/stock_db";
	private static String USERNAME = "root";
	private static String PASSWORD = "mysql";
	
	private static StockDao instance;
	
	public static StockDao getInstance(){
		if (instance == null) {
			instance = new StockDao();
		}
		return instance;
	}
	
	private StockDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
		} catch (SQLException e) {
			System.out.println("SQLException");
		}
	}
	
	public void deleteStock(Stock stock) {
		String sql = "delete from stock where code=?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, stock.getCode());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Stock selectCode(String code) {
		Stock stock = null;
		String sql = "select * from stock where code=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				stock = new Stock();
				stock.setCode(rs.getString("code"));
				stock.setName(rs.getString("name"));
				stock.setCnt(rs.getInt("cnt"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return stock;
	}
	
	public List<Stock> selectAll() {
		List<Stock> list = new ArrayList<Stock>();
		String sql = "select * from stock";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Stock stock = new Stock();
				stock.setCode(rs.getString("code"));
				stock.setName(rs.getString("name"));
				stock.setCnt(rs.getInt("cnt"));
				list.add(stock);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
