package all_book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import class_select.Student;

public class BookDao {
	private Connection connection = null;
	private static final String URL = "jdbc:mysql://127.0.0.1/book_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "mysql";
	private static BookDao instance;
	private static Scanner scan = new Scanner(System.in);

	public static BookDao getInstance() {
		if (instance == null)
			instance = new BookDao();
		return instance;
	}

	private BookDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertBook(Book book) {
		String sql = "insert into books values(0,?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			System.out.print("책 제목 : ");
			book.setTitle(scan.next());
			System.out.print("책 출판사 : ");
			book.setPub(scan.next());
			System.out.print("책 출판년도 : ");
			book.setYear(scan.next());
			System.out.print("책 가격 : ");
			book.setPrice(scan.nextInt());
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getPub());
			pstmt.setString(3, book.getYear());
			pstmt.setInt(4, book.getPrice());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateBook(Book book) {
		String sql = "update books set title=?, price=? where book_id=?";
		PreparedStatement pstmt = null;
		try {
			System.out.print("정보를 바꿀 책의 id : ");
			book.setId(scan.nextInt());
			System.out.print("책 제목 : ");
			book.setTitle(scan.next());
			System.out.print("책 가격 : ");
			book.setPrice(scan.nextInt());
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setInt(2, book.getPrice());
			pstmt.setInt(3, book.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteBook(Book book) {
		String sql = "delete from books where book_id=?";
		PreparedStatement pstmt = null;
		try {
			System.out.print("정보를 삭제할 책의 id : ");
			book.setId(scan.nextInt());
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, book.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Book selectOne(Book book) {
		String sql = "select * from books where book_id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			System.out.println("검색할 책의 id : ");
			book.setId(scan.nextInt());
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, book.getId());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				book = new Book();
				book.setId(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setPub(rs.getString(3));
				book.setYear(rs.getString(4));
				book.setPrice(rs.getInt(5));
				System.out.println(book.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return book;
	}

	public List<Book> selectAll() {
		Book book = null;
		List<Book> list = new ArrayList<Book>();
		String sql = "select * from books";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				book = new Book();
				book.setId(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setPub(rs.getString(3));
				book.setYear(rs.getString(4));
				book.setPrice(rs.getInt(5));
				list.add(book);
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public void close() {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
