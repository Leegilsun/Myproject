package noclass_account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//하나하나씩 함수를 만들어 사용
public class AccountTest {
	private static Connection connection = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/account_db", "root", "mysql");
			
			boolean run = true;
			while(run){
				System.out.println("1.계좌생성 | 2.계좌수정 | 3.계좌삭제 | 4.종료");
				int num  = scan.nextInt();
				if(num ==1) {
					System.out.print("계좌 입력");
					String ano = scan.next();
					System.out.print("계좌주 입력");
					String owner = scan.next();
					System.out.print("초기 입금액");
					int balance = scan.nextInt();
					
					insertAccount(ano, owner, balance);
					
					
				} else if(num==2) {
					System.out.print("계좌 입력");
					String ano = scan.next();
					System.out.print("계좌주 입력");
					String owner = scan.next();
					System.out.print("초기 입금액");
					int balance = scan.nextInt();
					
					updateAccount(ano, owner, balance);
					
				} else if(num==3){
					System.out.print("계좌 입력");
					String ano = scan.next();
					
					deleteAccount(ano);
					
				}else if(num==4)
					run = false;
			}
			System.out.println ("완료");

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

	public static void insertAccount(String ano, String owner, int balance) {
		// insertAccount는 connection객체를 이용해서
		// 매개변수로 받은 계좌정보를 넣어서 구문객체를 만들어 sql문 제출
		// insert하기 위해서 필요한 정보
		// Statement구문은 Connection 이용해서 내가 직접 연동
		String sql = "insert into account values(?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, ano);
			pstmt.setString(2, owner);
			pstmt.setInt(3, balance);
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

	public static void updateAccount(String ano, String owner, int balance) {
		//계좌번호, 계좌주, 금액을 입력받아서 계좌번호에 해당하는  레코드의
		//계좌주와 금액정보를 받은 값으로 수정
		String sql = "update account set owner=?, balance=? where ano = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void deleteAccount(String ano) {
		String sql = "delete from account where ano = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, ano);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
