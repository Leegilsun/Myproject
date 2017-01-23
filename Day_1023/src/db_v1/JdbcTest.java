package db_v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTest {
	public static void main(String[] args) {
		Connection connection = null;
		Scanner scan = new Scanner(System.in);
		try {
			// 드라이버 객체
			Class.forName("com.mysql.jdbc.Driver");

			// 연결 및 커넥션 객체 획득 (접속주소, 아이디, 비번)
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/book_db", "root", "mysql");

			// 사용할 sql문을 Statement구문 객체로 준비
			System.out.print("제목 입력 >");
			String title = scan.nextLine();
			System.out.print("출판사 입력 >");
			String pub = scan.nextLine();
			System.out.print("년도 입력 >");
			String year = scan.nextLine();
			System.out.print("가격 입력 >");
			int price = scan.nextInt();
			//거지같음 그래서 Statement구문객체중에 변수값을 끼어넣기 편리한 녀석이 있음 --> PreparedStatement
			//PreparedStatemnet사용방법 : 사용할 sql문에서 자바 변수로 채울공간을 ? 로 냅둔 상태로 sql문 준비
//			String sql = "insert into books values(0,'" + title + "','" + pub + "','" + year + "'," + price + ")";
//			Statement stmt = connection.createStatement();
			String sql = "insert into books values(0,?,?,?,?)";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, pub);
			pstmt.setString(3, year);
			pstmt.setInt(4, price);
			
			// 준비된 구문객체 제출
			int result = pstmt.executeUpdate(); // 반환값이
			pstmt.close();
			System.out.println(result + "개의 행이 영향을 받았음");

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
