package db_v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/account_db", "root", "mysql");

			boolean run = true;
			while(run){
				System.out.println("1.계좌생성 | 2.계좌삭제 | 3.계좌주 변경 | 4.종료");
				int num  = scan.nextInt();
				if(num ==1) {
					System.out.print("계좌 입력");
					int ano = scan.nextInt();
					System.out.print("계좌주 입력");
					String owner = scan.next();
					System.out.print("초기 입금액");
					int balance = scan.nextInt();
					
					String sql = "insert into account values(?,?,?)";
					PreparedStatement pstmt = connection.prepareStatement(sql);
					pstmt.setInt(1, ano);
					pstmt.setString(2, owner);
					pstmt.setInt(3, balance);
					pstmt.executeUpdate();
					pstmt.close();
				} else if(num==2) {
					System.out.print("지우고 싶은 계좌번호");
					int where = scan.nextInt();
					String sql2 = "delete from account where ano like ?";
					PreparedStatement pstmt2 = connection.prepareStatement(sql2);
					pstmt2.setInt(1, where);
					pstmt2.executeUpdate();
					pstmt2.close();
				} else if(num==3){
					System.out.print("변경 하고 싶은 계좌주를 입력");
					String changeOwner = scan.next();
					System.out.print("계좌주를  변경할 계좌번호");
					int changeAno = scan.nextInt();
					String sql3 = "update account set owner = ? where ano like ?";
					PreparedStatement pstmt3 = connection.prepareStatement(sql3);
					pstmt3.setString(1, changeOwner);
					pstmt3.setInt(2, changeAno);
					pstmt3.executeUpdate();
					pstmt3.close();
				}else if(num==4)
					run = false;
			}
			System.out.println ("완료");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
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
