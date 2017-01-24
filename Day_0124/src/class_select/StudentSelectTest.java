package class_select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSelectTest {
	private static String URL = "jdbc:mysql://127.0.0.1/student_db";
	private static String USERNAME = "root";
	private static String PASSWORD = "mysql";
	static Connection connection = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentDao dao = StudentDao.getInstance();

		// connection을 사용..
		Student student = new Student();
		boolean run = true;
		while (run) {
			System.out.println("1.학생생성 | 2.학생수정| 3.학생삭제 | 4.전체학생조회 | 5.학생검색 | 6.종료");
			int num = scan.nextInt();
			if (num == 1) {
				dao.insertStudent(student);
			} else if (num == 2) {
				dao.updateStudent(student);
			} else if (num == 3) {
				dao.deleteStudent(student);
			} else if (num == 4) {
				dao.selectAll();
			} else if (num == 5) {
				dao.selectOne(student);
			} else if (num == 6) {
				run = false;
				dao.close();
			}

		}

	}
}
