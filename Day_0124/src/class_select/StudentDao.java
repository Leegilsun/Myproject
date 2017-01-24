package class_select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
	private Connection connection;
	private static String URL = "jdbc:mysql://127.0.0.1/student_db";
	private static String USERNAME = "root";
	private static String PASSWORD = "mysql";
	private static StudentDao instance;
	private static Scanner scan = new Scanner(System.in);

	public static StudentDao getInstance() {
		if (instance == null) {
			instance = new StudentDao();
		}
		return instance;
	}

	private StudentDao() {
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

	public void insertStudent(Student student) {
		String sql = "insert into student values(0,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			System.out.print("이름 :");
			student.setName(scan.next());
			System.out.print("나이 :");
			student.setAge(scan.nextInt());
			System.out.print("점수 :");
			student.setScore(scan.nextInt());
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getAge());
			pstmt.setInt(3, student.getScore());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
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
	}

	public void updateStudent(Student student) {
		String sql = "update student set name=?, age=?, score=? where id=?";
		PreparedStatement pstmt = null;
		try {
			System.out.print("변경할 학생의id :");
			student.setS_id(scan.nextInt());
			System.out.print("이름 :");
			student.setName(scan.next());
			System.out.print("나이 :");
			student.setAge(scan.nextInt());
			System.out.print("점수 :");
			student.setScore(scan.nextInt());
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getAge());
			pstmt.setInt(3, student.getScore());
			pstmt.setInt(4, student.getS_id());
			pstmt.executeUpdate();
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
	}

	public void deleteStudent(Student student) {
		String sql = "delete from student where id=?";
		PreparedStatement pstmt = null;
		try {
			System.out.print("삭제할 학생의 id :");
			student.setS_id(scan.nextInt());
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, student.getS_id());
			pstmt.executeLargeUpdate();
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

	public Student selectOne(Student student) {
		String sql = "select * from student	where id = ?";// sql준비하는건 같음
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			System.out.print("검색할 학생의 id :");
			student.setS_id(scan.nextInt());
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, student.getS_id());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				student = new Student();
				student.setS_id(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				student.setScore(rs.getInt("score"));
				System.out.println(student.toString());
			}
		} catch (SQLException e) {

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
	}

	public List<Student> selectAll() {
		List<Student> list = new ArrayList<Student>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from student";
		try {
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setS_id(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				student.setScore(rs.getInt("score"));
				list.add(student);
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					;
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

}
