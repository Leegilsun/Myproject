package clss_book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDao {
	private Connection connection = null;
	private static final String URL = "jdbc:mysql://127.0.0.1/book_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "mysql"; 
	private static BookDao instance;
	
	public static BookDao getInstance(){
		if(instance == null)
			instance = new BookDao();
		return instance;
	}
	
	private BookDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertBook(String title, String pub, String year, int price) {
		String sql = "insert into books values(0,?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, pub);
			pstmt.setString(3, year);
			pstmt.setInt(4, price);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateBook(int id, String title, int price) {
		String sql = "update books set title=?, price=? where book_id=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setInt(2, price);
			pstmt.setInt(3, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteBook(int id) {
		String sql = "delete from books where book_id=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
