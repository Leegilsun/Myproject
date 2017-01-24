import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSelectTest {
	private static final String URL = "jdbc:mysql://127.0.0.1/student_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "mysql"; 
	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String sql = "select * from student where id=?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			pstmt.setInt(1, 1);
			while(rs.next()){//다음 이동할 곳이 있는지 확인하고 있으면 한칸 이동후 true리턴
				int s_id = rs.getInt(1);
				String name = rs.getString("name");
				int age = rs.getInt(3);
				int score = rs.getInt(4);
				System.out.println(s_id + " " +name+" "+age+" " +score);
			}
			pstmt.close();
			rs.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
