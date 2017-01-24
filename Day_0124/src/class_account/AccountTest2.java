package class_account;

import java.util.Scanner;

//공통된 것을 클래스에 묶어서 사용
public class AccountTest2 {
	public static void main(String[] args) {
		AccountDAO dao = AccountDAO.getInstance();
		Scanner scan = new Scanner(System.in);
		
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
				
				dao.insertAccount(ano, owner, balance);
				
				
			} else if(num==2) {
				System.out.print("계좌 입력");
				String ano = scan.next();
				System.out.print("계좌주 입력");
				String owner = scan.next();
				System.out.print("초기 입금액");
				int balance = scan.nextInt();
				
				dao.updateAccount(ano, owner, balance);
				
			} else if(num==3){
				System.out.print("계좌 입력");
				String ano = scan.next();
				
				dao.deleteAccount(ano);
				
			}else if(num==4)
				run = false;
		}
		System.out.println ("완료");
		dao.close();
	}
}
